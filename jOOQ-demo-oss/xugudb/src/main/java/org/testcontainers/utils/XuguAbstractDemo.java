package org.testcontainers.utils;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.flywaydb.core.Flyway;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.conf.MappedSchema;
import org.jooq.conf.RenderMapping;
import org.jooq.conf.Settings;
import org.jooq.demo.AbstractDemo;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.tools.JooqLogger;
import org.jooq.tools.jdbc.SingleConnectionDataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.model.Statement;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.XuguDBContainer;
import org.testcontainers.utility.ResourceReaper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.impl.DSL.using;

/**
 * A common base class for demo code, taking care of setting up a JDBC connection and a {@link DSLContext}.
 */
public abstract class XuguAbstractDemo {

    protected static JooqLogger          log = JooqLogger.getLogger(AbstractDemo.class);
    protected static XuguDBContainer db;
    protected static DataSource          jdbc;
    protected static ConnectionFactory   r2dbc;
    protected static DSLContext          ctx;
    protected static Configuration       configuration;

    // Utilities
    // -----------------------------------------------------------------------------------------------------------------

    @BeforeClass
    public static void beforeClass() throws SQLException {
        log.info("Setting up testcontainers");
        db = new XuguDBContainer("xugudb/xugudb:v12");

        db.start();

        log.info("Connecting");

        // Replace with a connection pool if appropriate
        Connection connection = DriverManager.getConnection(
                db.getJdbcUrl(),
                db.getUsername(),
                db.getPassword()
        );
        jdbc = new SingleConnectionDataSource(connection);


        // Replace with an r2dbc-pool based connection pool, if appropriate
//        r2dbc = ConnectionFactories.get(ConnectionFactoryOptions
//            .parse(db.getJdbcUrl().replace("jdbc:", "r2dbc:"))
//            .mutate()
//            .option(ConnectionFactoryOptions.USER, db.getUsername())
//            .option(ConnectionFactoryOptions.PASSWORD, db.getPassword())
//            .build()
//        );

        Configuration config = new DefaultConfiguration();
        Settings settings = new Settings()
                .withRenderMapping(new RenderMapping()
                        .withSchemata(
                                new MappedSchema().withInput("test")
                                        .withOutput("test")));
        config.set(settings);

        ctx = using(configuration = new DefaultConfiguration()
            
            // You can configure jOOQ with a JDBC and/or an R2DBC Connection and/or DataSource/ConnectionFactory
            // If both are provided, then blocking calls will be run on the JDBC Connection or DataSource, whereas
            // non-blocking calls are run on the R2DBC Connection or ConnectionFactory. Blocking calls are annotated
            // as @org.jetbrains.annotations.Blocking
            .set(jdbc)
            .set(r2dbc)
            .set(POSTGRES)
            .set(new Settings()
                .withRenderFormatted(true)
            )
            .set(settings)

//            // Activate this to get the output from different dialects
//            .set(ExecuteListener.onExecuteStart(e -> Stream
//                .of(MYSQL, ORACLE, POSTGRES, SQLSERVER)
//                .map(d -> using(d, new Settings().withRenderFormatted(true)))
//                .forEach(c -> {
//                    title(c.dialect());
//                    println(c.renderInlined(e.query()));
//                })))
        );
        ctx.setSchema("test");

        // Initialise classes
        ctx.selectOne().toString();
//        log.info("Finished setup");
//
//        log.info("Flyway migration");
//        Flyway.configure()
//              .locations("filesystem:D:\\Project\\Demo\\xugudb\\src\\main\\resources\\sakila\\xugu")
//              .dataSource(db.getJdbcUrl(), db.getUsername(), db.getPassword())
//              .baselineOnMigrate(true)
//              .load()
//              .migrate();
    }

    @AfterClass
    public static void end() {
        if (db != null) {
            ResourceReaper.instance().stopAndRemoveContainer(db.getContainerId(), db.getDockerImageName());
        }
    }

    @Before
    public void setup() throws SQLException {
    }
    
    @After
    public void teardown() throws SQLException {
    }

    public void cleanup(Table<?> actor, Field<Long> actorId) {
        ctx.delete(actor)
           .where(actorId.gt(200L))
           .execute();
    }

    public static void title(Object title) {
        println("");
        println(title);
        println("-".repeat(("" + title).length()));
    }

    public static <T> T println(T t) {
        System.out.println(t);
        return t;
    }
}

package org.testcontainers.containers;

import org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

/**
 * @Classname XuguDBContainer
 * @Description TODO
 * @Date 2024/9/9 9:50
 * @Created by admin
 */
public class XuguDBContainer<SELF extends XuguDBContainer<SELF>> extends JdbcDatabaseContainer<SELF> {

    // 默认镜像名
    private static final DockerImageName DEFAULT_IMAGE_NAME = DockerImageName.parse("xugudb/xugudb");
    public static final Integer XUGUDB_PORT = 5138;


    public XuguDBContainer(String dockerImageName) {
        this(DockerImageName.parse(dockerImageName));
    }

    public XuguDBContainer(final DockerImageName dockerImageName) {
        super(dockerImageName);

        dockerImageName.assertCompatibleWith(DEFAULT_IMAGE_NAME);

        this.waitStrategy = new LogMessageWaitStrategy()
                .withRegEx(".*database system is ready to accept connections.*\\s")
                .withTimes(2)
                .withStartupTimeout(Duration.of(60, SECONDS));
        this.setCommand("sh /XGDBMS/BIN/xugu_start.sh");

        addExposedPort(XUGUDB_PORT);
    }

    @Override
    public String getDriverClassName() {
        return "com.xugu.cloudjdbc.Driver";
    }

    @Override
    public String getJdbcUrl() {
        //todo 不要写死
        System.out.println(111111);
//        return "jdbc:xugu://172.21.182.235:" + getMappedPort(XUGUDB_PORT)
//                + "/system";

        return "jdbc:xugu://127.0.0.1:5138/system?current_schema=test";
    }

    @Override
    public String getUsername() {
        return "SYSDBA";
    }

    @Override
    public String getPassword() {
        return "SYSDBA";
    }

    @Override
    protected String getTestQueryString() {
        return "select 1";
    }

    @Override
    public SELF withReuse(boolean reusable) {
        return super.withReuse(reusable);
    }
}

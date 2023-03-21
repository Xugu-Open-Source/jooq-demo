/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.demo.kotlin.db.Public;
import org.jooq.demo.kotlin.db.tables.records.FilmNotInStockRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmNotInStock extends TableImpl<FilmNotInStockRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film_not_in_stock</code>
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = new FilmNotInStock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmNotInStockRecord> getRecordType() {
        return FilmNotInStockRecord.class;
    }

    /**
     * The column <code>public.film_not_in_stock.p_film_count</code>.
     */
    public final TableField<FilmNotInStockRecord, Integer> P_FILM_COUNT = createField(DSL.name("p_film_count"), SQLDataType.INTEGER, this, "");

    private FilmNotInStock(Name alias, Table<FilmNotInStockRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT),
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private FilmNotInStock(Name alias, Table<FilmNotInStockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.film_not_in_stock</code> table reference
     */
    public FilmNotInStock(String alias) {
        this(DSL.name(alias), FILM_NOT_IN_STOCK);
    }

    /**
     * Create an aliased <code>public.film_not_in_stock</code> table reference
     */
    public FilmNotInStock(Name alias) {
        this(alias, FILM_NOT_IN_STOCK);
    }

    /**
     * Create a <code>public.film_not_in_stock</code> table reference
     */
    public FilmNotInStock() {
        this(DSL.name("film_not_in_stock"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public FilmNotInStock as(String alias) {
        return new FilmNotInStock(DSL.name(alias), this, parameters);
    }

    @Override
    public FilmNotInStock as(Name alias) {
        return new FilmNotInStock(alias, this, parameters);
    }

    @Override
    public FilmNotInStock as(Table<?> alias) {
        return new FilmNotInStock(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmNotInStock rename(String name) {
        return new FilmNotInStock(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmNotInStock rename(Name name) {
        return new FilmNotInStock(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmNotInStock rename(Table<?> name) {
        return new FilmNotInStock(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public FilmNotInStock call(
          Long pFilmId
        , Long pStoreId
    ) {
        FilmNotInStock result = new FilmNotInStock(DSL.name("film_not_in_stock"), null, new Field[] {
            DSL.val(pFilmId, SQLDataType.BIGINT),
            DSL.val(pStoreId, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public FilmNotInStock call(
          Field<Long> pFilmId
        , Field<Long> pStoreId
    ) {
        FilmNotInStock result = new FilmNotInStock(DSL.name("film_not_in_stock"), null, new Field[] {
            pFilmId,
            pStoreId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}

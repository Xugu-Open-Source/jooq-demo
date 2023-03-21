/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables;


import java.math.BigDecimal;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.demo.kotlin.db.Public;
import org.jooq.demo.kotlin.db.enums.MpaaRating;
import org.jooq.demo.kotlin.db.tables.records.NicerButSlowerFilmListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NicerButSlowerFilmList extends TableImpl<NicerButSlowerFilmListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.nicer_but_slower_film_list</code>
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new NicerButSlowerFilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NicerButSlowerFilmListRecord> getRecordType() {
        return NicerButSlowerFilmListRecord.class;
    }

    /**
     * The column <code>public.nicer_but_slower_film_list.fid</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, Long> FID = createField(DSL.name("fid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.title</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.description</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.category</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.price</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.length</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, Short> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.rating</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, MpaaRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR.asEnumDataType(org.jooq.demo.kotlin.db.enums.MpaaRating.class), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.actors</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> ACTORS = createField(DSL.name("actors"), SQLDataType.CLOB, this, "");

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased) {
        this(alias, aliased, null);
    }

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "nicer_but_slower_film_list" as  SELECT film.film_id AS fid,
          film.title,
          film.description,
          category.name AS category,
          film.rental_rate AS price,
          film.length,
          film.rating,
          group_concat((((upper("substring"((actor.first_name)::text, 1, 1)) || lower("substring"((actor.first_name)::text, 2))) || upper("substring"((actor.last_name)::text, 1, 1))) || lower("substring"((actor.last_name)::text, 2)))) AS actors
         FROM ((((category
           LEFT JOIN film_category ON ((category.category_id = film_category.category_id)))
           LEFT JOIN film ON ((film_category.film_id = film.film_id)))
           JOIN film_actor ON ((film.film_id = film_actor.film_id)))
           JOIN actor ON ((film_actor.actor_id = actor.actor_id)))
        GROUP BY film.film_id, film.title, film.description, category.name, film.rental_rate, film.length, film.rating;
        """));
    }

    /**
     * Create an aliased <code>public.nicer_but_slower_film_list</code> table
     * reference
     */
    public NicerButSlowerFilmList(String alias) {
        this(DSL.name(alias), NICER_BUT_SLOWER_FILM_LIST);
    }

    /**
     * Create an aliased <code>public.nicer_but_slower_film_list</code> table
     * reference
     */
    public NicerButSlowerFilmList(Name alias) {
        this(alias, NICER_BUT_SLOWER_FILM_LIST);
    }

    /**
     * Create a <code>public.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList() {
        this(DSL.name("nicer_but_slower_film_list"), null);
    }

    public <O extends Record> NicerButSlowerFilmList(Table<O> child, ForeignKey<O, NicerButSlowerFilmListRecord> key) {
        super(child, key, NICER_BUT_SLOWER_FILM_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public NicerButSlowerFilmList as(String alias) {
        return new NicerButSlowerFilmList(DSL.name(alias), this);
    }

    @Override
    public NicerButSlowerFilmList as(Name alias) {
        return new NicerButSlowerFilmList(alias, this);
    }

    @Override
    public NicerButSlowerFilmList as(Table<?> alias) {
        return new NicerButSlowerFilmList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(String name) {
        return new NicerButSlowerFilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(Name name) {
        return new NicerButSlowerFilmList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(Table<?> name) {
        return new NicerButSlowerFilmList(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, BigDecimal, Short, MpaaRating, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super String, ? super String, ? super BigDecimal, ? super Short, ? super MpaaRating, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super String, ? super String, ? super BigDecimal, ? super Short, ? super MpaaRating, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}

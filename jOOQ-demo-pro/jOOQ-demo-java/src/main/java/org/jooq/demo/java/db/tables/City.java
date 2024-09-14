/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.demo.java.db.Indexes;
import org.jooq.demo.java.db.Keys;
import org.jooq.demo.java.db.Public;
import org.jooq.demo.java.db.tables.Address.AddressPath;
import org.jooq.demo.java.db.tables.Country.CountryPath;
import org.jooq.demo.java.db.tables.records.CityRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class City extends TableImpl<CityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.city</code>
     */
    public static final City CITY = new City();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityRecord> getRecordType() {
        return CityRecord.class;
    }

    /**
     * The column <code>public.city.city_id</code>.
     */
    public final TableField<CityRecord, Long> CITY_ID = createField(DSL.name("city_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.city.city</code>.
     */
    public final TableField<CityRecord, String> CITY_ = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.city.country_id</code>.
     */
    public final TableField<CityRecord, Long> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.city.last_update</code>.
     */
    public final TableField<CityRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    private City(Name alias, Table<CityRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private City(Name alias, Table<CityRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(String alias) {
        this(DSL.name(alias), CITY);
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(Name alias) {
        this(alias, CITY);
    }

    /**
     * Create a <code>public.city</code> table reference
     */
    public City() {
        this(DSL.name("city"), null);
    }

    public <O extends Record> City(Table<O> path, ForeignKey<O, CityRecord> childPath, InverseForeignKey<O, CityRecord> parentPath) {
        super(path, childPath, parentPath, CITY);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class CityPath extends City implements Path<CityRecord> {
        public <O extends Record> CityPath(Table<O> path, ForeignKey<O, CityRecord> childPath, InverseForeignKey<O, CityRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private CityPath(Name alias, Table<CityRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public CityPath as(String alias) {
            return new CityPath(DSL.name(alias), this);
        }

        @Override
        public CityPath as(Name alias) {
            return new CityPath(alias, this);
        }

        @Override
        public CityPath as(Table<?> alias) {
            return new CityPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_COUNTRY_ID);
    }

    @Override
    public Identity<CityRecord, Long> getIdentity() {
        return (Identity<CityRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CityRecord> getPrimaryKey() {
        return Keys.CITY_PKEY;
    }

    @Override
    public List<ForeignKey<CityRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CITY__CITY_COUNTRY_ID_FKEY);
    }

    private transient CountryPath _country;

    /**
     * Get the implicit join path to the <code>public.country</code> table.
     */
    public CountryPath country() {
        if (_country == null)
            _country = new CountryPath(this, Keys.CITY__CITY_COUNTRY_ID_FKEY, null);

        return _country;
    }

    private transient AddressPath _address;

    /**
     * Get the implicit to-many join path to the <code>public.address</code>
     * table
     */
    public AddressPath address() {
        if (_address == null)
            _address = new AddressPath(this, null, Keys.ADDRESS__ADDRESS_CITY_ID_FKEY.getInverseKey());

        return _address;
    }

    @Override
    public City as(String alias) {
        return new City(DSL.name(alias), this);
    }

    @Override
    public City as(Name alias) {
        return new City(alias, this);
    }

    @Override
    public City as(Table<?> alias) {
        return new City(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(String name) {
        return new City(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Name name) {
        return new City(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Table<?> name) {
        return new City(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City where(Condition condition) {
        return new City(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public City where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public City where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public City where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public City where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public City whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.demo.kotlin.db.tables.Country
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CountryRecord() : UpdatableRecordImpl<CountryRecord>(Country.COUNTRY), Record3<Long?, String?, LocalDateTime?> {

    open var countryId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var country: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Long?, String?, LocalDateTime?> = super.fieldsRow() as Row3<Long?, String?, LocalDateTime?>
    override fun valuesRow(): Row3<Long?, String?, LocalDateTime?> = super.valuesRow() as Row3<Long?, String?, LocalDateTime?>
    override fun field1(): Field<Long?> = Country.COUNTRY.COUNTRY_ID
    override fun field2(): Field<String?> = Country.COUNTRY.COUNTRY_
    override fun field3(): Field<LocalDateTime?> = Country.COUNTRY.LAST_UPDATE
    override fun component1(): Long? = countryId
    override fun component2(): String? = country
    override fun component3(): LocalDateTime? = lastUpdate
    override fun value1(): Long? = countryId
    override fun value2(): String? = country
    override fun value3(): LocalDateTime? = lastUpdate

    override fun value1(value: Long?): CountryRecord {
        this.countryId = value
        return this
    }

    override fun value2(value: String?): CountryRecord {
        this.country = value
        return this
    }

    override fun value3(value: LocalDateTime?): CountryRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: LocalDateTime?): CountryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    constructor(countryId: Long? = null, country: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.countryId = countryId
        this.country = country
        this.lastUpdate = lastUpdate
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    constructor(countryId: Long? = null, country: String? = null): this() {
        this.countryId = countryId
        this.country = country
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Country?): this() {
        if (value != null) {
            this.countryId = value.countryId
            this.country = value.country
            this.lastUpdate = value.lastUpdate
        }
    }
}

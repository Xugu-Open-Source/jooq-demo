/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.demo.kotlin.db.tables.City
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CityRecord() : UpdatableRecordImpl<CityRecord>(City.CITY), Record4<Long?, String?, Long?, LocalDateTime?> {

    open var cityId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var city: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var countryId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Long?, String?, Long?, LocalDateTime?> = super.fieldsRow() as Row4<Long?, String?, Long?, LocalDateTime?>
    override fun valuesRow(): Row4<Long?, String?, Long?, LocalDateTime?> = super.valuesRow() as Row4<Long?, String?, Long?, LocalDateTime?>
    override fun field1(): Field<Long?> = City.CITY.CITY_ID
    override fun field2(): Field<String?> = City.CITY.CITY_
    override fun field3(): Field<Long?> = City.CITY.COUNTRY_ID
    override fun field4(): Field<LocalDateTime?> = City.CITY.LAST_UPDATE
    override fun component1(): Long? = cityId
    override fun component2(): String? = city
    override fun component3(): Long? = countryId
    override fun component4(): LocalDateTime? = lastUpdate
    override fun value1(): Long? = cityId
    override fun value2(): String? = city
    override fun value3(): Long? = countryId
    override fun value4(): LocalDateTime? = lastUpdate

    override fun value1(value: Long?): CityRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): CityRecord {
        set(1, value)
        return this
    }

    override fun value3(value: Long?): CityRecord {
        set(2, value)
        return this
    }

    override fun value4(value: LocalDateTime?): CityRecord {
        set(3, value)
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: Long?, value4: LocalDateTime?): CityRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(cityId: Long? = null, city: String? = null, countryId: Long? = null, lastUpdate: LocalDateTime? = null): this() {
        this.cityId = cityId
        this.city = city
        this.countryId = countryId
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(cityId: Long? = null, city: String? = null, countryId: Long? = null): this() {
        this.cityId = cityId
        this.city = city
        this.countryId = countryId
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.City?): this() {
        if (value != null) {
            this.cityId = value.cityId
            this.city = value.city
            this.countryId = value.countryId
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}

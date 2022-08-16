/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.demo.kotlin.db.tables.Language
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LanguageRecord() : UpdatableRecordImpl<LanguageRecord>(Language.LANGUAGE), Record3<Long?, String?, LocalDateTime?> {

    open var languageId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var name: String?
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
    override fun field1(): Field<Long?> = Language.LANGUAGE.LANGUAGE_ID
    override fun field2(): Field<String?> = Language.LANGUAGE.NAME
    override fun field3(): Field<LocalDateTime?> = Language.LANGUAGE.LAST_UPDATE
    override fun component1(): Long? = languageId
    override fun component2(): String? = name
    override fun component3(): LocalDateTime? = lastUpdate
    override fun value1(): Long? = languageId
    override fun value2(): String? = name
    override fun value3(): LocalDateTime? = lastUpdate

    override fun value1(value: Long?): LanguageRecord {
        this.languageId = value
        return this
    }

    override fun value2(value: String?): LanguageRecord {
        this.name = value
        return this
    }

    override fun value3(value: LocalDateTime?): LanguageRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: LocalDateTime?): LanguageRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    constructor(languageId: Long? = null, name: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.languageId = languageId
        this.name = name
        this.lastUpdate = lastUpdate
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    constructor(languageId: Long? = null, name: String? = null): this() {
        this.languageId = languageId
        this.name = name
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Language?): this() {
        if (value != null) {
            this.languageId = value.languageId
            this.name = value.name
            this.lastUpdate = value.lastUpdate
        }
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.demo.kotlin.db.tables.Store
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StoreRecord() : UpdatableRecordImpl<StoreRecord>(Store.STORE) {

    open var storeId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var managerStaffId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var addressId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    open var fullAddress: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised StoreRecord
     */
    constructor(storeId: Long? = null, managerStaffId: Long? = null, addressId: Long? = null, lastUpdate: LocalDateTime? = null, fullAddress: String? = null): this() {
        this.storeId = storeId
        this.managerStaffId = managerStaffId
        this.addressId = addressId
        this.lastUpdate = lastUpdate
        this.fullAddress = fullAddress
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    constructor(storeId: Long? = null, managerStaffId: Long? = null, addressId: Long? = null, fullAddress: String? = null): this() {
        this.storeId = storeId
        this.managerStaffId = managerStaffId
        this.addressId = addressId
        this.fullAddress = fullAddress
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Store?): this() {
        if (value != null) {
            this.storeId = value.storeId
            this.managerStaffId = value.managerStaffId
            this.addressId = value.addressId
            this.lastUpdate = value.lastUpdate
            this.fullAddress = value.fullAddress
            resetChangedOnNotNull()
        }
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.demo.kotlin.db.tables.Inventory
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InventoryRecord() : UpdatableRecordImpl<InventoryRecord>(Inventory.INVENTORY) {

    open var inventoryId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var filmId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var storeId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised InventoryRecord
     */
    constructor(inventoryId: Long? = null, filmId: Long? = null, storeId: Long? = null, lastUpdate: LocalDateTime? = null): this() {
        this.inventoryId = inventoryId
        this.filmId = filmId
        this.storeId = storeId
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Inventory?): this() {
        if (value != null) {
            this.inventoryId = value.inventoryId
            this.filmId = value.filmId
            this.storeId = value.storeId
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}

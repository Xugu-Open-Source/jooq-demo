/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.demo.kotlin.db.tables.Actor
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ActorRecord() : UpdatableRecordImpl<ActorRecord>(Actor.ACTOR) {

    open var actorId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised ActorRecord
     */
    constructor(actorId: Long? = null, firstName: String? = null, lastName: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.actorId = actorId
        this.firstName = firstName
        this.lastName = lastName
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    constructor(actorId: Long? = null, firstName: String? = null, lastName: String? = null): this() {
        this.actorId = actorId
        this.firstName = firstName
        this.lastName = lastName
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Actor?): this() {
        if (value != null) {
            this.actorId = value.actorId
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}

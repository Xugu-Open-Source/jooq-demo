/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.math.BigDecimal
import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.demo.kotlin.db.tables.Payment
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PaymentRecord() : UpdatableRecordImpl<PaymentRecord>(Payment.PAYMENT) {

    open var paymentId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var customerId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var staffId: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var rentalId: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var amount: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    open var paymentDate: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised PaymentRecord
     */
    constructor(paymentId: Long? = null, customerId: Long? = null, staffId: Long? = null, rentalId: Long? = null, amount: BigDecimal? = null, paymentDate: LocalDateTime? = null): this() {
        this.paymentId = paymentId
        this.customerId = customerId
        this.staffId = staffId
        this.rentalId = rentalId
        this.amount = amount
        this.paymentDate = paymentDate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Payment?): this() {
        if (value != null) {
            this.paymentId = value.paymentId
            this.customerId = value.customerId
            this.staffId = value.staffId
            this.rentalId = value.rentalId
            this.amount = value.amount
            this.paymentDate = value.paymentDate
            resetChangedOnNotNull()
        }
    }
}

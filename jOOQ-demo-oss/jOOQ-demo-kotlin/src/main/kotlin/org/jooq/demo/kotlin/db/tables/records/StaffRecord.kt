/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record13
import org.jooq.Row13
import org.jooq.demo.kotlin.db.tables.Staff
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StaffRecord() : UpdatableRecordImpl<StaffRecord>(Staff.STAFF), Record13<Long?, String?, String?, Long?, String?, Long?, Boolean?, String?, String?, LocalDateTime?, ByteArray?, String?, String?> {

    open var staffId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var addressId: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var email: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var storeId: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var active: Boolean?
        set(value): Unit = set(6, value)
        get(): Boolean? = get(6) as Boolean?

    open var username: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var password: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(9, value)
        get(): LocalDateTime? = get(9) as LocalDateTime?

    open var picture: ByteArray?
        set(value): Unit = set(10, value)
        get(): ByteArray? = get(10) as ByteArray?

    open var fullAddress: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var fullName: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row13<Long?, String?, String?, Long?, String?, Long?, Boolean?, String?, String?, LocalDateTime?, ByteArray?, String?, String?> = super.fieldsRow() as Row13<Long?, String?, String?, Long?, String?, Long?, Boolean?, String?, String?, LocalDateTime?, ByteArray?, String?, String?>
    override fun valuesRow(): Row13<Long?, String?, String?, Long?, String?, Long?, Boolean?, String?, String?, LocalDateTime?, ByteArray?, String?, String?> = super.valuesRow() as Row13<Long?, String?, String?, Long?, String?, Long?, Boolean?, String?, String?, LocalDateTime?, ByteArray?, String?, String?>
    override fun field1(): Field<Long?> = Staff.STAFF.STAFF_ID
    override fun field2(): Field<String?> = Staff.STAFF.FIRST_NAME
    override fun field3(): Field<String?> = Staff.STAFF.LAST_NAME
    override fun field4(): Field<Long?> = Staff.STAFF.ADDRESS_ID
    override fun field5(): Field<String?> = Staff.STAFF.EMAIL
    override fun field6(): Field<Long?> = Staff.STAFF.STORE_ID
    override fun field7(): Field<Boolean?> = Staff.STAFF.ACTIVE
    override fun field8(): Field<String?> = Staff.STAFF.USERNAME
    override fun field9(): Field<String?> = Staff.STAFF.PASSWORD
    override fun field10(): Field<LocalDateTime?> = Staff.STAFF.LAST_UPDATE
    override fun field11(): Field<ByteArray?> = Staff.STAFF.PICTURE
    override fun field12(): Field<String?> = Staff.STAFF.FULL_ADDRESS
    override fun field13(): Field<String?> = Staff.STAFF.FULL_NAME
    override fun component1(): Long? = staffId
    override fun component2(): String? = firstName
    override fun component3(): String? = lastName
    override fun component4(): Long? = addressId
    override fun component5(): String? = email
    override fun component6(): Long? = storeId
    override fun component7(): Boolean? = active
    override fun component8(): String? = username
    override fun component9(): String? = password
    override fun component10(): LocalDateTime? = lastUpdate
    override fun component11(): ByteArray? = picture
    override fun component12(): String? = fullAddress
    override fun component13(): String? = fullName
    override fun value1(): Long? = staffId
    override fun value2(): String? = firstName
    override fun value3(): String? = lastName
    override fun value4(): Long? = addressId
    override fun value5(): String? = email
    override fun value6(): Long? = storeId
    override fun value7(): Boolean? = active
    override fun value8(): String? = username
    override fun value9(): String? = password
    override fun value10(): LocalDateTime? = lastUpdate
    override fun value11(): ByteArray? = picture
    override fun value12(): String? = fullAddress
    override fun value13(): String? = fullName

    override fun value1(value: Long?): StaffRecord {
        this.staffId = value
        return this
    }

    override fun value2(value: String?): StaffRecord {
        this.firstName = value
        return this
    }

    override fun value3(value: String?): StaffRecord {
        this.lastName = value
        return this
    }

    override fun value4(value: Long?): StaffRecord {
        this.addressId = value
        return this
    }

    override fun value5(value: String?): StaffRecord {
        this.email = value
        return this
    }

    override fun value6(value: Long?): StaffRecord {
        this.storeId = value
        return this
    }

    override fun value7(value: Boolean?): StaffRecord {
        this.active = value
        return this
    }

    override fun value8(value: String?): StaffRecord {
        this.username = value
        return this
    }

    override fun value9(value: String?): StaffRecord {
        this.password = value
        return this
    }

    override fun value10(value: LocalDateTime?): StaffRecord {
        this.lastUpdate = value
        return this
    }

    override fun value11(value: ByteArray?): StaffRecord {
        this.picture = value
        return this
    }

    override fun value12(value: String?): StaffRecord {
        this.fullAddress = value
        return this
    }

    override fun value13(value: String?): StaffRecord {
        this.fullName = value
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Long?, value5: String?, value6: Long?, value7: Boolean?, value8: String?, value9: String?, value10: LocalDateTime?, value11: ByteArray?, value12: String?, value13: String?): StaffRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        return this
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    constructor(staffId: Long? = null, firstName: String? = null, lastName: String? = null, addressId: Long? = null, email: String? = null, storeId: Long? = null, active: Boolean? = null, username: String? = null, password: String? = null, lastUpdate: LocalDateTime? = null, picture: ByteArray? = null, fullAddress: String? = null, fullName: String? = null): this() {
        this.staffId = staffId
        this.firstName = firstName
        this.lastName = lastName
        this.addressId = addressId
        this.email = email
        this.storeId = storeId
        this.active = active
        this.username = username
        this.password = password
        this.lastUpdate = lastUpdate
        this.picture = picture
        this.fullAddress = fullAddress
        this.fullName = fullName
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    constructor(staffId: Long? = null, firstName: String? = null, lastName: String? = null, addressId: Long? = null, email: String? = null, storeId: Long? = null, active: Boolean? = null, username: String? = null, password: String? = null, picture: ByteArray? = null, fullAddress: String? = null, fullName: String? = null): this() {
        this.staffId = staffId
        this.firstName = firstName
        this.lastName = lastName
        this.addressId = addressId
        this.email = email
        this.storeId = storeId
        this.active = active
        this.username = username
        this.password = password
        this.picture = picture
        this.fullAddress = fullAddress
        this.fullName = fullName
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.Staff?): this() {
        if (value != null) {
            this.staffId = value.staffId
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.addressId = value.addressId
            this.email = value.email
            this.storeId = value.storeId
            this.active = value.active
            this.username = value.username
            this.password = value.password
            this.lastUpdate = value.lastUpdate
            this.picture = value.picture
            this.fullAddress = value.fullAddress
            this.fullName = value.fullName
        }
    }
}

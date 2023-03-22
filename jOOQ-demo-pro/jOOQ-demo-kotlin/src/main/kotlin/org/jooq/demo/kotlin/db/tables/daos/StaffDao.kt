/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.daos


import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.demo.kotlin.db.tables.Staff
import org.jooq.demo.kotlin.db.tables.records.StaffRecord
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StaffDao(configuration: Configuration?) : DAOImpl<StaffRecord, org.jooq.demo.kotlin.db.tables.pojos.Staff, Long>(Staff.STAFF, org.jooq.demo.kotlin.db.tables.pojos.Staff::class.java, configuration) {

    /**
     * Create a new StaffDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: org.jooq.demo.kotlin.db.tables.pojos.Staff): Long? = o.staffId

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStaffId(lowerInclusive: Long?, upperInclusive: Long?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.STAFF_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    fun fetchByStaffId(vararg values: Long): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.STAFF_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>staff_id = value</code>
     */
    fun fetchOneByStaffId(value: Long): org.jooq.demo.kotlin.db.tables.pojos.Staff? = fetchOne(Staff.STAFF.STAFF_ID, value)

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfFirstName(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.FIRST_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    fun fetchByFirstName(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.FIRST_NAME, *values)

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLastName(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.LAST_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    fun fetchByLastName(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.LAST_NAME, *values)

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfAddressId(lowerInclusive: Long?, upperInclusive: Long?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.ADDRESS_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    fun fetchByAddressId(vararg values: Long): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.ADDRESS_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfEmail(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.EMAIL, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    fun fetchByEmail(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.EMAIL, *values)

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStoreId(lowerInclusive: Long?, upperInclusive: Long?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.STORE_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    fun fetchByStoreId(vararg values: Long): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.STORE_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>active BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfActive(lowerInclusive: Boolean?, upperInclusive: Boolean?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.ACTIVE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    fun fetchByActive(vararg values: Boolean): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.ACTIVE, *values.toTypedArray())

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUsername(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.USERNAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    fun fetchByUsername(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.USERNAME, *values)

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfPassword(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.PASSWORD, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    fun fetchByPassword(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.PASSWORD, *values)

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLastUpdate(lowerInclusive: LocalDateTime?, upperInclusive: LocalDateTime?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.LAST_UPDATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    fun fetchByLastUpdate(vararg values: LocalDateTime): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.LAST_UPDATE, *values)

    /**
     * Fetch records that have <code>picture BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfPicture(lowerInclusive: ByteArray?, upperInclusive: ByteArray?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.PICTURE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>picture IN (values)</code>
     */
    fun fetchByPicture(vararg values: ByteArray): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.PICTURE, *values)

    /**
     * Fetch records that have <code>full_address BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfFullAddress(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.FULL_ADDRESS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>full_address IN (values)</code>
     */
    fun fetchByFullAddress(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.FULL_ADDRESS, *values)

    /**
     * Fetch records that have <code>full_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfFullName(lowerInclusive: String?, upperInclusive: String?): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetchRange(Staff.STAFF.FULL_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>full_name IN (values)</code>
     */
    fun fetchByFullName(vararg values: String): List<org.jooq.demo.kotlin.db.tables.pojos.Staff> = fetch(Staff.STAFF.FULL_NAME, *values)
}

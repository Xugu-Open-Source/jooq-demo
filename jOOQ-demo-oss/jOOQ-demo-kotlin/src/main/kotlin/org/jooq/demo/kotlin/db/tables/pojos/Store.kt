/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Store(
    var storeId: Long? = null,
    var managerStaffId: Long? = null,
    var addressId: Long? = null,
    var lastUpdate: LocalDateTime? = null,
    var fullAddress: String? = null
): Serializable {

}

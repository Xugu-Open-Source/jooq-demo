/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.lang.String
import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.demo.skala.db.tables.Store
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class StoreRecord extends UpdatableRecordImpl[StoreRecord](Store.STORE) {

  /**
   * Setter for <code>public.store.store_id</code>.
   */
  def setStoreId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.store.store_id</code>.
   */
  def getStoreId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.store.manager_staff_id</code>.
   */
  def setManagerStaffId(value: Long): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.store.manager_staff_id</code>.
   */
  def getManagerStaffId: Long = get(1).asInstanceOf[Long]

  /**
   * Setter for <code>public.store.address_id</code>.
   */
  def setAddressId(value: Long): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.store.address_id</code>.
   */
  def getAddressId: Long = get(2).asInstanceOf[Long]

  /**
   * Setter for <code>public.store.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.store.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(3).asInstanceOf[LocalDateTime]

  /**
   * Setter for <code>public.store.full_address</code>.
   */
  def setFullAddress(value: String): Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>public.store.full_address</code>.
   */
  def getFullAddress: String = get(4).asInstanceOf[String]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Long] = super.key.asInstanceOf[ Record1[Long] ]

  /**
   * Create a detached, initialised StoreRecord
   */
  def this(storeId : Long, managerStaffId : Long, addressId : Long, lastUpdate : LocalDateTime, fullAddress : String) = {
    this()

    this.setStoreId(storeId)
    this.setManagerStaffId(managerStaffId)
    this.setAddressId(addressId)
    this.setLastUpdate(lastUpdate)
    this.setFullAddress(fullAddress)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised StoreRecord
   */
  def this(storeId : Long, managerStaffId : Long, addressId : Long, fullAddress : String) = {
    this()

    this.setStoreId(storeId)
    this.setManagerStaffId(managerStaffId)
    this.setAddressId(addressId)
    this.setFullAddress(fullAddress)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised StoreRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.Store) = {
    this()

    if (value != null) {
      this.setStoreId(value.getStoreId)
      this.setManagerStaffId(value.getManagerStaffId)
      this.setAddressId(value.getAddressId)
      this.setLastUpdate(value.getLastUpdate)
      this.setFullAddress(value.getFullAddress)
      resetChangedOnNotNull()
    }
  }
}

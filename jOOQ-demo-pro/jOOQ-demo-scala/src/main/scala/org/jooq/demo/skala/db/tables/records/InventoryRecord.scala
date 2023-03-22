/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.demo.skala.db.tables.Inventory
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class InventoryRecord extends UpdatableRecordImpl[InventoryRecord](Inventory.INVENTORY) with Record4[Long, Long, Long, LocalDateTime] {

  /**
   * Setter for <code>public.inventory.inventory_id</code>.
   */
  def setInventoryId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.inventory.inventory_id</code>.
   */
  def getInventoryId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.inventory.film_id</code>.
   */
  def setFilmId(value: Long): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.inventory.film_id</code>.
   */
  def getFilmId: Long = get(1).asInstanceOf[Long]

  /**
   * Setter for <code>public.inventory.store_id</code>.
   */
  def setStoreId(value: Long): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.inventory.store_id</code>.
   */
  def getStoreId: Long = get(2).asInstanceOf[Long]

  /**
   * Setter for <code>public.inventory.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.inventory.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(3).asInstanceOf[LocalDateTime]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Long] = super.key.asInstanceOf[ Record1[Long] ]

  // -------------------------------------------------------------------------
  // Record4 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row4[Long, Long, Long, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row4[Long, Long, Long, LocalDateTime] ]

  override def valuesRow: Row4[Long, Long, Long, LocalDateTime] = super.valuesRow.asInstanceOf[ Row4[Long, Long, Long, LocalDateTime] ]
  override def field1: Field[Long] = Inventory.INVENTORY.INVENTORY_ID
  override def field2: Field[Long] = Inventory.INVENTORY.FILM_ID
  override def field3: Field[Long] = Inventory.INVENTORY.STORE_ID
  override def field4: Field[LocalDateTime] = Inventory.INVENTORY.LAST_UPDATE
  override def component1: Long = getInventoryId
  override def component2: Long = getFilmId
  override def component3: Long = getStoreId
  override def component4: LocalDateTime = getLastUpdate
  override def value1: Long = getInventoryId
  override def value2: Long = getFilmId
  override def value3: Long = getStoreId
  override def value4: LocalDateTime = getLastUpdate

  override def value1(value: Long): InventoryRecord = {
    setInventoryId(value)
    this
  }

  override def value2(value: Long): InventoryRecord = {
    setFilmId(value)
    this
  }

  override def value3(value: Long): InventoryRecord = {
    setStoreId(value)
    this
  }

  override def value4(value: LocalDateTime): InventoryRecord = {
    setLastUpdate(value)
    this
  }

  override def values(value1 : Long, value2 : Long, value3 : Long, value4 : LocalDateTime): InventoryRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this
  }

  /**
   * Create a detached, initialised InventoryRecord
   */
  def this(inventoryId : Long, filmId : Long, storeId : Long, lastUpdate : LocalDateTime) = {
    this()

    this.setInventoryId(inventoryId)
    this.setFilmId(filmId)
    this.setStoreId(storeId)
    this.setLastUpdate(lastUpdate)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised InventoryRecord
   */
  def this(inventoryId : Long, filmId : Long, storeId : Long) = {
    this()

    this.setInventoryId(inventoryId)
    this.setFilmId(filmId)
    this.setStoreId(storeId)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised InventoryRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.Inventory) = {
    this()

    if (value != null) {
      this.setInventoryId(value.getInventoryId)
      this.setFilmId(value.getFilmId)
      this.setStoreId(value.getStoreId)
      this.setLastUpdate(value.getLastUpdate)
      resetChangedOnNotNull()
    }
  }
}

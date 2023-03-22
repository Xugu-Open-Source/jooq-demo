/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Integer

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.demo.skala.db.tables.FilmNotInStock
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class FilmNotInStockRecord extends TableRecordImpl[FilmNotInStockRecord](FilmNotInStock.FILM_NOT_IN_STOCK) with Record1[Integer] {

  /**
   * Setter for <code>public.film_not_in_stock.p_film_count</code>.
   */
  def setPFilmCount(value: Integer): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.film_not_in_stock.p_film_count</code>.
   */
  def getPFilmCount: Integer = get(0).asInstanceOf[Integer]

  // -------------------------------------------------------------------------
  // Record1 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row1[Integer] = super.fieldsRow.asInstanceOf[ Row1[Integer] ]

  override def valuesRow: Row1[Integer] = super.valuesRow.asInstanceOf[ Row1[Integer] ]
  override def field1: Field[Integer] = FilmNotInStock.FILM_NOT_IN_STOCK.P_FILM_COUNT
  override def component1: Integer = getPFilmCount
  override def value1: Integer = getPFilmCount

  override def value1(value: Integer): FilmNotInStockRecord = {
    setPFilmCount(value)
    this
  }

  override def values(value1 : Integer): FilmNotInStockRecord = {
    this.value1(value1)
    this
  }

  /**
   * Create a detached, initialised FilmNotInStockRecord
   */
  def this(pFilmCount : Integer) = {
    this()

    this.setPFilmCount(pFilmCount)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised FilmNotInStockRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.FilmNotInStock) = {
    this()

    if (value != null) {
      this.setPFilmCount(value.getPFilmCount)
      resetChangedOnNotNull()
    }
  }
}

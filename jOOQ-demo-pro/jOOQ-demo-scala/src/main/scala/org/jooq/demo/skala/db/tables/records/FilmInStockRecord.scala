/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Integer

import org.jooq.demo.skala.db.tables.FilmInStock
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class FilmInStockRecord extends TableRecordImpl[FilmInStockRecord](FilmInStock.FILM_IN_STOCK) {

  /**
   * Setter for <code>public.film_in_stock.p_film_count</code>.
   */
  def setPFilmCount(value: Integer): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.film_in_stock.p_film_count</code>.
   */
  def getPFilmCount: Integer = get(0).asInstanceOf[Integer]

  /**
   * Create a detached, initialised FilmInStockRecord
   */
  def this(pFilmCount : Integer) = {
    this()

    this.setPFilmCount(pFilmCount)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised FilmInStockRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.FilmInStock) = {
    this()

    if (value != null) {
      this.setPFilmCount(value.getPFilmCount)
      resetChangedOnNotNull()
    }
  }
}

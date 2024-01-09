/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.time.LocalDateTime

import org.jooq.Record2
import org.jooq.demo.skala.db.tables.FilmCategory
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class FilmCategoryRecord extends UpdatableRecordImpl[FilmCategoryRecord](FilmCategory.FILM_CATEGORY) {

  /**
   * Setter for <code>public.film_category.film_id</code>.
   */
  def setFilmId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.film_category.film_id</code>.
   */
  def getFilmId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.film_category.category_id</code>.
   */
  def setCategoryId(value: Long): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.film_category.category_id</code>.
   */
  def getCategoryId: Long = get(1).asInstanceOf[Long]

  /**
   * Setter for <code>public.film_category.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.film_category.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(2).asInstanceOf[LocalDateTime]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record2[Long, Long] = super.key.asInstanceOf[ Record2[Long, Long] ]

  /**
   * Create a detached, initialised FilmCategoryRecord
   */
  def this(filmId : Long, categoryId : Long, lastUpdate : LocalDateTime) = {
    this()

    this.setFilmId(filmId)
    this.setCategoryId(categoryId)
    this.setLastUpdate(lastUpdate)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised FilmCategoryRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.FilmCategory) = {
    this()

    if (value != null) {
      this.setFilmId(value.getFilmId)
      this.setCategoryId(value.getCategoryId)
      this.setLastUpdate(value.getLastUpdate)
      resetChangedOnNotNull()
    }
  }
}

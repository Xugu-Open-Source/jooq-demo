/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.demo.skala.db.tables.FilmActor
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class FilmActorRecord extends UpdatableRecordImpl[FilmActorRecord](FilmActor.FILM_ACTOR) with Record3[Long, Long, LocalDateTime] {

  /**
   * Setter for <code>public.film_actor.actor_id</code>.
   */
  def setActorId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.film_actor.actor_id</code>.
   */
  def getActorId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.film_actor.film_id</code>.
   */
  def setFilmId(value: Long): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.film_actor.film_id</code>.
   */
  def getFilmId: Long = get(1).asInstanceOf[Long]

  /**
   * Setter for <code>public.film_actor.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.film_actor.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(2).asInstanceOf[LocalDateTime]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record2[Long, Long] = super.key.asInstanceOf[ Record2[Long, Long] ]

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row3[Long, Long, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row3[Long, Long, LocalDateTime] ]

  override def valuesRow: Row3[Long, Long, LocalDateTime] = super.valuesRow.asInstanceOf[ Row3[Long, Long, LocalDateTime] ]
  override def field1: Field[Long] = FilmActor.FILM_ACTOR.ACTOR_ID
  override def field2: Field[Long] = FilmActor.FILM_ACTOR.FILM_ID
  override def field3: Field[LocalDateTime] = FilmActor.FILM_ACTOR.LAST_UPDATE
  override def component1: Long = getActorId
  override def component2: Long = getFilmId
  override def component3: LocalDateTime = getLastUpdate
  override def value1: Long = getActorId
  override def value2: Long = getFilmId
  override def value3: LocalDateTime = getLastUpdate

  override def value1(value: Long): FilmActorRecord = {
    setActorId(value)
    this
  }

  override def value2(value: Long): FilmActorRecord = {
    setFilmId(value)
    this
  }

  override def value3(value: LocalDateTime): FilmActorRecord = {
    setLastUpdate(value)
    this
  }

  override def values(value1 : Long, value2 : Long, value3 : LocalDateTime): FilmActorRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this
  }

  /**
   * Create a detached, initialised FilmActorRecord
   */
  def this(actorId : Long, filmId : Long, lastUpdate : LocalDateTime) = {
    this()

    this.setActorId(actorId)
    this.setFilmId(filmId)
    this.setLastUpdate(lastUpdate)
  }

  /**
   * Create a detached, initialised FilmActorRecord
   */
  def this(actorId : Long, filmId : Long) = {
    this()

    this.setActorId(actorId)
    this.setFilmId(filmId)
  }

  /**
   * Create a detached, initialised FilmActorRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.FilmActor) = {
    this()

    if (value != null) {
      this.setActorId(value.getActorId)
      this.setFilmId(value.getFilmId)
      this.setLastUpdate(value.getLastUpdate)
    }
  }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Long
import java.lang.Short
import java.lang.String
import java.math.BigDecimal
import java.util.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.enums.MpaaRating
import org.jooq.demo.skala.db.tables.records.NicerButSlowerFilmListRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object NicerButSlowerFilmList {

  /**
   * The reference instance of <code>public.nicer_but_slower_film_list</code>
   */
  val NICER_BUT_SLOWER_FILM_LIST = new NicerButSlowerFilmList
}

/**
 * This class is generated by jOOQ.
 */
class NicerButSlowerFilmList(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, NicerButSlowerFilmListRecord],
  parentPath: InverseForeignKey[_ <: Record, NicerButSlowerFilmListRecord],
  aliased: Table[NicerButSlowerFilmListRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[NicerButSlowerFilmListRecord](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.view("""
  create view "nicer_but_slower_film_list" as  SELECT film.film_id AS fid,
    film.title,
    film.description,
    category.name AS category,
    film.rental_rate AS price,
    film.length,
    film.rating,
    group_concat((((upper("substring"((actor.first_name)::text, 1, 1)) || lower("substring"((actor.first_name)::text, 2))) || upper("substring"((actor.last_name)::text, 1, 1))) || lower("substring"((actor.last_name)::text, 2)))) AS actors
   FROM ((((category
     LEFT JOIN film_category ON ((category.category_id = film_category.category_id)))
     LEFT JOIN film ON ((film_category.film_id = film.film_id)))
     JOIN film_actor ON ((film.film_id = film_actor.film_id)))
     JOIN actor ON ((film_actor.actor_id = actor.actor_id)))
  GROUP BY film.film_id, film.title, film.description, category.name, film.rental_rate, film.length, film.rating;
  """),
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[NicerButSlowerFilmListRecord] = classOf[NicerButSlowerFilmListRecord]

  /**
   * The column <code>public.nicer_but_slower_film_list.fid</code>.
   */
  val FID: TableField[NicerButSlowerFilmListRecord, Long] = createField(DSL.name("fid"), SQLDataType.BIGINT, "")

  /**
   * The column <code>public.nicer_but_slower_film_list.title</code>.
   */
  val TITLE: TableField[NicerButSlowerFilmListRecord, String] = createField(DSL.name("title"), SQLDataType.VARCHAR(255), "")

  /**
   * The column <code>public.nicer_but_slower_film_list.description</code>.
   */
  val DESCRIPTION: TableField[NicerButSlowerFilmListRecord, String] = createField(DSL.name("description"), SQLDataType.CLOB, "")

  /**
   * The column <code>public.nicer_but_slower_film_list.category</code>.
   */
  val CATEGORY: TableField[NicerButSlowerFilmListRecord, String] = createField(DSL.name("category"), SQLDataType.VARCHAR(25), "")

  /**
   * The column <code>public.nicer_but_slower_film_list.price</code>.
   */
  val PRICE: TableField[NicerButSlowerFilmListRecord, BigDecimal] = createField(DSL.name("price"), SQLDataType.NUMERIC(4, 2), "")

  /**
   * The column <code>public.nicer_but_slower_film_list.length</code>.
   */
  val LENGTH: TableField[NicerButSlowerFilmListRecord, Short] = createField(DSL.name("length"), SQLDataType.SMALLINT, "")

  /**
   * The column <code>public.nicer_but_slower_film_list.rating</code>.
   */
  val RATING: TableField[NicerButSlowerFilmListRecord, MpaaRating] = createField(DSL.name("rating"), SQLDataType.VARCHAR.asEnumDataType(classOf[MpaaRating]), "")

  /**
   * The column <code>public.nicer_but_slower_film_list.actors</code>.
   */
  val ACTORS: TableField[NicerButSlowerFilmListRecord, String] = createField(DSL.name("actors"), SQLDataType.CLOB, "")

  private def this(alias: Name, aliased: Table[NicerButSlowerFilmListRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[NicerButSlowerFilmListRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.nicer_but_slower_film_list</code> table
   * reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST)

  /**
   * Create an aliased <code>public.nicer_but_slower_film_list</code> table
   * reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST)

  /**
   * Create a <code>public.nicer_but_slower_film_list</code> table reference
   */
  def this() = this(DSL.name("nicer_but_slower_film_list"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC
  override def as(alias: String): NicerButSlowerFilmList = new NicerButSlowerFilmList(DSL.name(alias), this)
  override def as(alias: Name): NicerButSlowerFilmList = new NicerButSlowerFilmList(alias, this)
  override def as(alias: Table[_]): NicerButSlowerFilmList = new NicerButSlowerFilmList(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): NicerButSlowerFilmList = new NicerButSlowerFilmList(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): NicerButSlowerFilmList = new NicerButSlowerFilmList(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): NicerButSlowerFilmList = new NicerButSlowerFilmList(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): NicerButSlowerFilmList = new NicerButSlowerFilmList(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): NicerButSlowerFilmList = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): NicerButSlowerFilmList = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): NicerButSlowerFilmList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): NicerButSlowerFilmList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): NicerButSlowerFilmList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): NicerButSlowerFilmList = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): NicerButSlowerFilmList = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): NicerButSlowerFilmList = where(DSL.notExists(select))
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Class
import java.lang.Integer
import java.lang.Long
import java.lang.String

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.FilmInStockRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object FilmInStock {

  /**
   * The reference instance of <code>public.film_in_stock</code>
   */
  val FILM_IN_STOCK = new FilmInStock
}

/**
 * This class is generated by jOOQ.
 */
class FilmInStock(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, FilmInStockRecord],
  parentPath: InverseForeignKey[_ <: Record, FilmInStockRecord],
  aliased: Table[FilmInStockRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[FilmInStockRecord](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.function,
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[FilmInStockRecord] = classOf[FilmInStockRecord]

  /**
   * The column <code>public.film_in_stock.p_film_count</code>.
   */
  val P_FILM_COUNT: TableField[FilmInStockRecord, Integer] = createField(DSL.name("p_film_count"), SQLDataType.INTEGER, "")

  private def this(alias: Name, aliased: Table[FilmInStockRecord]) = this(alias, null, null, null, aliased, Array(
    DSL.value(null, SQLDataType.BIGINT),
    DSL.value(null, SQLDataType.BIGINT)
  ), null)

  /**
   * Create an aliased <code>public.film_in_stock</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.FilmInStock.FILM_IN_STOCK)

  /**
   * Create an aliased <code>public.film_in_stock</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.FilmInStock.FILM_IN_STOCK)

  /**
   * Create a <code>public.film_in_stock</code> table reference
   */
  def this() = this(DSL.name("film_in_stock"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC
  override def as(alias: String): FilmInStock = new FilmInStock(DSL.name(alias), null, null, null, this, parameters, null)
  override def as(alias: Name): FilmInStock = new FilmInStock(alias, null, null, null, this, parameters, null)
  override def as(alias: Table[_]): FilmInStock = new FilmInStock(alias.getQualifiedName(), null, null, null, this, parameters, null)

  /**
   * Rename this table
   */
  override def rename(name: String): FilmInStock = new FilmInStock(DSL.name(name), null, null, null, null, parameters, null)

  /**
   * Rename this table
   */
  override def rename(name: Name): FilmInStock = new FilmInStock(name, null, null, null, null, parameters, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): FilmInStock = new FilmInStock(name.getQualifiedName(), null, null, null, null, parameters, null)

  /**
   * Call this table-valued function
   */
  def call(
      pFilmId: Long
    , pStoreId: Long
  ): FilmInStock = Option(new FilmInStock(DSL.name("film_in_stock"), null, null, null, null, Array(
    DSL.value(pFilmId, SQLDataType.BIGINT),
    DSL.value(pStoreId, SQLDataType.BIGINT)
  ), null)).map(r => if (super.aliased()) r.as(getUnqualifiedName) else r).get

  /**
   * Call this table-valued function
   */
  def call(
      pFilmId: Field[Long]
    , pStoreId: Field[Long]
  ): FilmInStock = Option(new FilmInStock(DSL.name("film_in_stock"), null, null, null, null, Array(
    pFilmId,
    pStoreId
  ), null)).map(r => if (super.aliased()) r.as(getUnqualifiedName) else r).get
}

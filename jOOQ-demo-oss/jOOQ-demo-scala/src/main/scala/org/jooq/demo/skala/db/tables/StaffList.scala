/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Long
import java.lang.String
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
import org.jooq.demo.skala.db.tables.records.StaffListRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object StaffList {

  /**
   * The reference instance of <code>public.staff_list</code>
   */
  val STAFF_LIST = new StaffList
}

/**
 * This class is generated by jOOQ.
 */
class StaffList(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, StaffListRecord],
  parentPath: InverseForeignKey[_ <: Record, StaffListRecord],
  aliased: Table[StaffListRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[StaffListRecord](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.view("""
  create view "staff_list" as  SELECT s.staff_id AS id,
   (((s.first_name)::text || ' '::text) || (s.last_name)::text) AS name,
   a.address,
   a.postal_code AS "zip code",
   a.phone,
   city.city,
   country.country,
   s.store_id AS sid
  FROM (((staff s
    JOIN address a ON ((s.address_id = a.address_id)))
    JOIN city ON ((a.city_id = city.city_id)))
    JOIN country ON ((city.country_id = country.country_id)));
  """),
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[StaffListRecord] = classOf[StaffListRecord]

  /**
   * The column <code>public.staff_list.id</code>.
   */
  val ID: TableField[StaffListRecord, Long] = createField(DSL.name("id"), SQLDataType.BIGINT, "")

  /**
   * The column <code>public.staff_list.name</code>.
   */
  val NAME: TableField[StaffListRecord, String] = createField(DSL.name("name"), SQLDataType.CLOB, "")

  /**
   * The column <code>public.staff_list.address</code>.
   */
  val ADDRESS: TableField[StaffListRecord, String] = createField(DSL.name("address"), SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.staff_list.zip code</code>.
   */
  val ZIP_CODE: TableField[StaffListRecord, String] = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), "")

  /**
   * The column <code>public.staff_list.phone</code>.
   */
  val PHONE: TableField[StaffListRecord, String] = createField(DSL.name("phone"), SQLDataType.VARCHAR(20), "")

  /**
   * The column <code>public.staff_list.city</code>.
   */
  val CITY: TableField[StaffListRecord, String] = createField(DSL.name("city"), SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.staff_list.country</code>.
   */
  val COUNTRY: TableField[StaffListRecord, String] = createField(DSL.name("country"), SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.staff_list.sid</code>.
   */
  val SID: TableField[StaffListRecord, Long] = createField(DSL.name("sid"), SQLDataType.BIGINT, "")

  private def this(alias: Name, aliased: Table[StaffListRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[StaffListRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.staff_list</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.StaffList.STAFF_LIST)

  /**
   * Create an aliased <code>public.staff_list</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.StaffList.STAFF_LIST)

  /**
   * Create a <code>public.staff_list</code> table reference
   */
  def this() = this(DSL.name("staff_list"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC
  override def as(alias: String): StaffList = new StaffList(DSL.name(alias), this)
  override def as(alias: Name): StaffList = new StaffList(alias, this)
  override def as(alias: Table[_]): StaffList = new StaffList(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): StaffList = new StaffList(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): StaffList = new StaffList(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): StaffList = new StaffList(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): StaffList = new StaffList(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): StaffList = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): StaffList = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): StaffList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): StaffList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): StaffList = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): StaffList = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): StaffList = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): StaffList = where(DSL.notExists(select))
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Long
import java.lang.String
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.Arrays
import java.util.Collection
import java.util.List

import org.jooq.Check
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
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
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.Customer.CustomerPath
import org.jooq.demo.skala.db.tables.Rental.RentalPath
import org.jooq.demo.skala.db.tables.Staff.StaffPath
import org.jooq.demo.skala.db.tables.records.PaymentP2007_06Record
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object PaymentP2007_06 {

  /**
   * The reference instance of <code>public.payment_p2007_06</code>
   */
  val PAYMENT_P2007_06 = new PaymentP2007_06
}

/**
 * This class is generated by jOOQ.
 */
class PaymentP2007_06(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, PaymentP2007_06Record],
  parentPath: InverseForeignKey[_ <: Record, PaymentP2007_06Record],
  aliased: Table[PaymentP2007_06Record],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[PaymentP2007_06Record](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.table,
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[PaymentP2007_06Record] = classOf[PaymentP2007_06Record]

  /**
   * The column <code>public.payment_p2007_06.payment_id</code>.
   */
  val PAYMENT_ID: TableField[PaymentP2007_06Record, Long] = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.payment_p2007_06.customer_id</code>.
   */
  val CUSTOMER_ID: TableField[PaymentP2007_06Record, Long] = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment_p2007_06.staff_id</code>.
   */
  val STAFF_ID: TableField[PaymentP2007_06Record, Long] = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment_p2007_06.rental_id</code>.
   */
  val RENTAL_ID: TableField[PaymentP2007_06Record, Long] = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment_p2007_06.amount</code>.
   */
  val AMOUNT: TableField[PaymentP2007_06Record, BigDecimal] = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), "")

  /**
   * The column <code>public.payment_p2007_06.payment_date</code>.
   */
  val PAYMENT_DATE: TableField[PaymentP2007_06Record, LocalDateTime] = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), "")

  private def this(alias: Name, aliased: Table[PaymentP2007_06Record]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[PaymentP2007_06Record], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.payment_p2007_06</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.PaymentP2007_06.PAYMENT_P2007_06)

  /**
   * Create an aliased <code>public.payment_p2007_06</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.PaymentP2007_06.PAYMENT_P2007_06)

  /**
   * Create a <code>public.payment_p2007_06</code> table reference
   */
  def this() = this(DSL.name("payment_p2007_06"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_FK_PAYMENT_P2007_06_CUSTOMER_ID, Indexes.IDX_FK_PAYMENT_P2007_06_STAFF_ID)

  override def getIdentity: Identity[PaymentP2007_06Record, Long] = super.getIdentity.asInstanceOf[ Identity[PaymentP2007_06Record, Long] ]

  override def getReferences: List[ ForeignKey[PaymentP2007_06Record, _] ] = Arrays.asList[ ForeignKey[PaymentP2007_06Record, _] ](Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_RENTAL_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.customer</code> table.
   */
  lazy val customer: CustomerPath = { new CustomerPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.staff</code> table.
   */
  lazy val staff: StaffPath = { new StaffPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.rental</code> table.
   */
  lazy val rental: RentalPath = { new RentalPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_RENTAL_ID_FKEY, null) }
  override def getChecks: List[ Check[PaymentP2007_06Record] ] = Arrays.asList[ Check[PaymentP2007_06Record] ](
    Internal.createCheck(this, DSL.name("payment_p2007_06_payment_date_check"), "(((payment_date >= '2007-06-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-07-01 00:00:00'::timestamp without time zone)))", true)
  )
  override def as(alias: String): PaymentP2007_06 = new PaymentP2007_06(DSL.name(alias), this)
  override def as(alias: Name): PaymentP2007_06 = new PaymentP2007_06(alias, this)
  override def as(alias: Table[_]): PaymentP2007_06 = new PaymentP2007_06(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): PaymentP2007_06 = new PaymentP2007_06(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): PaymentP2007_06 = new PaymentP2007_06(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): PaymentP2007_06 = new PaymentP2007_06(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): PaymentP2007_06 = new PaymentP2007_06(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): PaymentP2007_06 = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): PaymentP2007_06 = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): PaymentP2007_06 = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): PaymentP2007_06 = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): PaymentP2007_06 = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): PaymentP2007_06 = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): PaymentP2007_06 = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): PaymentP2007_06 = where(DSL.notExists(select))
}

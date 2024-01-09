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
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.Customer.CustomerPath
import org.jooq.demo.skala.db.tables.Rental.RentalPath
import org.jooq.demo.skala.db.tables.Staff.StaffPath
import org.jooq.demo.skala.db.tables.records.PaymentRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Payment {

  /**
   * The reference instance of <code>public.payment</code>
   */
  val PAYMENT = new Payment
}

/**
 * This class is generated by jOOQ.
 */
class Payment(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, PaymentRecord],
  parentPath: InverseForeignKey[_ <: Record, PaymentRecord],
  aliased: Table[PaymentRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[PaymentRecord](
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
  override def getRecordType: Class[PaymentRecord] = classOf[PaymentRecord]

  /**
   * The column <code>public.payment.payment_id</code>.
   */
  val PAYMENT_ID: TableField[PaymentRecord, Long] = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.payment.customer_id</code>.
   */
  val CUSTOMER_ID: TableField[PaymentRecord, Long] = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment.staff_id</code>.
   */
  val STAFF_ID: TableField[PaymentRecord, Long] = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment.rental_id</code>.
   */
  val RENTAL_ID: TableField[PaymentRecord, Long] = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.payment.amount</code>.
   */
  val AMOUNT: TableField[PaymentRecord, BigDecimal] = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), "")

  /**
   * The column <code>public.payment.payment_date</code>.
   */
  val PAYMENT_DATE: TableField[PaymentRecord, LocalDateTime] = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), "")

  private def this(alias: Name, aliased: Table[PaymentRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[PaymentRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.payment</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Payment.PAYMENT)

  /**
   * Create an aliased <code>public.payment</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Payment.PAYMENT)

  /**
   * Create a <code>public.payment</code> table reference
   */
  def this() = this(DSL.name("payment"), null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_FK_CUSTOMER_ID, Indexes.IDX_FK_STAFF_ID)

  override def getIdentity: Identity[PaymentRecord, Long] = super.getIdentity.asInstanceOf[ Identity[PaymentRecord, Long] ]

  override def getPrimaryKey: UniqueKey[PaymentRecord] = Keys.PAYMENT_PKEY

  override def getReferences: List[ ForeignKey[PaymentRecord, _] ] = Arrays.asList[ ForeignKey[PaymentRecord, _] ](Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.customer</code> table.
   */
  lazy val customer: CustomerPath = { new CustomerPath(this, Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.staff</code> table.
   */
  lazy val staff: StaffPath = { new StaffPath(this, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.rental</code> table.
   */
  lazy val rental: RentalPath = { new RentalPath(this, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY, null) }
  override def as(alias: String): Payment = new Payment(DSL.name(alias), this)
  override def as(alias: Name): Payment = new Payment(alias, this)
  override def as(alias: Table[_]): Payment = new Payment(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Payment = new Payment(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Payment = new Payment(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Payment = new Payment(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): Payment = new Payment(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): Payment = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): Payment = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): Payment = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): Payment = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): Payment = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): Payment = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): Payment = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): Payment = where(DSL.notExists(select))
}

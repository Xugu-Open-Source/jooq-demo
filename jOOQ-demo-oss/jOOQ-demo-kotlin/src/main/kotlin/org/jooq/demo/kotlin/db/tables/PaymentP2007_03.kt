/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.math.BigDecimal
import java.time.LocalDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Check
import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_FK_PAYMENT_P2007_03_CUSTOMER_ID
import org.jooq.demo.kotlin.db.indexes.IDX_FK_PAYMENT_P2007_03_STAFF_ID
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_03__PAYMENT_P2007_03_CUSTOMER_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_03__PAYMENT_P2007_03_RENTAL_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_03__PAYMENT_P2007_03_STAFF_ID_FKEY
import org.jooq.demo.kotlin.db.tables.Customer.CustomerPath
import org.jooq.demo.kotlin.db.tables.Rental.RentalPath
import org.jooq.demo.kotlin.db.tables.Staff.StaffPath
import org.jooq.demo.kotlin.db.tables.records.PaymentP2007_03Record
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PaymentP2007_03(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, PaymentP2007_03Record>?,
    parentPath: InverseForeignKey<out Record, PaymentP2007_03Record>?,
    aliased: Table<PaymentP2007_03Record>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<PaymentP2007_03Record>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.payment_p2007_03</code>
         */
        val PAYMENT_P2007_03: PaymentP2007_03 = PaymentP2007_03()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PaymentP2007_03Record> = PaymentP2007_03Record::class.java

    /**
     * The column <code>public.payment_p2007_03.payment_id</code>.
     */
    val PAYMENT_ID: TableField<PaymentP2007_03Record, Long?> = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.payment_p2007_03.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<PaymentP2007_03Record, Long?> = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_03.staff_id</code>.
     */
    val STAFF_ID: TableField<PaymentP2007_03Record, Long?> = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_03.rental_id</code>.
     */
    val RENTAL_ID: TableField<PaymentP2007_03Record, Long?> = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_03.amount</code>.
     */
    val AMOUNT: TableField<PaymentP2007_03Record, BigDecimal?> = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_03.payment_date</code>.
     */
    val PAYMENT_DATE: TableField<PaymentP2007_03Record, LocalDateTime?> = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PaymentP2007_03Record>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<PaymentP2007_03Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<PaymentP2007_03Record>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.payment_p2007_03</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.payment_p2007_03</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.payment_p2007_03</code> table reference
     */
    constructor(): this(DSL.name("payment_p2007_03"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, PaymentP2007_03Record>?, parentPath: InverseForeignKey<out Record, PaymentP2007_03Record>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, PAYMENT_P2007_03, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class PaymentP2007_03Path : PaymentP2007_03, Path<PaymentP2007_03Record> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, PaymentP2007_03Record>?, parentPath: InverseForeignKey<out Record, PaymentP2007_03Record>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<PaymentP2007_03Record>): super(alias, aliased)
        override fun `as`(alias: String): PaymentP2007_03Path = PaymentP2007_03Path(DSL.name(alias), this)
        override fun `as`(alias: Name): PaymentP2007_03Path = PaymentP2007_03Path(alias, this)
        override fun `as`(alias: Table<*>): PaymentP2007_03Path = PaymentP2007_03Path(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_FK_PAYMENT_P2007_03_CUSTOMER_ID, IDX_FK_PAYMENT_P2007_03_STAFF_ID)
    override fun getIdentity(): Identity<PaymentP2007_03Record, Long?> = super.getIdentity() as Identity<PaymentP2007_03Record, Long?>
    override fun getReferences(): List<ForeignKey<PaymentP2007_03Record, *>> = listOf(PAYMENT_P2007_03__PAYMENT_P2007_03_CUSTOMER_ID_FKEY, PAYMENT_P2007_03__PAYMENT_P2007_03_STAFF_ID_FKEY, PAYMENT_P2007_03__PAYMENT_P2007_03_RENTAL_ID_FKEY)

    private lateinit var _customer: CustomerPath

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    fun customer(): CustomerPath {
        if (!this::_customer.isInitialized)
            _customer = CustomerPath(this, PAYMENT_P2007_03__PAYMENT_P2007_03_CUSTOMER_ID_FKEY, null)

        return _customer;
    }

    val customer: CustomerPath
        get(): CustomerPath = customer()

    private lateinit var _staff: StaffPath

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    fun staff(): StaffPath {
        if (!this::_staff.isInitialized)
            _staff = StaffPath(this, PAYMENT_P2007_03__PAYMENT_P2007_03_STAFF_ID_FKEY, null)

        return _staff;
    }

    val staff: StaffPath
        get(): StaffPath = staff()

    private lateinit var _rental: RentalPath

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    fun rental(): RentalPath {
        if (!this::_rental.isInitialized)
            _rental = RentalPath(this, PAYMENT_P2007_03__PAYMENT_P2007_03_RENTAL_ID_FKEY, null)

        return _rental;
    }

    val rental: RentalPath
        get(): RentalPath = rental()
    override fun getChecks(): List<Check<PaymentP2007_03Record>> = listOf(
        Internal.createCheck(this, DSL.name("payment_p2007_03_payment_date_check"), "(((payment_date >= '2007-03-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-04-01 00:00:00'::timestamp without time zone)))", true)
    )
    override fun `as`(alias: String): PaymentP2007_03 = PaymentP2007_03(DSL.name(alias), this)
    override fun `as`(alias: Name): PaymentP2007_03 = PaymentP2007_03(alias, this)
    override fun `as`(alias: Table<*>): PaymentP2007_03 = PaymentP2007_03(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PaymentP2007_03 = PaymentP2007_03(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PaymentP2007_03 = PaymentP2007_03(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PaymentP2007_03 = PaymentP2007_03(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): PaymentP2007_03 = PaymentP2007_03(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): PaymentP2007_03 = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): PaymentP2007_03 = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): PaymentP2007_03 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): PaymentP2007_03 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): PaymentP2007_03 = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): PaymentP2007_03 = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): PaymentP2007_03 = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): PaymentP2007_03 = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): PaymentP2007_03 = where(DSL.notExists(select))
}

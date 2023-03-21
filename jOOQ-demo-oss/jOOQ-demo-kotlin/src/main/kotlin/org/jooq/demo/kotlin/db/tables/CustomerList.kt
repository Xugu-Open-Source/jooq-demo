/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row9
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.records.CustomerListRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CustomerList(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CustomerListRecord>?,
    aliased: Table<CustomerListRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CustomerListRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "customer_list" as  SELECT cu.customer_id AS id,
     (((cu.first_name)::text || ' '::text) || (cu.last_name)::text) AS name,
     a.address,
     a.postal_code AS "zip code",
     a.phone,
     city.city,
     country.country,
         CASE
             WHEN cu.activebool THEN 'active'::text
             ELSE ''::text
         END AS notes,
     cu.store_id AS sid
    FROM (((customer cu
      JOIN address a ON ((cu.address_id = a.address_id)))
      JOIN city ON ((a.city_id = city.city_id)))
      JOIN country ON ((city.country_id = country.country_id)));
    """)
) {
    companion object {

        /**
         * The reference instance of <code>public.customer_list</code>
         */
        val CUSTOMER_LIST: CustomerList = CustomerList()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CustomerListRecord> = CustomerListRecord::class.java

    /**
     * The column <code>public.customer_list.id</code>.
     */
    val ID: TableField<CustomerListRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.customer_list.name</code>.
     */
    val NAME: TableField<CustomerListRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.customer_list.address</code>.
     */
    val ADDRESS: TableField<CustomerListRecord, String?> = createField(DSL.name("address"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.zip code</code>.
     */
    val `ZIP CODE`: TableField<CustomerListRecord, String?> = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "")

    /**
     * The column <code>public.customer_list.phone</code>.
     */
    val PHONE: TableField<CustomerListRecord, String?> = createField(DSL.name("phone"), SQLDataType.VARCHAR(20), this, "")

    /**
     * The column <code>public.customer_list.city</code>.
     */
    val CITY: TableField<CustomerListRecord, String?> = createField(DSL.name("city"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.country</code>.
     */
    val COUNTRY: TableField<CustomerListRecord, String?> = createField(DSL.name("country"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.notes</code>.
     */
    val NOTES: TableField<CustomerListRecord, String?> = createField(DSL.name("notes"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.customer_list.sid</code>.
     */
    val SID: TableField<CustomerListRecord, Long?> = createField(DSL.name("sid"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<CustomerListRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CustomerListRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.customer_list</code> table reference
     */
    constructor(): this(DSL.name("customer_list"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CustomerListRecord>): this(Internal.createPathAlias(child, key), child, key, CUSTOMER_LIST, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CustomerList = CustomerList(DSL.name(alias), this)
    override fun `as`(alias: Name): CustomerList = CustomerList(alias, this)
    override fun `as`(alias: Table<*>): CustomerList = CustomerList(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CustomerList = CustomerList(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CustomerList = CustomerList(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CustomerList = CustomerList(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<Long?, String?, String?, String?, String?, String?, String?, String?, Long?> = super.fieldsRow() as Row9<Long?, String?, String?, String?, String?, String?, String?, String?, Long?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, String?, String?, String?, String?, String?, Long?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, String?, String?, String?, String?, String?, Long?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}

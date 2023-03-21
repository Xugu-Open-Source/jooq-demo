/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.time.LocalDateTime
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.keys.CATEGORY_PKEY
import org.jooq.demo.kotlin.db.tables.records.CategoryRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Category(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CategoryRecord>?,
    aliased: Table<CategoryRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CategoryRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.category</code>
         */
        val CATEGORY: Category = Category()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CategoryRecord> = CategoryRecord::class.java

    /**
     * The column <code>public.category.category_id</code>.
     */
    val CATEGORY_ID: TableField<CategoryRecord, Long?> = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.category.name</code>.
     */
    val NAME: TableField<CategoryRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(25).nullable(false), this, "")

    /**
     * The column <code>public.category.last_update</code>.
     */
    val LAST_UPDATE: TableField<CategoryRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<CategoryRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CategoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.category</code> table reference
     */
    constructor(): this(DSL.name("category"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CategoryRecord>): this(Internal.createPathAlias(child, key), child, key, CATEGORY, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CategoryRecord, Long?> = super.getIdentity() as Identity<CategoryRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CategoryRecord> = CATEGORY_PKEY
    override fun `as`(alias: String): Category = Category(DSL.name(alias), this)
    override fun `as`(alias: Name): Category = Category(alias, this)
    override fun `as`(alias: Table<*>): Category = Category(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Category = Category(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Category = Category(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Category = Category(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<Long?, String?, LocalDateTime?> = super.fieldsRow() as Row3<Long?, String?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}

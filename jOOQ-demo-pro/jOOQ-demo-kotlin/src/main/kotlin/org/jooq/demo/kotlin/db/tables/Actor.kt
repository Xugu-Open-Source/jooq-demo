/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_ACTOR_LAST_NAME
import org.jooq.demo.kotlin.db.keys.ACTOR_PKEY
import org.jooq.demo.kotlin.db.tables.records.ActorRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Actor(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ActorRecord>?,
    aliased: Table<ActorRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ActorRecord>(
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
         * The reference instance of <code>public.actor</code>
         */
        val ACTOR: Actor = Actor()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ActorRecord> = ActorRecord::class.java

    /**
     * The column <code>public.actor.actor_id</code>.
     */
    val ACTOR_ID: TableField<ActorRecord, Long?> = createField(DSL.name("actor_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.actor.first_name</code>.
     */
    val FIRST_NAME: TableField<ActorRecord, String?> = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "")

    /**
     * The column <code>public.actor.last_name</code>.
     */
    val LAST_NAME: TableField<ActorRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "")

    /**
     * The column <code>public.actor.last_update</code>.
     */
    val LAST_UPDATE: TableField<ActorRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<ActorRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ActorRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.actor</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.actor</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.actor</code> table reference
     */
    constructor(): this(DSL.name("actor"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ActorRecord>): this(Internal.createPathAlias(child, key), child, key, ACTOR, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_ACTOR_LAST_NAME)
    override fun getIdentity(): Identity<ActorRecord, Long?> = super.getIdentity() as Identity<ActorRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<ActorRecord> = ACTOR_PKEY
    override fun `as`(alias: String): Actor = Actor(DSL.name(alias), this)
    override fun `as`(alias: Name): Actor = Actor(alias, this)
    override fun `as`(alias: Table<*>): Actor = Actor(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Actor = Actor(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Actor = Actor(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Actor = Actor(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Long?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row4<Long?, String?, String?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}

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
import org.jooq.Row1
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.records.FilmNotInStockRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmNotInStock(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, FilmNotInStockRecord>?,
    aliased: Table<FilmNotInStockRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<FilmNotInStockRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.function()
) {
    companion object {

        /**
         * The reference instance of <code>public.film_not_in_stock</code>
         */
        val FILM_NOT_IN_STOCK: FilmNotInStock = FilmNotInStock()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<FilmNotInStockRecord> = FilmNotInStockRecord::class.java

    /**
     * The column <code>public.film_not_in_stock.p_film_count</code>.
     */
    val P_FILM_COUNT: TableField<FilmNotInStockRecord, Int?> = createField(DSL.name("p_film_count"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<FilmNotInStockRecord>?): this(alias, null, null, aliased, arrayOf(
        DSL.value(null, SQLDataType.BIGINT),
        DSL.value(null, SQLDataType.BIGINT)
    ))
    private constructor(alias: Name, aliased: Table<FilmNotInStockRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.film_not_in_stock</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.film_not_in_stock</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.film_not_in_stock</code> table reference
     */
    constructor(): this(DSL.name("film_not_in_stock"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): FilmNotInStock = FilmNotInStock(DSL.name(alias), this, parameters)
    override fun `as`(alias: Name): FilmNotInStock = FilmNotInStock(alias, this, parameters)
    override fun `as`(alias: Table<*>): FilmNotInStock = FilmNotInStock(alias.getQualifiedName(), this, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: String): FilmNotInStock = FilmNotInStock(DSL.name(name), null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Name): FilmNotInStock = FilmNotInStock(name, null, parameters)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): FilmNotInStock = FilmNotInStock(name.getQualifiedName(), null, parameters)

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row1<Int?> = super.fieldsRow() as Row1<Int?>

    /**
     * Call this table-valued function
     */
    fun call(
          pFilmId: Long?
        , pStoreId: Long?
    ): FilmNotInStock = FilmNotInStock(DSL.name("film_not_in_stock"), null, arrayOf(
        DSL.value(pFilmId, SQLDataType.BIGINT),
        DSL.value(pStoreId, SQLDataType.BIGINT)
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Call this table-valued function
     */
    fun call(
          pFilmId: Field<Long?>
        , pStoreId: Field<Long?>
    ): FilmNotInStock = FilmNotInStock(DSL.name("film_not_in_stock"), null, arrayOf(
        pFilmId,
        pStoreId
    )).let { if (aliased()) it.`as`(unqualifiedName) else it }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Int?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Int?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}

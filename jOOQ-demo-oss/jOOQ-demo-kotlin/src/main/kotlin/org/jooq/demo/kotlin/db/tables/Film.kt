/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.math.BigDecimal
import java.time.LocalDateTime

import kotlin.collections.Collection
import kotlin.collections.List

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
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.domains.YEAR
import org.jooq.demo.kotlin.db.enums.MpaaRating
import org.jooq.demo.kotlin.db.indexes.FILM_FULLTEXT_IDX
import org.jooq.demo.kotlin.db.indexes.IDX_FK_LANGUAGE_ID
import org.jooq.demo.kotlin.db.indexes.IDX_FK_ORIGINAL_LANGUAGE_ID
import org.jooq.demo.kotlin.db.indexes.IDX_TITLE
import org.jooq.demo.kotlin.db.keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY
import org.jooq.demo.kotlin.db.keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY
import org.jooq.demo.kotlin.db.keys.FILM_PKEY
import org.jooq.demo.kotlin.db.keys.FILM__FILM_LANGUAGE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.INVENTORY__INVENTORY_FILM_ID_FKEY
import org.jooq.demo.kotlin.db.tables.Actor.ActorPath
import org.jooq.demo.kotlin.db.tables.Category.CategoryPath
import org.jooq.demo.kotlin.db.tables.FilmActor.FilmActorPath
import org.jooq.demo.kotlin.db.tables.FilmCategory.FilmCategoryPath
import org.jooq.demo.kotlin.db.tables.Inventory.InventoryPath
import org.jooq.demo.kotlin.db.tables.Language.LanguagePath
import org.jooq.demo.kotlin.db.tables.records.FilmRecord
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Film(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, FilmRecord>?,
    parentPath: InverseForeignKey<out Record, FilmRecord>?,
    aliased: Table<FilmRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<FilmRecord>(
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
         * The reference instance of <code>public.film</code>
         */
        val FILM: Film = Film()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<FilmRecord> = FilmRecord::class.java

    /**
     * The column <code>public.film.film_id</code>.
     */
    val FILM_ID: TableField<FilmRecord, Long?> = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.film.title</code>.
     */
    val TITLE: TableField<FilmRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "")

    /**
     * The column <code>public.film.description</code>.
     */
    val DESCRIPTION: TableField<FilmRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.film.release_year</code>.
     */
    val RELEASE_YEAR: TableField<FilmRecord, Int?> = createField(DSL.name("release_year"), YEAR.getDataType(), this, "")

    /**
     * The column <code>public.film.language_id</code>.
     */
    val LANGUAGE_ID: TableField<FilmRecord, Long?> = createField(DSL.name("language_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.film.original_language_id</code>.
     */
    val ORIGINAL_LANGUAGE_ID: TableField<FilmRecord, Long?> = createField(DSL.name("original_language_id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.film.rental_duration</code>.
     */
    val RENTAL_DURATION: TableField<FilmRecord, Short?> = createField(DSL.name("rental_duration"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field(DSL.raw("3"), SQLDataType.SMALLINT)), this, "")

    /**
     * The column <code>public.film.rental_rate</code>.
     */
    val RENTAL_RATE: TableField<FilmRecord, BigDecimal?> = createField(DSL.name("rental_rate"), SQLDataType.NUMERIC(4, 2).nullable(false).defaultValue(DSL.field(DSL.raw("4.99"), SQLDataType.NUMERIC)), this, "")

    /**
     * The column <code>public.film.length</code>.
     */
    val LENGTH: TableField<FilmRecord, Short?> = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "")

    /**
     * The column <code>public.film.replacement_cost</code>.
     */
    val REPLACEMENT_COST: TableField<FilmRecord, BigDecimal?> = createField(DSL.name("replacement_cost"), SQLDataType.NUMERIC(5, 2).nullable(false).defaultValue(DSL.field(DSL.raw("19.99"), SQLDataType.NUMERIC)), this, "")

    /**
     * The column <code>public.film.rating</code>.
     */
    val RATING: TableField<FilmRecord, MpaaRating?> = createField(DSL.name("rating"), SQLDataType.VARCHAR.defaultValue(DSL.field(DSL.raw("'G'::mpaa_rating"), SQLDataType.VARCHAR)).asEnumDataType(MpaaRating::class.java), this, "")

    /**
     * The column <code>public.film.last_update</code>.
     */
    val LAST_UPDATE: TableField<FilmRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>public.film.special_features</code>.
     */
    val SPECIAL_FEATURES: TableField<FilmRecord, Array<String?>?> = createField(DSL.name("special_features"), SQLDataType.CLOB.array(), this, "")
    @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
    val FULLTEXT: TableField<FilmRecord, Any?> = createField(DSL.name("fulltext"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"").nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<FilmRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<FilmRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<FilmRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.film</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.film</code> table reference
     */
    constructor(): this(DSL.name("film"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, FilmRecord>?, parentPath: InverseForeignKey<out Record, FilmRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, FILM, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class FilmPath : Film, Path<FilmRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, FilmRecord>?, parentPath: InverseForeignKey<out Record, FilmRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<FilmRecord>): super(alias, aliased)
        override fun `as`(alias: String): FilmPath = FilmPath(DSL.name(alias), this)
        override fun `as`(alias: Name): FilmPath = FilmPath(alias, this)
        override fun `as`(alias: Table<*>): FilmPath = FilmPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(FILM_FULLTEXT_IDX, IDX_FK_LANGUAGE_ID, IDX_FK_ORIGINAL_LANGUAGE_ID, IDX_TITLE)
    override fun getIdentity(): Identity<FilmRecord, Long?> = super.getIdentity() as Identity<FilmRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<FilmRecord> = FILM_PKEY
    override fun getReferences(): List<ForeignKey<FilmRecord, *>> = listOf(FILM__FILM_LANGUAGE_ID_FKEY, FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY)

    private lateinit var _filmLanguageIdFkey: LanguagePath

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_language_id_fkey</code> key.
     */
    fun filmLanguageIdFkey(): LanguagePath {
        if (!this::_filmLanguageIdFkey.isInitialized)
            _filmLanguageIdFkey = LanguagePath(this, FILM__FILM_LANGUAGE_ID_FKEY, null)

        return _filmLanguageIdFkey;
    }

    val filmLanguageIdFkey: LanguagePath
        get(): LanguagePath = filmLanguageIdFkey()

    private lateinit var _filmOriginalLanguageIdFkey: LanguagePath

    /**
     * Get the implicit join path to the <code>public.language</code> table, via
     * the <code>film_original_language_id_fkey</code> key.
     */
    fun filmOriginalLanguageIdFkey(): LanguagePath {
        if (!this::_filmOriginalLanguageIdFkey.isInitialized)
            _filmOriginalLanguageIdFkey = LanguagePath(this, FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY, null)

        return _filmOriginalLanguageIdFkey;
    }

    val filmOriginalLanguageIdFkey: LanguagePath
        get(): LanguagePath = filmOriginalLanguageIdFkey()

    private lateinit var _filmActor: FilmActorPath

    /**
     * Get the implicit to-many join path to the <code>public.film_actor</code>
     * table
     */
    fun filmActor(): FilmActorPath {
        if (!this::_filmActor.isInitialized)
            _filmActor = FilmActorPath(this, null, FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY.inverseKey)

        return _filmActor;
    }

    val filmActor: FilmActorPath
        get(): FilmActorPath = filmActor()

    private lateinit var _filmCategory: FilmCategoryPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.film_category</code> table
     */
    fun filmCategory(): FilmCategoryPath {
        if (!this::_filmCategory.isInitialized)
            _filmCategory = FilmCategoryPath(this, null, FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY.inverseKey)

        return _filmCategory;
    }

    val filmCategory: FilmCategoryPath
        get(): FilmCategoryPath = filmCategory()

    private lateinit var _inventory: InventoryPath

    /**
     * Get the implicit to-many join path to the <code>public.inventory</code>
     * table
     */
    fun inventory(): InventoryPath {
        if (!this::_inventory.isInitialized)
            _inventory = InventoryPath(this, null, INVENTORY__INVENTORY_FILM_ID_FKEY.inverseKey)

        return _inventory;
    }

    val inventory: InventoryPath
        get(): InventoryPath = inventory()

    /**
     * Get the implicit many-to-many join path to the <code>public.actor</code>
     * table
     */
    val actor: ActorPath
        get(): ActorPath = filmActor().actor()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.category</code> table
     */
    val category: CategoryPath
        get(): CategoryPath = filmCategory().category()
    override fun `as`(alias: String): Film = Film(DSL.name(alias), this)
    override fun `as`(alias: Name): Film = Film(alias, this)
    override fun `as`(alias: Table<*>): Film = Film(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Film = Film(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Film = Film(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Film = Film(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Film = Film(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Film = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Film = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Film = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Film = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Film = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Film = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Film = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Film = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Film = where(DSL.notExists(select))
}

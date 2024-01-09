/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Deprecated
import java.lang.Integer
import java.lang.Long
import java.lang.Object
import java.lang.Short
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
import org.jooq.Path
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
import org.jooq.demo.skala.db.Domains
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.enums.MpaaRating
import org.jooq.demo.skala.db.tables.Language.LanguagePath
import org.jooq.demo.skala.db.tables.records.FilmRecord
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Film {

  /**
   * The reference instance of <code>public.film</code>
   */
  val FILM = new Film

  /**
   * A subtype implementing {@link Path} for simplified path-based joins.
   */
  class FilmPath(path: Table[_ <: Record], childPath: ForeignKey[_ <: Record, FilmRecord], parentPath: InverseForeignKey[_ <: Record, FilmRecord]) extends Film(path, childPath, parentPath) with Path[FilmRecord]
}

/**
 * This class is generated by jOOQ.
 */
class Film(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, FilmRecord],
  parentPath: InverseForeignKey[_ <: Record, FilmRecord],
  aliased: Table[FilmRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[FilmRecord](
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
  override def getRecordType: Class[FilmRecord] = classOf[FilmRecord]

  /**
   * The column <code>public.film.film_id</code>.
   */
  val FILM_ID: TableField[FilmRecord, Long] = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.film.title</code>.
   */
  val TITLE: TableField[FilmRecord, String] = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), "")

  /**
   * The column <code>public.film.description</code>.
   */
  val DESCRIPTION: TableField[FilmRecord, String] = createField(DSL.name("description"), SQLDataType.CLOB, "")

  /**
   * The column <code>public.film.release_year</code>.
   */
  val RELEASE_YEAR: TableField[FilmRecord, Integer] = createField(DSL.name("release_year"), Domains.YEAR.getDataType(), "")

  /**
   * The column <code>public.film.language_id</code>.
   */
  val LANGUAGE_ID: TableField[FilmRecord, Long] = createField(DSL.name("language_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.film.original_language_id</code>.
   */
  val ORIGINAL_LANGUAGE_ID: TableField[FilmRecord, Long] = createField(DSL.name("original_language_id"), SQLDataType.BIGINT, "")

  /**
   * The column <code>public.film.rental_duration</code>.
   */
  val RENTAL_DURATION: TableField[FilmRecord, Short] = createField(DSL.name("rental_duration"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field(DSL.raw("3"), SQLDataType.SMALLINT)), "")

  /**
   * The column <code>public.film.rental_rate</code>.
   */
  val RENTAL_RATE: TableField[FilmRecord, BigDecimal] = createField(DSL.name("rental_rate"), SQLDataType.NUMERIC(4, 2).nullable(false).defaultValue(DSL.field(DSL.raw("4.99"), SQLDataType.NUMERIC)), "")

  /**
   * The column <code>public.film.length</code>.
   */
  val LENGTH: TableField[FilmRecord, Short] = createField(DSL.name("length"), SQLDataType.SMALLINT, "")

  /**
   * The column <code>public.film.replacement_cost</code>.
   */
  val REPLACEMENT_COST: TableField[FilmRecord, BigDecimal] = createField(DSL.name("replacement_cost"), SQLDataType.NUMERIC(5, 2).nullable(false).defaultValue(DSL.field(DSL.raw("19.99"), SQLDataType.NUMERIC)), "")

  /**
   * The column <code>public.film.rating</code>.
   */
  val RATING: TableField[FilmRecord, MpaaRating] = createField(DSL.name("rating"), SQLDataType.VARCHAR.defaultValue(DSL.field(DSL.raw("'G'::mpaa_rating"), SQLDataType.VARCHAR)).asEnumDataType(classOf[MpaaRating]), "")

  /**
   * The column <code>public.film.last_update</code>.
   */
  val LAST_UPDATE: TableField[FilmRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  /**
   * The column <code>public.film.special_features</code>.
   */
  val SPECIAL_FEATURES: TableField[FilmRecord, Array[String]] = createField(DSL.name("special_features"), SQLDataType.CLOB.array(), "")

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  val FULLTEXT: TableField[FilmRecord, Object] = createField(DSL.name("fulltext"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"").nullable(false), "")

  private def this(alias: Name, aliased: Table[FilmRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[FilmRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.film</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Film.FILM)

  /**
   * Create an aliased <code>public.film</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Film.FILM)

  /**
   * Create a <code>public.film</code> table reference
   */
  def this() = this(DSL.name("film"), null)

  def this(path: Table[_ <: Record], childPath: ForeignKey[_ <: Record, FilmRecord], parentPath: InverseForeignKey[_ <: Record, FilmRecord]) = this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, org.jooq.demo.skala.db.tables.Film.FILM, null, null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.FILM_FULLTEXT_IDX, Indexes.IDX_FK_LANGUAGE_ID, Indexes.IDX_FK_ORIGINAL_LANGUAGE_ID, Indexes.IDX_TITLE)

  override def getIdentity: Identity[FilmRecord, Long] = super.getIdentity.asInstanceOf[ Identity[FilmRecord, Long] ]

  override def getPrimaryKey: UniqueKey[FilmRecord] = Keys.FILM_PKEY

  override def getReferences: List[ ForeignKey[FilmRecord, _] ] = Arrays.asList[ ForeignKey[FilmRecord, _] ](Keys.FILM__FILM_LANGUAGE_ID_FKEY, Keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.language</code> table, via
   * the <code>film_language_id_fkey</code> key.
   */
  lazy val filmLanguageIdFkey: LanguagePath = { new LanguagePath(this, Keys.FILM__FILM_LANGUAGE_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.language</code> table, via
   * the <code>film_original_language_id_fkey</code> key.
   */
  lazy val filmOriginalLanguageIdFkey: LanguagePath = { new LanguagePath(this, Keys.FILM__FILM_ORIGINAL_LANGUAGE_ID_FKEY, null) }
  override def as(alias: String): Film = new Film(DSL.name(alias), this)
  override def as(alias: Name): Film = new Film(alias, this)
  override def as(alias: Table[_]): Film = new Film(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Film = new Film(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Film = new Film(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Film = new Film(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): Film = new Film(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): Film = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): Film = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): Film = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): Film = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): Film = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): Film = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): Film = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): Film = where(DSL.notExists(select))
}

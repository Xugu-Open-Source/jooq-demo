/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.math.BigDecimal

import org.jooq.demo.kotlin.db.enums.MpaaRating
import org.jooq.demo.kotlin.db.tables.FilmList
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmListRecord() : TableRecordImpl<FilmListRecord>(FilmList.FILM_LIST) {

    open var fid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var title: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var category: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var price: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    open var length: Short?
        set(value): Unit = set(5, value)
        get(): Short? = get(5) as Short?

    open var rating: MpaaRating?
        set(value): Unit = set(6, value)
        get(): MpaaRating? = get(6) as MpaaRating?

    open var actors: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised FilmListRecord
     */
    constructor(fid: Long? = null, title: String? = null, description: String? = null, category: String? = null, price: BigDecimal? = null, length: Short? = null, rating: MpaaRating? = null, actors: String? = null): this() {
        this.fid = fid
        this.title = title
        this.description = description
        this.category = category
        this.price = price
        this.length = length
        this.rating = rating
        this.actors = actors
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmListRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.FilmList?): this() {
        if (value != null) {
            this.fid = value.fid
            this.title = value.title
            this.description = value.description
            this.category = value.category
            this.price = value.price
            this.length = value.length
            this.rating = value.rating
            this.actors = value.actors
            resetChangedOnNotNull()
        }
    }
}

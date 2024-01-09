/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import java.math.BigDecimal

import org.jooq.demo.kotlin.db.tables.SalesByFilmCategory
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class SalesByFilmCategoryRecord() : TableRecordImpl<SalesByFilmCategoryRecord>(SalesByFilmCategory.SALES_BY_FILM_CATEGORY) {

    open var category: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var totalSales: BigDecimal?
        set(value): Unit = set(1, value)
        get(): BigDecimal? = get(1) as BigDecimal?

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    constructor(category: String? = null, totalSales: BigDecimal? = null): this() {
        this.category = category
        this.totalSales = totalSales
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.SalesByFilmCategory?): this() {
        if (value != null) {
            this.category = value.category
            this.totalSales = value.totalSales
            resetChangedOnNotNull()
        }
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record SalesByStore(
    String store,
    String manager,
    BigDecimal totalSales
) implements Serializable {

    private static final long serialVersionUID = 1L;

}

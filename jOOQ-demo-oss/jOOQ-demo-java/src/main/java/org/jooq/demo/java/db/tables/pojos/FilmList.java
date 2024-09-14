/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import org.jooq.demo.java.db.enums.MpaaRating;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record FilmList(
    Long fid,
    String title,
    String description,
    String category,
    BigDecimal price,
    Short length,
    MpaaRating rating,
    String actors
) implements Serializable {

    private static final long serialVersionUID = 1L;

}

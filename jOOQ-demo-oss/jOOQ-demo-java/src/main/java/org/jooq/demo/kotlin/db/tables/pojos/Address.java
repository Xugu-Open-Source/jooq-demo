/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record Address(
    Long addressId,
    String address,
    String address2,
    String district,
    Long cityId,
    String postalCode,
    String phone,
    LocalDateTime lastUpdate
) implements Serializable {

    private static final long serialVersionUID = 1L;

}

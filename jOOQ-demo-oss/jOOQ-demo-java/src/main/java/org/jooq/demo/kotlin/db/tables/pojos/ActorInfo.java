/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record ActorInfo(
    Long actorId,
    String firstName,
    String lastName,
    String filmInfo
) implements Serializable {

    private static final long serialVersionUID = 1L;

}

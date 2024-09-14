/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.demo.java.db.tables.Rental;
import org.jooq.demo.java.db.tables.records.RentalRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RentalDao extends DAOImpl<RentalRecord, org.jooq.demo.java.db.tables.pojos.Rental, Long> {

    /**
     * Create a new RentalDao without any configuration
     */
    public RentalDao() {
        super(Rental.RENTAL, org.jooq.demo.java.db.tables.pojos.Rental.class);
    }

    /**
     * Create a new RentalDao with an attached configuration
     */
    public RentalDao(Configuration configuration) {
        super(Rental.RENTAL, org.jooq.demo.java.db.tables.pojos.Rental.class, configuration);
    }

    @Override
    public Long getId(org.jooq.demo.java.db.tables.pojos.Rental object) {
        return object.rentalId();
    }

    /**
     * Fetch records that have <code>rental_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfRentalId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental.RENTAL.RENTAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByRentalId(Long... values) {
        return fetch(Rental.RENTAL.RENTAL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public org.jooq.demo.java.db.tables.pojos.Rental fetchOneByRentalId(Long value) {
        return fetchOne(Rental.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public Optional<org.jooq.demo.java.db.tables.pojos.Rental> fetchOptionalByRentalId(Long value) {
        return fetchOptional(Rental.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch records that have <code>rental_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfRentalDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental.RENTAL.RENTAL_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_date IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByRentalDate(LocalDateTime... values) {
        return fetch(Rental.RENTAL.RENTAL_DATE, values);
    }

    /**
     * Fetch records that have <code>inventory_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfInventoryId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental.RENTAL.INVENTORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>inventory_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByInventoryId(Long... values) {
        return fetch(Rental.RENTAL.INVENTORY_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfCustomerId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental.RENTAL.CUSTOMER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByCustomerId(Long... values) {
        return fetch(Rental.RENTAL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>return_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfReturnDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental.RENTAL.RETURN_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>return_date IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByReturnDate(LocalDateTime... values) {
        return fetch(Rental.RENTAL.RETURN_DATE, values);
    }

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfStaffId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental.RENTAL.STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByStaffId(Long... values) {
        return fetch(Rental.RENTAL.STAFF_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental.RENTAL.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Rental> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Rental.RENTAL.LAST_UPDATE, values);
    }
}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.demo.java.db.tables.Inventory;
import org.jooq.demo.java.db.tables.records.InventoryRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryDao extends DAOImpl<InventoryRecord, org.jooq.demo.java.db.tables.pojos.Inventory, Long> {

    /**
     * Create a new InventoryDao without any configuration
     */
    public InventoryDao() {
        super(Inventory.INVENTORY, org.jooq.demo.java.db.tables.pojos.Inventory.class);
    }

    /**
     * Create a new InventoryDao with an attached configuration
     */
    public InventoryDao(Configuration configuration) {
        super(Inventory.INVENTORY, org.jooq.demo.java.db.tables.pojos.Inventory.class, configuration);
    }

    @Override
    public Long getId(org.jooq.demo.java.db.tables.pojos.Inventory object) {
        return object.inventoryId();
    }

    /**
     * Fetch records that have <code>inventory_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchRangeOfInventoryId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Inventory.INVENTORY.INVENTORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>inventory_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchByInventoryId(Long... values) {
        return fetch(Inventory.INVENTORY.INVENTORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>inventory_id = value</code>
     */
    public org.jooq.demo.java.db.tables.pojos.Inventory fetchOneByInventoryId(Long value) {
        return fetchOne(Inventory.INVENTORY.INVENTORY_ID, value);
    }

    /**
     * Fetch a unique record that has <code>inventory_id = value</code>
     */
    public Optional<org.jooq.demo.java.db.tables.pojos.Inventory> fetchOptionalByInventoryId(Long value) {
        return fetchOptional(Inventory.INVENTORY.INVENTORY_ID, value);
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchRangeOfFilmId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Inventory.INVENTORY.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchByFilmId(Long... values) {
        return fetch(Inventory.INVENTORY.FILM_ID, values);
    }

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchRangeOfStoreId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Inventory.INVENTORY.STORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchByStoreId(Long... values) {
        return fetch(Inventory.INVENTORY.STORE_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Inventory.INVENTORY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Inventory> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Inventory.INVENTORY.LAST_UPDATE, values);
    }
}

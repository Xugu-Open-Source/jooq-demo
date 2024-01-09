/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.demo.java.db.tables.FilmCategory;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_category.film_id</code>.
     */
    public void setFilmId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_category.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.film_category.category_id</code>.
     */
    public void setCategoryId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_category.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.film_category.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(Long filmId, Long categoryId, LocalDateTime lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        setFilmId(filmId);
        setCategoryId(categoryId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(org.jooq.demo.java.db.tables.pojos.FilmCategory value) {
        super(FilmCategory.FILM_CATEGORY);

        if (value != null) {
            setFilmId(value.filmId());
            setCategoryId(value.categoryId());
            setLastUpdate(value.lastUpdate());
            resetChangedOnNotNull();
        }
    }
}

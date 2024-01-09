/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.records;


import org.jooq.demo.java.db.tables.FilmNotInStock;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmNotInStockRecord extends TableRecordImpl<FilmNotInStockRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public void setPFilmCount(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public Integer getPFilmCount() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmNotInStockRecord
     */
    public FilmNotInStockRecord() {
        super(FilmNotInStock.FILM_NOT_IN_STOCK);
    }

    /**
     * Create a detached, initialised FilmNotInStockRecord
     */
    public FilmNotInStockRecord(Integer pFilmCount) {
        super(FilmNotInStock.FILM_NOT_IN_STOCK);

        setPFilmCount(pFilmCount);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FilmNotInStockRecord
     */
    public FilmNotInStockRecord(org.jooq.demo.java.db.tables.pojos.FilmNotInStock value) {
        super(FilmNotInStock.FILM_NOT_IN_STOCK);

        if (value != null) {
            setPFilmCount(value.pFilmCount());
            resetChangedOnNotNull();
        }
    }
}

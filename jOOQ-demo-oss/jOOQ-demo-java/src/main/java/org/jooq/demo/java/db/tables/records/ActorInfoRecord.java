/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.records;


import org.jooq.demo.java.db.tables.ActorInfo;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfoRecord extends TableRecordImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.actor_info.actor_id</code>.
     */
    public void setActorId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.actor_info.actor_id</code>.
     */
    public Long getActorId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.actor_info.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.actor_info.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.actor_info.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.actor_info.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.actor_info.film_info</code>.
     */
    public void setFilmInfo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.actor_info.film_info</code>.
     */
    public String getFilmInfo() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorInfoRecord
     */
    public ActorInfoRecord() {
        super(ActorInfo.ACTOR_INFO);
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(Long actorId, String firstName, String lastName, String filmInfo) {
        super(ActorInfo.ACTOR_INFO);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setFilmInfo(filmInfo);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(org.jooq.demo.java.db.tables.pojos.ActorInfo value) {
        super(ActorInfo.ACTOR_INFO);

        if (value != null) {
            setActorId(value.actorId());
            setFirstName(value.firstName());
            setLastName(value.lastName());
            setFilmInfo(value.filmInfo());
            resetChangedOnNotNull();
        }
    }
}

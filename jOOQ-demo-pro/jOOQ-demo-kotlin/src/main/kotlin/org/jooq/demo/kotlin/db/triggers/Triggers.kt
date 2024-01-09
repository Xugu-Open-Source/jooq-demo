/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.triggers


import java.util.Arrays
import java.util.EnumSet

import org.jooq.Trigger
import org.jooq.TriggerEvent
import org.jooq.TriggerExecution
import org.jooq.TriggerTime
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.Actor
import org.jooq.demo.kotlin.db.tables.Film
import org.jooq.impl.DSL
import org.jooq.impl.Internal



/**
 * The trigger <code>public.film_fulltext_trigger</code>
 */
val FILM_FULLTEXT_TRIGGER: Trigger = Internal.createTrigger(Public.PUBLIC, Film.FILM, Arrays.asList(), DSL.name("film_fulltext_trigger"), DSL.comment(""), TriggerTime.BEFORE, EnumSet.of(TriggerEvent.INSERT, TriggerEvent.UPDATE), TriggerExecution.FOR_EACH_ROW, null, 1, DSL.statement("EXECUTE FUNCTION tsvector_update_trigger('fulltext', 'pg_catalog.english', 'title', 'description')"))

/**
 * The trigger <code>public.last_updated</code>
 */
val LAST_UPDATED: Trigger = Internal.createTrigger(Public.PUBLIC, Actor.ACTOR, Arrays.asList(), DSL.name("last_updated"), DSL.comment(""), TriggerTime.BEFORE, EnumSet.of(TriggerEvent.UPDATE), TriggerExecution.FOR_EACH_ROW, null, 1, DSL.statement("EXECUTE FUNCTION last_updated()"))

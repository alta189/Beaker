package com.alta189.beaker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.alta189.annotations.RequiredParameters;

/**
 * Marks a method as an handler for an event
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@RequiredParameters(Event.class)
public @interface EventHandler {
	/**
	 * <p>
	 *     Marks the priority of the event handler
	 * </p>
	 * <p>
	 *     Default is Priority.DEFAULT
	 * </p>
	 */
	Priority priority() default Priority.DEFAULT;

	/**
	 * <p>
	 *     Marks whether the event handler ignores if the
	 *     event has been cancelled
	 * </p>
	 * <p>
	 *     Defaults to false
	 * </p>
	 */
	boolean ignoreCancelled() default false;
}

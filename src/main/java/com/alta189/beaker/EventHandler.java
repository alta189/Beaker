/*
 * This file is part of Beaker.
 *
 * Copyright (c) 2013, alta189 <http://beaker.alta189.com/>
 * Beaker is licensed under the GNU Lesser General Public License.
 *
 * Beaker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Beaker is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.alta189.beaker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as an handler for an event
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
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

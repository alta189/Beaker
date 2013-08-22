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

import com.alta189.commons.objects.Named;

import org.apache.commons.lang3.Validate;

public class HandlerRegistration {
	/**
	 * Event executor
	 */
	private final EventExecutor executor;
	/**
	 * Priority
	 */
	private final Priority priority;
	/**
	 * Marks whether the listener ignores if the event has been cancelled
	 */
	private final boolean ignoredCancelled;
	/**
	 * Owner
	 */
	private final Named owner;

	public HandlerRegistration(EventExecutor executor, Priority priority, boolean ignoredCancelled, Named owner) {
		Validate.notNull(executor);
		Validate.notNull(priority);
		Validate.notNull(owner);

		this.executor = executor;
		this.priority = priority;
		this.ignoredCancelled = ignoredCancelled;
		this.owner = owner;
	}

	/**
	 * Returns the handler's executor
	 *
	 * @return executor of the handler
	 */
	public EventExecutor getExecutor() {
		return executor;
	}

	/**
	 * Returns the handler's priority
	 *
	 * @return priority of the handler
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * Returns whether the listener ignores
	 * if an event has been cancelled
	 *
	 * @return ignored cancelled flag
	 */
	public boolean isIgnoredCancelled() {
		return ignoredCancelled;
	}

	/**
	 * Returns the handler's owner
	 *
	 * @return owner of the handler
	 */
	public Named getOwner() {
		return owner;
	}
}

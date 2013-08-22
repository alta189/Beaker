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

public abstract class Event {
	/**
	 * Cancelled, defaults to false
	 */
	public boolean cancelled = false;

	/**
	 * <p>
	 *     Returns the name of the event
	 * </p>
	 * <p>
	 *     Defaults to the simple name of the class
	 * </p>
	 *
	 * @return
	 */
	public String getName() {
		return getClass().getSimpleName();
	}

	/**
	 * <p>
	 *     Returns whether the event has been marked as cancelled
	 * </p>
	 * <p>
	 *     Events that can actually be cancelled and do not ignore
	 *     this should implement {@link Cancellable}
	 * </p>
	 *
	 * @return whether the event has been marked for cancellation
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * <p>
	 *     Returns whether the event has been marked as cancelled
	 * </p>
	 * <p>
	 *     Events that can actually be cancelled and do not ignore
	 *     this should implement {@link Cancellable}
	 * </p>
	 *
	 * @param cancelled  true if cancelled
	 */
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}

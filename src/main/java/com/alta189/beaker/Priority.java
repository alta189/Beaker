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

/**
 * Defines the order in which events are given to handlers
 */
public enum Priority {
	/**
	 * Called first
	 */
	EARLIEST(0),
	/**
	 * Called second
	 */
	EARLIER(1),
	/**
	 * Called third
	 */
	EARLY(2),
	/**
	 * <p>
	 *     Called fourth
	 * </p>
	 * <p>
	 *     Its the default Priority
	 * </p>
	 */
	DEFAULT(3),
	/**
	 * Called fifth
	 */
	LATE(4),
	/**
	 * Called sixth
	 */
	LATER(5),
	/**
	 * Called seventh
	 */
	LATEST(6),
	/**
	 * <p>
	 *     Called last
	 * </p>
	 * <p>
	 *     The event should not be modified at this stage
	 * </p>
	 */
	MONITOR(7);
	/**
	 * Index of the priority
	 */
	private final int index;

	private Priority(int index) {
		this.index = index;
	}

	/**
	 * Returns the priorities index
	 *
	 * @return index of the priority
	 */
	public int getIndex() {
		return index;
	}
}

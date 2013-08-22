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

import java.util.Comparator;

import com.alta189.commons.util.CastUtil;

import org.apache.commons.lang3.Validate;

public class HandlerPriorityComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Validate.notNull(o1);
		Validate.notNull(o2);

		Validate.isInstanceOf(HandlerRegistration.class, o1);
		Validate.isInstanceOf(HandlerRegistration.class, o2);

		Priority priority1 = CastUtil.safeCast(o1, HandlerRegistration.class).getPriority();
		Priority priority2 = CastUtil.safeCast(o2, HandlerRegistration.class).getPriority();

		if (priority1.getIndex() == priority2.getIndex()) {
			return 0;
		} else if (priority1.getIndex() < priority2.getIndex()) {
			return -1;
		} else if (priority1.getIndex() > priority2.getIndex()) {
			return 1;
		}

		throw new RuntimeException("should not have made it this far");
	}
}

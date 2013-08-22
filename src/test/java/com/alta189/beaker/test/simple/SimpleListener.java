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
package com.alta189.beaker.test.simple;

import com.alta189.beaker.EventHandler;
import com.alta189.beaker.Listener;

public class SimpleListener implements Listener {
	private final long data;
	private boolean result = false;

	public SimpleListener(long data) {
		this.data = data;
	}

	@EventHandler
	public void simpleEvent(SimpleEvent event) {
		if (event.getData() == data) {
			result = true;
		}
	}

	public long getData() {
		return data;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}

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

import java.lang.reflect.Method;

import com.alta189.commons.util.ReflectionUtil;

public class AnnotatedEventExecutor implements EventExecutor {
	/**
	 * Listener object
	 */
	private final Listener listener;
	/**
	 * Method to invoke
	 */
	private final Method method;

	public AnnotatedEventExecutor(Listener listener, Method method) {
		this.listener = listener;
		this.method = method;
	}

	/**
	 * Executes an event
	 *
	 * @param event event to be executed
	 */
	@Override
	public void execute(Event event) {
		ReflectionUtil.invokeMethod(method, listener, event);
	}
}

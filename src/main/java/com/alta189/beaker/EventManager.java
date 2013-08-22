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

import com.alta189.beaker.exceptions.EventExecutorException;
import com.alta189.beaker.exceptions.EventRegistrationException;
import com.alta189.commons.objects.Named;

/**
 * Interface that defines how events are handed
 */
public interface EventManager {
	/**
	 * Calls the event
	 *
	 * @param event  event to be called
	 */
	public void call(Event event);

	/**
	 * Registers all the {@link EventHandler}s contained in the
	 * Listener
	 *
	 * @param listener  registration, not null
	 * @param owner  owner of the listener, not null
	 * @throws EventRegistrationException
	 */
	public void registerListener(Listener listener, Named owner) throws EventRegistrationException;

	/**
	 * Registers a single {@link EventExecutor}
	 *
	 * @param event  event to register to the executor to, not null
	 * @param eventExecutor  executor to be registered, not null
	 * @param priority  the executor's priority, not null
	 * @param owner  the owner of the executor, not null
	 * @throws EventRegistrationException
	 */
	public void registerExecutor(Class<? extends Event> event, EventExecutor eventExecutor, Priority priority, Named owner) throws EventRegistrationException;

	/**
	 * Registers a single {@link EventExecutor}
	 *
	 * @param event  event to register to the executor to, not null
	 * @param eventExecutor executor to be registered, not null
	 * @param priority the executor's priority, not null
	 * @param ignoreCancelled  whether a listener ignores if an event has been cancelled, not null
	 * @param owner the owner of the executor, not null
	 * @throws EventRegistrationException
	 */
	public void registerExecutor(Class<? extends Event> event, EventExecutor eventExecutor, Priority priority, boolean ignoreCancelled, Named owner) throws EventRegistrationException;
}

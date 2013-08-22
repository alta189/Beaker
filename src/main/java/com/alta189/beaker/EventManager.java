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

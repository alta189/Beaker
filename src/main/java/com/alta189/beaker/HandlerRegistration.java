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

package com.alta189.beaker;

/**
 * Interface for executing an event
 */
public interface EventExecutor {
	/**
	 * Executes an event
	 *
	 * @param event  event to be executed
	 */
	public void execute(Event event);
}

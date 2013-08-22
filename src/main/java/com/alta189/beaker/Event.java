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

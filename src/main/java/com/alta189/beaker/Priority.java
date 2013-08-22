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

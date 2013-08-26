package com.alta189.beaker.test.priority;

import com.alta189.beaker.Event;

public class PriorityEvent extends Event {
	private int i = 0;

	public int get() {
		int result = i;
		i ++;
		return result;
	}
}

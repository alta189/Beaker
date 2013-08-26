package com.alta189.beaker.test.priority;

import com.alta189.beaker.Event;
import com.alta189.beaker.EventExecutor;
import com.alta189.beaker.Listener;
import com.alta189.commons.util.CastUtil;

import junit.framework.Assert;

public class PriorityExecutor implements EventExecutor {
	private final int index;

	public PriorityExecutor(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public void execute(Event event) {
		PriorityEvent priority = CastUtil.safeCast(event);
		if (index != priority.get()) {
			Assert.fail("Event was passed in the wrong priority");
		}
	}
}

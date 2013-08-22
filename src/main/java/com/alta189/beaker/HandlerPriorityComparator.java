package com.alta189.beaker;

import java.util.Comparator;

import com.alta189.commons.util.CastUtil;

import org.apache.commons.lang3.Validate;

public class HandlerPriorityComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Validate.notNull(o1);
		Validate.notNull(o2);

		Validate.isInstanceOf(HandlerRegistration.class, o1);
		Validate.isInstanceOf(HandlerRegistration.class, o2);

		Priority priority1 = CastUtil.safeCast(o1, HandlerRegistration.class).getPriority();
		Priority priority2 = CastUtil.safeCast(o2, HandlerRegistration.class).getPriority();

		if (priority1.getIndex() == priority2.getIndex()) {
			return 0;
		} else if (priority1.getIndex() < priority2.getIndex()) {
			return -1;
		} else if (priority1.getIndex() > priority2.getIndex()) {
			return 1;
		}

		throw new RuntimeException("should not have made it this far");
	}
}

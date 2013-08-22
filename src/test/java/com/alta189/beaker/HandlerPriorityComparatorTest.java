package com.alta189.beaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alta189.commons.objects.Named;

import junit.framework.Assert;
import mockit.MockUp;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlerPriorityComparatorTest implements Named {
	private final List<HandlerRegistration> handlers = new ArrayList<HandlerRegistration>();

	@BeforeTest
	public void setup() {
		generateRegistration(Priority.DEFAULT);
		generateRegistration(Priority.EARLIER);
		generateRegistration(Priority.EARLIER);
		generateRegistration(Priority.EARLIEST);
		generateRegistration(Priority.DEFAULT);
		generateRegistration(Priority.EARLIER);
		generateRegistration(Priority.EARLY);
		generateRegistration(Priority.LATE);
		generateRegistration(Priority.LATE);
		generateRegistration(Priority.EARLIEST);
		generateRegistration(Priority.EARLY);
		generateRegistration(Priority.LATER);
		generateRegistration(Priority.LATE);
		generateRegistration(Priority.LATEST);
		generateRegistration(Priority.EARLIEST);
		generateRegistration(Priority.EARLIER);
		generateRegistration(Priority.LATE);
		generateRegistration(Priority.MONITOR);
		generateRegistration(Priority.DEFAULT);
		generateRegistration(Priority.DEFAULT);
		generateRegistration(Priority.DEFAULT);
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	private void generateRegistration(Priority priority) {
		//EventExecutor executor = new MockUp<EventExecutor>(){}.getMockInstance();
		EventExecutor executor = new EventExecutor() {
			@Override
			public void execute(Event event) {
			}
		};
		handlers.add(createRegistration(executor, priority, this));
	}

	private HandlerRegistration createRegistration(EventExecutor executor, Priority priority, Named named) {
		return new HandlerRegistration(executor, priority, false, named);
	}

	@Test
	public void sortTest() {
		Collections.sort(handlers, new HandlerPriorityComparator());

		int count = 0;
		for (HandlerRegistration reg : handlers) {
			count ++;
			if (count <= 3) {
				if (reg.getPriority() != Priority.EARLIEST) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 7) {
				if (reg.getPriority() != Priority.EARLIER) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 9) {
				if (reg.getPriority() != Priority.EARLY) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 14) {
				if (reg.getPriority() != Priority.DEFAULT) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 18) {
				if (reg.getPriority() != Priority.LATE) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 19) {
				if (reg.getPriority() != Priority.LATER) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 20) {
				if (reg.getPriority() != Priority.LATEST) {
					Assert.fail("Wrong priority");
				}
			} else if (count <= 21) {
				if (reg.getPriority() != Priority.MONITOR) {
					Assert.fail("Wrong priority");
				}
			}
		}
	}
}

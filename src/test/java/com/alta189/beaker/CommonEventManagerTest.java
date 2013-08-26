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

import com.alta189.beaker.test.priority.PriorityEvent;
import com.alta189.beaker.test.priority.PriorityExecutor;
import com.alta189.beaker.test.simple.SimpleEvent;
import com.alta189.beaker.test.simple.SimpleListener;
import com.alta189.commons.objects.Named;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonEventManagerTest implements Named {
	@Test
	public void simpleTest() {
		final EventManager manager = new CommonEventManager();

		final long data = System.currentTimeMillis();

		SimpleListener listener = new SimpleListener(data);

		manager.registerListener(listener, this);

		manager.call(new SimpleEvent(data));

		Assert.assertTrue(listener.getResult(), "Data was not passed properly");
	}

	public void priorityTest() {
		final EventManager manager = new CommonEventManager();

		final PriorityEvent event = new PriorityEvent();

		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(3), Priority.DEFAULT, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(1), Priority.EARLIER, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(4), Priority.LATE, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(0), Priority.EARLIEST, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(7), Priority.MONITOR, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(5), Priority.LATER, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(2), Priority.EARLY, this);
		manager.registerExecutor(PriorityEvent.class, new PriorityExecutor(6), Priority.LATEST, this);

		manager.call(event);
	}

	/**
	 * Returns the name of the object
	 *
	 * @return the objects named
	 */
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}
}

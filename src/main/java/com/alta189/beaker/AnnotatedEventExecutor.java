package com.alta189.beaker;

import java.lang.reflect.Method;

import com.alta189.commons.util.ReflectionUtil;

public class AnnotatedEventExecutor implements EventExecutor {
	/**
	 * Listener object
	 */
	private final Listener listener;
	/**
	 * Method to invoke
	 */
	private final Method method;

	public AnnotatedEventExecutor(Listener listener, Method method) {
		this.listener = listener;
		this.method = method;
	}

	/**
	 * Executes an event
	 *
	 * @param event event to be executed
	 */
	@Override
	public void execute(Event event) {
		ReflectionUtil.invokeMethod(method, listener, event);
	}
}

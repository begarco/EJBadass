package fr.isima.ejb.service;

import java.lang.reflect.Method;

public interface IInterceptor {
	public void before(Object object, Method method, Object ... params);
	public void after(Object object, Method method, Object ... params);
}
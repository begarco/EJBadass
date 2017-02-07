package fr.isima.ejb.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.isima.ejb.annotation.Inject;
import fr.isima.ejb.injection.BInjector;
import fr.isima.ejb.service.GoodService;
import fr.isima.ejb.service.Logger;

public class TestLog {
	
	@Inject
	Logger logger;
	
	@Inject
	GoodService service;
	
	@Before
	public void prepare() throws Exception {
		BInjector.makeAllInjection(this);
	}

	@Test
	public void test() {
		service.loggedMethod();
		assertTrue(logger.contains("GoodService logged."));
	}

}
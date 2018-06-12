package com.lender.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHomeController {

	@Test
	public void testHomeController() {
		HomeController sut = new HomeController();
		assertEquals(sut.home(), "Lend Records is working");
	}
}

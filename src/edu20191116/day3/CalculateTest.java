package edu20191116.day3;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateTest {

	Calculate cal = null;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all ~~~");
	}

	@BeforeEach
	public void before() {
		System.out.println("before ~~~");
		cal = new Calculate();
	}

	@Test
	public void addTest() {
		System.out.println("addTest");
		Assert.assertEquals(15, cal.add(10, 5));
	}

	@Test
	public void subTest() {
		System.out.println("subTest");
		Assert.assertEquals(10, cal.sub(10, 0));
	}

}

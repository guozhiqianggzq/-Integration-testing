package com.test1.testApache;

import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;

import junit.framework.TestCase;

public class MathTest extends TestCase {
	double d1[] = { -1, 1, 2, 3, 4 };
	double d2[] = { 1, 2, 3, 4, 5 };
	double d3[] = { 1, 2, 3, 11 };

	math maths = new math();
	sonmath Sonmath = new sonmath();

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testismin() {
		assertEquals(false, maths.ismin(d1));
		assertEquals(true, maths.ismin(d2));
	}

	public void testismax() {
		assertEquals(false, maths.ismax(d3));
		assertEquals(true, maths.ismax(d2));
	}

	public void testcalsum() {
		assertEquals((Double) 0.0, maths.total(d1));
		assertEquals((Double) 0.0, maths.total(d3));
		assertEquals((Double) 15.0, maths.total(d2));
	}

	public void testmin() {
		Min min = new Min();
		assertEquals((Double) 1.0, min.evaluate(d2));
	}

	public void testmax() {
		Max max = new Max();
		assertEquals((Double) 5.0, max.evaluate(d2));
	}

	public void testsonismax() {
		assertEquals(true, Sonmath.ismax(d3));
	}

	public void testsonmathtotal() {
		assertEquals((Double) 0.0, Sonmath.total(d1));
		assertEquals((Double) 17.0, Sonmath.total(d3));
		assertEquals((Double) 15.0, Sonmath.total(d2));
	}
}

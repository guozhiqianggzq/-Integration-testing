package com.test1.testApache;

import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class math {
	boolean ismin(double d[]) {
		Min min = new Min();
		if (min.evaluate(d) < 0) {
			return false;
		}
		return true;
	}

	boolean ismax(double d[]) {
		Max max = new Max();
		if (max.evaluate(d) < 10) {
			return false;
		}
		return true;
	}

	double total(double d[]) {
		Sum sum = new Sum();
		if (ismin(d) && ismax(d)) {
			return sum.evaluate(d);
		} else
			return 0;
	}

	public static void main(String[] args) {
		math maths = new math();
		double value[] = { 1, 2, 3, 4, 5 };
		System.out.println("sum=" + maths.total(value));
	}
}

class sonmath extends math {
	boolean ismax(double d[]) {
		return true;
	}
}

package com.github.mdjc.commons.args;

public class Arguments {
	public static String checkBlank(String s) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		return s;
	}

	public static <T> T checkNull(T obj) {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
		return obj;
	}

	public static long checkPositive(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}

		return n;
	}

	public static void check(boolean condition) {
		if (!condition) {
			throw new IllegalArgumentException();
		}
	}
}

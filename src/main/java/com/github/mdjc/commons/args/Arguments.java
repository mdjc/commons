package com.github.mdjc.commons.args;

public class Arguments {
	public static String checkBlank(String s, String message) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException(message);
		}
		return s;
	}
	
	public static String checkBlank(String s) {
		return checkBlank(s, "");
	}

	public static <T> T checkNull(T obj, String message) {
		if (obj == null) {
			throw new IllegalArgumentException(message);
		}
		return obj;
	}
	
	public static <T> T checkNull(T obj) {
		return checkNull(obj, "");
	}
	
	public static long checkPositive(long n, String message) {
		if (n < 0) {
			throw new IllegalArgumentException(message);
		}

		return n;
	}
	
	public static long checkPositive(long n) {
		return checkPositive(n, "");
	}
	
	public static double checkPositive(double n, String message) {
		if (n < 0) {
			throw new IllegalArgumentException(message);
		}

		return n;
	}
	
	public static double checkPositive(double n) {
		return checkPositive(n, "");
	}

	public static void check(boolean condition) {
		if (!condition) {
			throw new IllegalArgumentException();
		}
	}
}

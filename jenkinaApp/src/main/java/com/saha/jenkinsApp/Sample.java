package com.saha.jenkinsApp;

public class Sample {

	/**
	 * 
	 */
	public Sample() {
		// TODO Auto-generated constructor stub
	}

	public static int staticAdd(int x, int y) {
		return x + y;
	}

	public int add(int x, int y) {
		return x + y;
	}

	private int privateAdd(int x, int y) {
		return x + y;
	}

	public int publicAdd(int x, int y) {
		return privateAdd(x, y);
	}

}

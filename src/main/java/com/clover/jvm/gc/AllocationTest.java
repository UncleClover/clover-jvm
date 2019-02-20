package com.clover.jvm.gc;

public class AllocationTest {
	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		testMaxTenuringThreshold();
	}

	@SuppressWarnings("unused")
	public static void testMaxTenuringThreshold() {
		byte[] allcation1, allcation2, allcation3;
		allcation1 = new byte[_1MB / 4];
		allcation2 = new byte[4 * _1MB];
		allcation3 = new byte[4 * _1MB];
		allcation3 = null;
		allcation3 = new byte[4 * _1MB];
	}
}

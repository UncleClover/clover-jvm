package com.clover.jvm.method;

public class StringIntern {
	public Object instance = null;

	private byte[] bgiSize = new byte[2 * 1024 * 1024];

	public static void main(String[] args) {
		System.out.println("计算机软件");
		String s1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(s1.intern() == s1);
		//
		String s2 = new StringBuilder("ja").append("va").toString();
		System.out.println(s2.intern() == s2);
		//
		// String s3 = "123";
		// String s4 = new String("123");
		// System.out.println(s3 == s4);

//		System.out.println(2147483647 >> 31);
//		System.out.println(-2147483648 >> 31);
//
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		
//		StringIntern objA = new StringIntern();
//		StringIntern objB = new StringIntern();
//		objA.instance = objB;
//		objB.instance = objA;
//		
//		objA = null;
//		objB = null;
	}
}

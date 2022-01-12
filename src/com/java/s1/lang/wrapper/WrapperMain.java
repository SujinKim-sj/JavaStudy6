package com.java.s1.lang.wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		int num = 10;
		
		Integer n = Integer.valueOf(num);
		
		n = num;	//autoboxing
		num = n;	//autoUnboxing
		
		double d = 3.14;
		Double dd = d;
		
		Integer num2 = (int)d;
		
		d = dd;
		
		int n2 = (int)d;
		
		String nums = "3.14";
		
		double check = Double.parseDouble(nums);
		
		System.out.println(check + 1.2);	//4.34
		
		WrapperEx1 wrapperEx1 = new WrapperEx1();
		
		wrapperEx1.ex1();
		wrapperEx1.ex2();
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Long.BYTES);

		
	}
}

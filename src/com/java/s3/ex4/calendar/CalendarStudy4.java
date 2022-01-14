package com.java.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//태어난 날
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1997, 8, 29);
		System.out.println(ca2.getTime());
		
		//태어난지 몇일
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l1 - l2;
		
		System.out.println("태어난지 " + result / (1000 * 60 * 60 * 24) + "일째");
		
		//나이 계산
		System.out.println("나이 : " + result / (1000 * 60 * 60 * 24 * 365.2425));
		
		
	}

}

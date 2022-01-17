package com.java.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarStudy3 {

	public static void main(String[] args) {
		
		//1초 = 1000
		//1분 = 60
		//1시간 = 60분
		//하루 = 24시간
		//1년 = 365일
		System.out.println(1000 * 60 * 60 * 24 * 365);
		
		//현재시간
		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.get(Calendar.HOUR));
		
		//다음 2시간
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		//둘간의 시간차를 구하려함
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		long result = l2 - l1;
		System.out.println(result);
		
		result = result / 1000 / 60 / 60;
		System.out.println(result);
		
	}

}

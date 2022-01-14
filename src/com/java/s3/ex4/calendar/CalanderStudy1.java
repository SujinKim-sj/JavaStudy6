package com.java.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalanderStudy1 {

	public static void main(String[] args) {
		// Calendar는 추상 클래스
		// GregorianCalander 가 Calendar 클래스 상속
		// Calendar의 메서드는 GregorianCalander에 있다
		
		//현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();	//Gregorian

		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);		//1초 = 1000
		long millis = ca.getTimeInMillis();
		
		
		Date date = ca.getTime();
		
		System.out.println("Year : " + y);
		System.out.println("Month : " + (m + 1));
		System.out.println("Day : " + d);
		System.out.println("H : " + h);
		System.out.println("HH : " + hh);
		System.out.println("Min : " + min);
		System.out.println("Sec : " + s);
		System.out.println("Ms : " + ms);
		System.out.println("Millis : " + millis);
		System.out.println("Date : " + date);
		
		//System.out.println(gc);
		//System.out.println(calendar);
		//System.out.println(ca);
	}

}

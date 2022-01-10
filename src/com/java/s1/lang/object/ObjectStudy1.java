package com.java.s1.lang.object;

public class ObjectStudy1 {
	
	//생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	//기본 생성자는 매개변수가 없는 생성자
	
	public void study1() {
		System.out.println("Study1 실행");
		
		//Object 객체를 생성하고 주소출력
		Object obj = new Object();
		System.out.println(obj);
		
		//clone 메서드 호출
		//참조변수명.멤버
		int hashNum = obj.hashCode();
		System.out.println(hashNum);
		
		String str = obj.toString();
		System.out.println(str);
	}
	
	
}

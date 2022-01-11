package com.java.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	public void splitTest() {
		String name = "미애, 철이, 진섭, 정욱";
		String [] result = name.split(",");
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i].trim());
		}
		
	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		
		System.out.println(result);
	}
	
	public void caseTest() {
		String title = "West Side Story";
		
		String result = title.toLowerCase();
		System.out.println(result);
		
		result = title.toUpperCase();
		System.out.println(result);
	
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		String result = title.replace('S', 't');
		System.out.println(title);
		System.out.println(result);
	}
	
	
	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		//a.txt, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지 파일입니다 출력
		//txt, pdf, hwp -> 문서 파일입니다 출력
		//mp3, wav, ogg -> 음원 파일입니다 출력
		//나머지는 알 수 없는 파일입니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String file = sc.next();
		String result = file.substring(file.lastIndexOf(".") + 1);
		System.out.println(result);
		
		if(result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지 파일입니다");
		} else if(result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
			System.out.println("문서 파일입니다");
		} else if(result.equals("mp3") || result.equals("wav") || result.equals("ogg")) {
			System.out.println("음원 파일입니다");
		} else {
			System.out.println("알 수 없는 파일입니다");
		}
		
		
		/*
		 * if(file.indexOf("jpg") > -1 || file.indexOf("gif") > -1 ||
		 * file.indexOf("png") > -1) { System.out.println("이미지 파일입니다"); } else
		 * if(file.indexOf("txt") > -1 || file.indexOf("pdf") > -1 ||
		 * file.indexOf("hwp") > -1) { System.out.println("문서 파일입니다"); } else
		 * if(file.indexOf("mp3") > -1 || file.indexOf("wav") > -1 ||
		 * file.indexOf("ogg") > -1) { System.out.println("음원 파일입니다"); } else {
		 * System.out.println("알 수 없는 파일입니다"); }
		 */	
		
	}

	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(title.indexOf("S"));
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
		
	}
	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		
		String find = "S";
		//title find에 들어가있는 글자가 몇개 인지 출력
		int count = 0;
		
		for(int i = 0; i < len; i++) {
			int index = title.indexOf(find, i);
			if(index >= 0) {
				count++;
				i = index;
			} else	{
				break;
			}
		}
		System.out.println(count);
		
		//한글자씩 출력
		//W
		//e
		//s
		for(int i = 0; i < len; i++) {
			System.out.println(title.charAt(i));
		}
		
	}
	
	public void indexOfTest() {
		String msg = "Hello World";
		//indexOf 호출
		int num = msg.indexOf('o', 6);		//int ch = 'e';
		System.out.println(num);
	}
	
	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str == str2);	//true
		System.out.println(str3 == str4);	//false
		System.out.println(str == str3);	//false
		System.out.println("===============");
		System.out.println(str.equals(str2));	//true
		System.out.println(str3.equals(str4));	//true
		System.out.println(str.equals(str3));	//true
	
		
		//System.out.println("str : " + str);
		//System.out.println("str2 : " + str2);
		//System.out.println(str.equals(str2));		//문자열 비교시 사용
	}
	
	public void study1() {
		String name = "hello";
		System.out.println(name);
		
		//charAt 메서드 호출 코드 작성
		int i = 0;
		char ch = name.charAt(i);
		System.out.println(ch);
		
		
	}
	
}

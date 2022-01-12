package com.java.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	private Scanner sc;
	
	public WrapperEx1() {
		sc = new Scanner(System.in);
	}
	
	public void ex2() {
		//키보드로 부터 주민등록번호 입력
		//      9 7 1 2 2 4  -  1 2 3 4 5 6     7 - 마지막 번호는 체크용 번호
		//*     2 3 4 5 6 7     8 9 2 3 4 5 
		//  18 21 4 10 12 28   8 18 6 12 20 30
		// 결과를 모두 더함 ex) 122
		 
		System.out.println("주민 번호 입력");
		String id = sc.next();
		
		//String[] birth = id.substring(0, 6).split("");	// 앞부분 생년월일 담는 배열
		//String[] second = id.substring(7, 13).split("");	// 주민번호 뒷부분 담는 배열
		
		
		for(int i = 0; i < id.length() - 1; i++) {
			String result = id.substring(i, i + 1);
//			if(result.equals("-")) {
//				continue;		
//			}//1번 방법
			if(!result.equals("-")) {
				Integer.parseInt(result);
			}//2번 방법
		}
		
		//-------------------------------------------------
		int sum = 0;
		int source = 2;

		for(int i = 0; i < id.length() - 1; i++) {
			if(source > 9) {
				source = 2;
			}
			char ch = id.charAt(i);
			//Integer.parseInt(ch + "");
			if(ch != '-') {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num * source;
				source++;
			}
		}
		
		System.out.println("합계 : " + sum);
		
		/*
			String multiply = "234567892345";
			String[] mArr = multiply.split("");
		
		 * for(int i = 0; i < birth.length; i++) { result += Integer.parseInt(birth[i])
		 * * Integer.parseInt(mArr[i]); }
		 * 
		 * for(int i = 0; i < second.length; i++) {
		 * 
		 * result += Integer.parseInt(second[i]) * Integer.parseInt(mArr[i+6]); }
		 */
		
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		//		121 / 11 -> 11....1
		int remainder = sum % 11;		//나머지
		
		//3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 같은지 비교
		//		11 - 1 = 10 == 7
		int check = Integer.parseInt(id.substring(13));		// 맨 마지막 숫자 check
		
		//4. 만약에 결과값이 두자리면 결과값을 다시 10으로 나누어서 그 나머지 값을 체크용 번호와 같은지 비교
		//		10 / 10 --- 0 == 7 
		//		같으면 정상적인 주민번호, 아니면 잘못된 번호

		if(remainder > 9) {
			remainder %= 10;
		} else {
			remainder = 11 - remainder;		//3번	
			if(remainder == check) {	
				System.out.println("정상적인 주민번호입니다");
			}else {
				System.out.println("잘못된 주민번호입니다");
			}
		}
		
	}
	
	public void ex1() {
		//키보드로 부터 주민등록번호 입력
		// 011224-1234567
		System.out.println("주민 번호 입력");
		String id = sc.next();				//주민번호
		
		//----------연도 파싱----------
		int year = Integer.parseInt(id.substring(0, 2));
		int age = 0;
		
		if(year < 22) {
			age = 22 - year + 1; 
		}else {
			age = 122 - year + 1;
		}
		
		System.out.println("나이 : " + age + "세");
		
		//----------성별 파싱----------
		int genderNum = Integer.parseInt(id.substring(7, 8));
		String gender = "여자";
		
		if(genderNum % 2 == 1) {
			gender = "남자";
		}
		
		System.out.println("성별 : " + gender);
		
		// 3-5 : 계절 봄
		// 6-8 : 	여름
		// 9-11 : 	가을
		// 12-3 : 	겨울
		
		int month = Integer.parseInt(id.substring(2, 4));
		String season = "";
		
		if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		
		System.out.println("태어난 계절 : " + season);
	}

}

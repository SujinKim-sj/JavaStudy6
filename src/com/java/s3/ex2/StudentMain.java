package com.java.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		StudentData studentData = new StudentData();
		
		ArrayList<StudentDTO> students = studentData.init();
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println("이름 : " + students.get(i).getName());
			System.out.println("번호 : " + students.get(i).getNumber());
			System.out.println("국어 점수 : " + students.get(i).getKor());
			System.out.println("영어 점수 : " + students.get(i).getEng());
			System.out.println("수학 점수 : " + students.get(i).getMath());
			System.out.println("총점 : " + students.get(i).getTotal());
			System.out.println("평균 : " + students.get(i).getAvg());
			System.out.println("========================");
			
		}
		
		
	}

}

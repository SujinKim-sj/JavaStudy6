package com.java.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.java.s3.ex1.member.MemberDTO;

public class StudentData {
	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}

	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		//키보드로 부터 member의 수만큼 성적 정보 입력
		//이 정보들을 StudentDTO
		//map의 키는 id
		
		HashMap<String, StudentDTO> map = new HashMap<>();
		
		for(int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();

			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			
			System.out.println("국어 점수 입력");
			int kor = sc.nextInt();
			studentDTO.setKor(kor);
			
			
			System.out.println("영어 점수 입력");
			int eng = sc.nextInt();
			studentDTO.setEng(eng);

			System.out.println("수학 점수 입력");
			int math = sc.nextInt();
			studentDTO.setMath(math);			
			
			int total = kor + eng + math;
			studentDTO.setTotal(total);

			studentDTO.setAvg(total / 3);
			
			map.put(studentDTO.getId(), studentDTO);
		}
		return map;
	}
}

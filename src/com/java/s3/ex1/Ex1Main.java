package com.java.s3.ex1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.java.s3.ex1.member.MemberDTO;
import com.java.s3.ex1.member.MemberData;
import com.java.s3.ex1.student.StudentDTO;
import com.java.s3.ex1.student.StudentData;


public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		//회원들의 정보 모음
		ArrayList<MemberDTO> ar = memberData.init();
		Map<String, StudentDTO> map = studentData.addStudent(ar);
		Set<String> keys = map.keySet(); 
		Iterator<String> k = keys.iterator();
		
		while(k.hasNext()) {	

			String key = k.next();
			StudentDTO studentDTO = map.get(key);
			System.out.println("Key : " + key);
			System.out.println(studentDTO.getId());
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getKor());
			System.out.println(studentDTO.getEng());
			System.out.println(studentDTO.getMath());
			System.out.println(studentDTO.getTotal());
			System.out.println(studentDTO.getAvg());
			
		}

	}

}

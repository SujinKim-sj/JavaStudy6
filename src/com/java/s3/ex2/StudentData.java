package com.java.s3.ex2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentData {

	private String info;
	
	public StudentData() {
		this.info = "name1, 1, 15, 50, 60,";
		this.info = this.info + "name2,2,52,68,40,";
		this.info = this.info + "name3,3,80,87,75,";
	}
	
	//학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	
	public ArrayList<StudentDTO> init() {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(this.info, ",");
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken().trim());
			studentDTO.setNumber(Integer.parseInt(st.nextToken().trim()));
			
			int kor = Integer.parseInt(st.nextToken().trim());
			studentDTO.setKor(kor);
			int eng = Integer.parseInt(st.nextToken().trim());
			studentDTO.setEng(eng);
			int math = Integer.parseInt(st.nextToken().trim());
			studentDTO.setMath(math);
			int total = kor + eng + math;
			studentDTO.setTotal(total);
			double avg = total / 3.0;
			studentDTO.setAvg(avg);
			
			ar.add(studentDTO);
			
		}
		
		return ar;
	}
	
	//학생의 정보를 추가
	//학생의 정보를 삭제
	

}

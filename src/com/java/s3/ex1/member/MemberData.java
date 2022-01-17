package com.java.s3.ex1.member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	//기본 생성자 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-36-";
		this.data = this.data + "id4 - pw4 - name4 - name4@daum.net-17-";
		
		System.out.println(this.data);
	}
	
	public void addMember(ArrayList<MemberDTO> ar) {
		//새로추가할 MemberDTO 생성
		//키보드로부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에 MemberDTO 추가
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("id 입력");
		String id = sc.next();
		memberDTO.setId(id);
		
		System.out.println("pw 입력");
		String pw = sc.next();
		memberDTO.setPw(pw);
		
		System.out.println("name 입력");
		String name = sc.next();
		memberDTO.setName(name);
		
		System.out.println("email 입력");
		String email = sc.next();
		memberDTO.setEmail(email);
		
		System.out.println("age 입력");
		int age = sc.nextInt();
		memberDTO.setAge(age);

		ar.add(memberDTO);

		/*
		 * 방법2
		String data = "ab-ab-ab-email-30";
		MemberDTO mem2 = new MemberDTO();
		String [] d = data.split("-");
		mem2.setId(d[0]);
		mem2.setPw(d[1]);
		mem2.setName(d[2]);
		mem2.setEmail(d[3]);
		mem2.setAge(Integer.parseInt(d[4]));
		ar.add(mem2);
		*/
		
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고 싶은 ID 입력
		//ArrayList 에서 삭제
		MemberDTO memberDTO = null;
		System.out.println("삭제할 ID 입력");
		String removeId = sc.next();
		//int index = -1;
		
		for(int i = 0; i < ar.size(); i++) {
			if(removeId.equals(ar.get(i).getId())) {
				memberDTO = ar.remove(i);
				break;
			}
		}
		return memberDTO;
	}
	
	
	public ArrayList<MemberDTO> init() {
		//data에 있는 문자열을 StringTokenizer로 파싱해서 
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		
		System.out.println("MemberEx1 Branch");
		
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
				
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(memberDTO);
		}
		
		return ar;
	}
}

package com.java.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {
	
	public static void main(String[] args) {
		String str = "봄, 16, 여름,32,가을,20,겨울,-15";
		//str = "봄, 여름, 가을, 겨울";
		String [] s = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();		//오류 방지 - 공백 제거
			seasonDTO.setName(token);		//봄
			
			token = st.nextToken();			//16
			seasonDTO.setGion(Integer.parseInt(token.trim()));		//오류 방지 - 공백 제거
			
			ar.add(seasonDTO);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
		}
		
		for(int i = 0; i < ar.size(); i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
			
		}
	}
}

package com.java.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {

	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}
	
	public void study3() {
		//set
		HashSet<Integer> lotto = new HashSet<>();
		Random random = new Random();
		
//		for(int i = 0; i < 6; i++) {
//			int num = random.nextInt(45) + 1;		
//			lotto.add(num);
//			
//		}
//		
		while(lotto.size() != 6) {
			int num = random.nextInt(45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
	}
	
	public void study2() {
		//Random 
		Random random = new Random();
		
		//Lotto 번호를 랜덤 1-45 6개를 모두 뽑고 List에 담아서
		ArrayList<Integer> lotto = new ArrayList<>();
		
		
			
		for(int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;		
			lotto.add(num);
			
		}
				
		//한꺼번에 출력
		System.out.println(lotto);
		
	}
	
	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}
}

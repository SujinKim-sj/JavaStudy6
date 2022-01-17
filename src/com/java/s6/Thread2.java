package com.java.s6;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 'a'; i < 'z'; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//for(int j = 0; j < 1000000000; j++) {}
			System.out.println("Alpha : " + (char)i);
		}
	
	}
}

package com.java.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("클라이언트 접속을 기다리는 중");
			serverSocket = new ServerSocket(8282);				//접속 준비
			socket = serverSocket.accept();						//client
			System.out.println("접속한 Client와 1:1 연결 완료");
			
			//
			InputStream is = socket.getInputStream(); 			//01 처리
			InputStreamReader ir = new InputStreamReader(is);	//char 타입 처리
			
			BufferedReader br = new BufferedReader(ir);			//String
			
			String message = br.readLine();
			System.out.println("Client : " + message);
			
			System.out.println("Client로 전송할 메세지 입력");
			message = scanner.nextLine();
			//server에서 클라이언트로 메세지 전송
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			
			bw.write(message + "\r\n");
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

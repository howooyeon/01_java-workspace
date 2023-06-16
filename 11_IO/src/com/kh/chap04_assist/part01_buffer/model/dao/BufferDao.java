package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림
	 * 			  기반 스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송속도 향상 시킴 + a
	 * 			 >> 외부매체와 직접적으로 연결되는 스트림 아님!
	 * 				단독 사용 불가(반드시 기반스트림과 함께 사용)
	 * 
	 */
	
	// 프로그램 ---> 파일(출력)
	public void fileSave(){
		// FileWriter 기반 스트림 가지고 해보자! (기반스트림 필수)
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림(속도향상) : 기반 스트림이랑 이름 맞춰야함
		
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); // 단독사용 불가
		
		// 1. 기반스트림 먼저 생성
		// FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성시 기반 스트림 객체를 전달하면서 생성
		// BufferedWriter bw = new BufferedWriter(fw);
		
		// 위의 두줄을 한줄로
//		BufferedWriter bw = null;
//
//		try {
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//			// write 메소드 이용해서 데이터 출력
//			bw.write("안녕하세요\n");
//			bw.write("반갑습니다");
//			bw.newLine(); // 추가적인 메소드 활용 가능
//			bw.write("저리가세요");
//			
//			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력해줌 => 속도 향상에 좋다
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		// try~with ~resource 구문으로 자원 반갑까지 더 간단하게 작업할 수 있음
		// jdk 7버전 이상부터
		
		
		/*
		 * [표현법]
		 * try(ryt){ // 알아서 try다 끝나면 해당 스트림 반납까지 다 해줌
		 * 
		 * } catch(예외클래스 e)
		 */
		

		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-------- 파일 (입력)
	public void fileRead() {
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력 받을 수 있는 기반스트림
		// BufferedReader : 속도 향상에 도움이 되는 보조 스트림
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
			// br.read();
			// br.readLine(); 한 문장씩 가져오게 돼있음, 반환형 스트링!!
			
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			// System.out.println(br.readLine()); // 파일의 끝을 만나면 null이 나오는구나?!
			
			String value = null;
			while((value = br.readLine()) != null){ // null과 비교할 때는 equals(x)
				System.out.println(value);
				
			}
			
			
		} catch (FileNotFoundException e) { // 자식 => 위에 있어야함. 없어도 됨
			e.printStackTrace();
		} catch (IOException e1) { // 부모
			e1.printStackTrace();
		}
		
		
	}
	
	
}

package com.kh.chap01_abstration.model.vo;

/*
 * *클래스의 구조
 * public class 클래스명{
 * 
 * // 필드부 
 * 
 * // 생성자부
 * 
 * // 메소드부
 * public void method1(){
 * 
 * }
 * 
 * }
 * 
 */

public class Student { // 학생을 추상화해서 만든 클래스(완벽한 상태는 아님 - 캡슐화 아님)
	
	// 필드부
	// [표현법]
	// 접근제한자[예약어] 자료형 변수명
	
	// * 접근 제한자 : 여기에 접근할 수 있는 범위를 제한하는 것 (왼쪽으로 갈 수록 개방)
	// public > protected > default > private
	
	

	public String name; // 이름
	public int age; // 나이
	public double height; // 키
	
	
	// 클래스 별칭 = new 클래스명();
	// 주소값을 담고 있음! 기본자료형이 아니기 때문에
	// 여기까지는 Heap 영역에 할당된 공간에는 자바 가상 머신의 초기값들이 세팅되어 있을 것
	// 각 영역에 "직접 접근"해서 내가 원하는 값 대입 => public이라서 개방되어 있음
	// arr[0] = 10;
	
	
}

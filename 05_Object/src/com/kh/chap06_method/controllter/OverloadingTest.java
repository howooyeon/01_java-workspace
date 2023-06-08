package com.kh.chap06_method.controllter;

public class OverloadingTest {
	
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test(int a) {
		System.out.println("a");
	}
	
	/*
	 * public void test() {
	 * 
	 * }
	 *  
	 *  오버로딩이 가능하려면 매개변수명이 아니라
	 *  매개변수의 개수와 순서가 다르게 작성돼야 함.
	 */
	
	
	public void test(int a, String s) { // 매개변수 있고 없고 차이
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
	}
	
	반환형이라도 상관없음!
	무줙권 매개변수가 달라야 함!!!!!!!
	
	
	*/
	
	/*
	 public void test(String str) {
	 
	 접근 제한자랑도 상관없음!
	 무줙권 매개변수가 달라야 함!!!!!!!
	 }
	 */
	
	
	/*
	 * 결론
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 * 			단, 매개변수명, 접근 제한자, 반환형을 다 떠나서
	 * 			매개변수의 자료형과 개수, 순서가 다르게 작성돼 있어야 함!
	 */

	
}

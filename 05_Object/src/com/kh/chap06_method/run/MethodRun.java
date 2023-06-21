package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controllter.NonStaticMethod;
import com.kh.chap06_method.controllter.OverloadingTest;
import com.kh.chap06_method.controllter.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		
		
	
	// -------------- StaticMethod -----------------
	// 생성없이 바로 호출 가능
	// Math.random();
	
	/*
	 * StaticMethod.method1();
	 * 
	 * System.out.println(StaticMethod.method2()); // return값은 출력하지 않으면 보이지 않는다.
	 * 
	 * StaticMethod.method3("차은우");
	 * 
	 * System.out.println(StaticMethod.method4("apple", "kiwi"));
	 */
		
		
		// -------------NonStaticMethod---------------
	      NonStaticMethod n = new NonStaticMethod();
	      
	      // 1. 매개변수도 없고 반환값도 없는 메소드 호출
	      // n.method1(10);
	      n.method1();
	      
	      // 2. 매개변수 없고 반환값은 있는 메소드 호출
	      String str = n.method2(); // return이 있어서 받을 값이 있다
	      System.out.println(n.method2()); // str = n.method2
	      System.out.println(str);
	      
	      // 3. 매개변수 있고 반환값은 없는 메소드 호출
	      // n. method3(); -> 매개변수 없으면 오류남
	      // n.method3(10); -> 매개변수 개수 맞지 않으면 오류남
	      // n.method3("ㅋㅋ", "ㅎㅎ"); -> 매개변수 타입이 맞지 않아 삐-
	      // int a = n.method3(10,20); -> 반환값이 없어서 오류, 담을 수 있는 값 x
	      n.method3(10, 5);
	      n.method3(10, 0);
	      
	      // 4. 매개변수도 있고 반환값도 있는 메소드 호출
	      //char ch = n.method4("lemon", 1);
	      //System.out.println(ch);
	      //System.out.println(n.method4("lemon", 1));
	      // return은 출력이 아니다 진짜 출력하고  싶으면 담을 수 있는 변수(그릇)를 만들어서 출력문에 넣어 출력
	      
	      
	      // 사용자에게 매개변수를 입력받아서 해당 메소드 호출
	      while (true) {
	         Scanner sc = new Scanner(System.in);
	         System.out.print("문자열 입력 : ");
	         String string = sc.nextLine();

	         System.out.print("인덱스 입력 : ");
	         int index = sc.nextInt();
	         sc.nextLine();

	         // 여기서 유효성 검사 해보기
	         // index 0 이상이고 문자열의 길이보다 작을 때만 method4

	         if (index >= 0 && index < string.length()) {
	            System.out.println("결과 : " + n.method4(string, index));
	         } else {
	            System.out.println("인덱스 값이 부적절합니다.");
	            System.out.println("다시 입력 ㄱㄱ");
	         }
	      }

	   }
	
	// -------------- OverloadingTest -----------------
//	OverloadingTest ot = new OverloadingTest();
//	ot.test(0);	
//	ot.test(10);
//	ot.test(10, ""); // ** 시험 문제!!!!!!!!!!!
//	ot.test("",10);
//	ot.test(10, 10);
//	ot.test("차은우");
//	
//	// 오버로딩의 대표적인 예 => print()
//	
//	System.out.println(10);
//	System.out.println("ㄴㄴ");
//	System.out.println(0.0);

	
	
	
	}



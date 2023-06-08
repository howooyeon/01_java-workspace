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
	
	// -------------- OverloadingTest -----------------
	OverloadingTest ot = new OverloadingTest();
	ot.test(0);	
	ot.test(10);
	ot.test(10, ""); // ** 시험 문제!!!!!!!!!!!
	ot.test("",10);
	ot.test(10, 10);
	ot.test("차은우");
	
	// 오버로딩의 대표적인 예 => print()
	
	System.out.println(10);
	System.out.println("ㄴㄴ");
	System.out.println(0.0);

	
	
	
	}

}

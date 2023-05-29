package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	/*
	 ** 논리연산자(이항연산자) 두개의 논리값(true, false)을 연산해주는 연산자 논리연산한 결과마저도 논리값임!
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true 논리값 || 논리값 : 왼쪽과 오른쪽 하나만 true일 경우
	 * 결과값은 true
	 * 
	 */

	public void method1() {

		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		boolean result = ((1 <= num) && (num <= 100)); // num값이 1이상 "이고" "그리고" num값이 100 이하
		// && 의미 : ~ 이고 , 그리고, 하면서
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : " + result);
		// && : 두개의 조건 모두가 true여야 && 연산이 최종적으로 true
		// 둘중에 하나라도 false가 있을 경우 && 연산의 결과는 false

	}

	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		// 'A'~'Z' : 65 ~ 90
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);

		// 첫번째 방법
		boolean result = ((ch >= 65) && (ch <= 90));
		System.out.println("사용자가 입력한 값이 대문자 입니까? : " + result);

		// 두번째 방법
		// boolean result = ((ch>= 'A')&&(ch <='Z'));
		// System.out.println("사용자가 입력한 값이 대문자 입니까? : " + result);

	}

	public void method3() {
		// 사용자에게 성별을 입력 받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력해주세요 (M/F) : ");

		char gender = sc.nextLine().charAt(0);

		boolean result = ((gender == 'F') || (gender == 'f'));
		// || 의미 : ~이거나, 또는 ~

		System.out.println("사용자가 여자입니까? : " + result);

		// || 두개의 조건 중 하나라도 true가 있다면 || 연산의 결과값은 true
		// 두개의 조건 모두 false || 연산의 결과값이 false

	}

	public void method4() {
		// 사용자에게 입력을 받아서 게임을 종료하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("게임을 종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);

		boolean result = (ch == 'y') || (ch == 'Y');

		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? : " + result);
	}

	/*
	 * && : 두개의 조건이 모두 true 여야 결과값이 true
	 * 
	 * true && true => true true && false => false false && true => false false &&
	 * false => false
	 * 
	 * ** && 연산자 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않음 **
	 * 
	 * 
	 * || : 두개의 조건 중 하나라도 true라면 결과값이 true (OR == 또는, ~이거나) true || true => true
	 * true || false => true false || false => false
	 * 
	 * 
	 * ** || 연산자 기준으로 앞의 결과가 true일 경우 뒤의 조건 굳이 실행하지 않는다!
	 * 
	 */
	public void method5() {
		int num = 10;
		//boolean result1 = (num < 5) && (++num > 0);
		boolean result1 = (num > 5) && (++num > 0);
		
		System.out.println(result1);
		System.out.println("&& 연산 후의 num값 : " + num);
		
		int num2 = 10;
		//boolean result2 = (num2 < 20)|| (++num2 > 0);
		boolean result2 = true || (++num2 > 0); // 죽은 코드 : 절대 실행될 일 없는 코드
		
		System.out.println("result2 : " + result2);
		System.out.println("&& 연산 후의 num값 : " + num2);
	}

}

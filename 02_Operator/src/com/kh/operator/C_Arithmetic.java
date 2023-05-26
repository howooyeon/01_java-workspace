package com.kh.operator;

public class C_Arithmetic {
	/*
	 * 산술연산자(이항 == 두개의 값을 가지고 연산) + - / * %
	 * 
	 * * / % > + -
	 */

	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("num1 + num2 = " + num1 + num2); // 103
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13 연산자 우선순위, 괄호로 묶어줘서 우선순위 정하기
		// System.out.println("num1 - num2 = " + num1 - num2); 에러발생 : 문자 - 숫자 불가
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7

		System.out.println("num1 * num2 = " + (num1 * num2)); // 곱셈 연산 우선순위 먼저! 가독성 위해 () 써줌
		System.out.println("num1 * num2 = " + (num1 / num2)); // 몫 출력
		System.out.println("num1 * num2 = " + (num1 % num2)); // 나머지 출력

		// ** 나누기 연산시 나머지 출력(짝, 홀, 배수)
		// 값 % 2 == 0 -> 짝수| 1-> 홀수
		// 값 % 5 == 0 -> 5의 배수
		// 값 % 3 == 0 -> 3의 배수

	}

	public void quiz1() {

		int a = 5;
		int b = 10;

		int c = (++a) + b; // a=6, b=10, c=16
		int d = c / a; // c=16, d=2
		int e = c % a; // e=4
		int f = e++; // e = 4(5), f=4
		int g = (--b) + (d--); // b=9, c=16, d=1, e=5, f=4, g =11, h=2
		int h = 2;// h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);

		System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d, %d", a, b, c, d, e, f, g, h, i);

	}
}

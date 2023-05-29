package com.kh.operator;

public class F_Compound {
	/*
	 * 복합 대입연산자
	 * 산술 연산자와 대입 연산자가 결합되어 있는 형태 (산술연산 먼저 쓰고 대입연산 나중)
	 * 연산 처리 속도가 빨라지므로 사용하는 걸 권장
	 * 
	 * += -= /= %=
	 * a = a + 3;	=> a += 3;
	 * a = a - 3;	=> a -= 3;
	 * a = a * 3;	=> a *= 3;
	 * a = a / 3;	=> a /= 3;
	 * a = a % 3;	=> a %= 3;
	 * 
	 */
	public void method1() {
		int num = 12;
		System.out.println("최초 : num : " + num);
		
		// num = num;  no effect; : 변화되지 않는 코드
		
		num += 3;
		System.out.println("3 증가시킨 num : "+ num);
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5를 감소시킨 num : " + num);
		num *= 6;
		System.out.println("6배 증가 시킨 num : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("최종 num : " + num);
		
		String str = "Hello";
		//str = str + "World"; // 산술연산 중  +만 가능하다
		str += " world";
		
		System.out.println(str);
	}
}

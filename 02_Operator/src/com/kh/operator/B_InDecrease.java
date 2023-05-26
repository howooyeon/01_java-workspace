package com.kh.operator;

public class B_InDecrease {

	/*
	 * 조금 어렵다 쪽지 시험 단골문제 증감연산자 (단항연산자) ++ : 변수에 담긴 값을 1 증가시켜주는 연산자 ++변수, 변수++ -- :
	 * 변수에 담긴 값을 1 감소시켜주는 연산자 --변수, 변수--
	 * 
	 * (증감연산자)변수 : 전위연산 => "선증감" 후처리 변수(증감연산자) : 후위연산 => 선처리 "후증가"
	 * 
	 */

	public void method1() {
		// 전위연산 테스트
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1);
		System.out.println(" 1회 수행 후 결과 : " + ++num1);
		System.out.println(" 2회 수행 후 결과 : " + ++num1);
		System.out.println(" 3회 수행 후 결과 : " + ++num1);

		System.out.println("최종 num1의 값 : " + num1); // 13을 마지막으로 출력

		System.out.println("=========================");

		// 후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " + num2); // 처리할 거 다 처리하고 증가 시키는 로직
		System.out.println(" 1회 수행 후 결과 : " + num2++); // 10출력 후 => num2 = 11로 증가
		System.out.println(" 2회 수행 후 결과 : " + num2++); // 11출력 후 => num2 = 12로 증가
		System.out.println(" 3회 수행 후 결과 : " + num2++); // 12출력 후 => num2 = 13로 증가

		System.out.println("최종 num1의 값 : " + num2); // 3회차 출력 후 13으로 증가했기 때문 결과적으로 13 출력

	}

	public void method2() {
		int a = 10;
		int b = ++a; // 처리고 나발이고 a먼저 증가 ㄱㄱ

		System.out.printf("a : %d, b : %d\n", a, b);

		int c = 10;
		int d = c++; // c : 11, d : 10
		System.out.printf("c : %d, d : %d\n", c, d);

		System.out.println("=========================");

		int num = 20;
		System.out.println("현재 num : " + num);
		System.out.println("++num? : " + ++num); // num = 21
		System.out.println("num++? : " + num++); // num = 21 (출력해보면 22)
		System.out.println("--num? : " + --num); // 찐값 22이기 때문에 -1하면, (21)
		System.out.println("num--? : " + num--); // num = 21 (20)

		System.out.println("최종 num의 값 : " + num);
	}

	public void method3() {
		int num1 = 20;
		int result = ++num1 * 3; // num1 = 21, result = 63

		System.out.printf("num1 : %d, result : %d", num1, result);

		int num2 = 20;
		int result2 = num2++ * 3; // num2 = 21, result2 = 60

		System.out.printf("num2 : %d, result : %d", num2, result2);

	}

	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a++); // a = 10 (11)
		System.out.println((a++) + (b++)); // a = 12, b = 20(21) 32 되고 나서야 b(21)됨
		System.out.println((a++) + (b--) + (--c)); // a = 12(13), b = 20, c = 29

		System.out.printf("a : %d, b : %d, c : %d", a, b, c);

	}

}

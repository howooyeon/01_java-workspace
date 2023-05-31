package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; : 반복문 안에 기술되는 구문 continue; 구문 실행시 다음 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로
	 * 올라간다.
	 */

	public void method1() {
		// 직접
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9

		/*
		 * for (int i = 1; i < 10; i += 2) { System.out.print(i + " "); }
		 */

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너 뛰기라고 생각하자
				// 반복문 실행안하고 반복문 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 덧셈 연산 하겠다.

		// 1. 1~100까지의 총 합계 먼저 for문 작성
		// 2. 누적합

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue; // 건너뛰고 증감만 !
			} else {
				sum += i;
			}
		}

		System.out.println("6의 배수를 제외한 1부터 100까지의 합계 : " + sum);
	}

	public void method3() {
		// 1. 2~9단까지 출력
		// 2. 단, 3의 배수단은 빼고 출력
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int gu = 1; gu <= 9; gu++) {
				if (dan % 3 == 0) {
					continue;
				} else {
					System.out.printf("%d X %d = %d\n", dan, gu, dan*gu);
				}
			}
		
		}
		
	}

}

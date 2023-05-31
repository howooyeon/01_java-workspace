package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일
		 * 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++)
				System.out.print(i + " ");
		}

	}

	public void practice2() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num > 0) {

				for (int i = 1; i <= num; i++)
					System.out.print(i + " ");
				System.out.println();
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				return;
			}
		}

	}

	public void practice3() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) { // for문 증감 공부 다시 하기
			System.out.print(i + " ");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			System.out.println(num);

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");

				}
			}
		}
	}

	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			sum += i;
			System.out.print(i);
			if (num > i) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++)
					System.out.print(i + " ");
			} else {
				for (int i = num1; i <= num2; i++)
					System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++)
						System.out.print(i + " ");
				} else {
					for (int i = num1; i <= num2; i++)
						System.out.print(i + " ");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("====%d단====\n", dan);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 10) {
			for (int j = dan; j <= 9; j++) {
				System.out.printf("====%d단====\n", j);

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", j, i, j * i);
				}
			}
		} else {
			System.out.println("9이하 숫자만 입력하세요.");
		}
	}

	public void practice10() {
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan < 10) {
				for (int j = dan; j <= 9; j++) {
					System.out.printf("====%d단====\n", j);

					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d\n", j, i, j * i);
					}
				}
			} else {
				System.out.println("9이하 숫자만 입력하세요.");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int tolerance = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(start);
			start += tolerance;
			System.out.print(" ");
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		if(op == '+') {
		System.out.println(num1 + " + " + num2+ " = " + (num1+num2));
		} else if(op =='-') {
			System.out.println(num1 + " - " + num2+ " = " + (num1-num2));
		} else if(op =='*') {
			System.out.println(num1 + " x " + num2+ " = " + (num1*num2));
		} else if(op =='/') {
			System.out.println(num1 + " / " + num2+ " = " + (num1/num2));
		} else if(op =='%') {
			System.out.println(num1 + " % " + num2+ " = " + (num1%num2));
		} else {
			System.out.println("없는 연산자입니다. 다시 입력해주세요."); // 0넣으면 계산 안되는거 다시 생각
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

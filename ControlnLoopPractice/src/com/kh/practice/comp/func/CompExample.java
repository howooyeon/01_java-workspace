package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) { // 변수 증감 잘 확인
					System.out.print("박");
				} else {
					System.out.print("수");

				}

			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
					return; // ** while문 return 해줘야 하는 부분 잘 확인
				}
			} else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++; // count ++ 선처리 후증감
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			
			System.out.println("포함된 개수 : " + count);
			System.out.print("더 하시겠습니까? (y/n) : ");
			char question = sc.nextLine().charAt(0);

			switch (question) {
			case 'y':
			case 'Y':
				break;
			case 'n':
			case 'N':
				return;
			default:
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
	}
}

package com.study.algorithm.level1;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);

		while (true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5)초기화 (0) 종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + " 입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + " 입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;
			case 5:
				s.clear();
				System.out.println("데이터가 초기화 되었습니다.");
				break;
			}
		}
	}

}

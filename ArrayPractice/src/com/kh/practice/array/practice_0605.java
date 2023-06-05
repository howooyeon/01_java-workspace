package com.kh.practice.array;

import java.util.Scanner;

public class practice_0605 {

	public void practice12() {
		// to do list : 스캐너생성, 정수 2개,
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 1-1
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			// 2 나눗셈 이면서
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				continue; // 아래 내용 수행하지 않고 반복문 첫번째부터 시작함

			}
			// 4
			switch (op) // 동등비교할 대상
			{
			case "+":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1 + num2));
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1 - num2));
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1 * num2));
				break;
			case "/":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1 / num2));
				break;
			case "%":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1 % num2));
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요");

			}

		}

	}

	public void rsp() {
		Scanner sc = new Scanner(System.in);

		// 필요한 자원 : 변수
		int total = 0; // 전
		int win = 0; // 승
		int tie = 0; // 무
		int lose = 0; // 패

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		while (true) {
			System.out.print("가위바위보 : ");
			String rsp = sc.nextLine(); // exit

			int random = (int) (Math.random() * 3 + 1);
			String com = "";

			switch (random) { // 1 2 3
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;

			}

			if (rsp.equals("exit")) { // exit를 입력한 경우에는 종료
				System.out.println(total + "전" + win + "승" + tie + "무" + lose + "패");
				return; // 메소드 밖을 빠져 나가는 구문

			} else if (rsp.equals("가위") || rsp.equals("바위") || rsp.equals("보")) { // 잘 입력한 경우
				total++;

				System.out.println("컴퓨터 : " + com); // 컴퓨터가 가위(랜덤값)
				System.out.println(name + " : " + rsp); // 이호연 : 보(내가 입력한 값)

				if (com.equals("가위")) {
					switch (rsp) {
					case "가위":
						System.out.println("비겼습니다.");
						tie++;
						break;
					case "바위":
						System.out.println("이겼습니다.");
						win++;
						break;
					case "보":
						System.out.println("졌습니다.");
						lose++;
						break;

					}

					if (com.equals("바위")) {
						switch (rsp) {
						case "바위":
							System.out.println("비겼습니다.");
							tie++;
							break;
						case "보":
							System.out.println("이겼습니다.");
							win++;
							break;
						case "가위":
							System.out.println("졌습니다.");
							lose++;
							break;

						}
					}

					if (com.equals("보")) {
						switch (rsp) {
						case "보":
							System.out.println("비겼습니다.");
							tie++;
							break;
						case "가위":
							System.out.println("이겼습니다.");
							win++;
							break;
						case "바위":
							System.out.println("졌습니다.");
							lose++;
							break;

						}
					}
				}
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void  practice8() {
		Scanner sc = new Scanner(System.in);
		// 조건 맞을 때까지 반복 => while
		while(true) {
			// 정수 입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >=3 && num % 2 ==1) { // num이 3이상 홀수일 때만 작동
				int[] arr = new int[num];
				/*
				 * 5입력시 => {1,2,3,2,1} 		=> 2번 인덱스까지 증가 그 이후로 감소
				 * 7입력시 => {1,2,3,4,3,2,1}		=> 3번 인덱스까지 증가 그 이후로 감소
				 * 9입력시 => {1,2,3,4,5,4,3,2,1} => 배열의 길이/2 인덱스까지 증가 그 이후로 감소
				 * 
				 */

				int value = 1;
				for (int i = 0; i < arr.length; i++) { // 값대입
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break; // 출력 다 하고 걸어주기
			}else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

}
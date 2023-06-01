package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockSessiorPaper {

	public void rps() {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		String cp = "";
		int win = 0;
		int defeat = 0;
		int tie = 0;

		while (true) {
			int random = (int) (Math.random() * 3);
			if (random == 0) {
				cp = "가위";
			} else if (random == 1) {
				cp = "바위";
			} else {
				cp = "보";
			}
			System.out.print("가위바위보 : ");
			String user = sc.nextLine();

			if ((user.equals("가위")) || (user.equals("바위")) || (user.equals("보"))) {
				System.out.println("컴퓨터 : " + cp);
				System.out.println(name + " : " + user);
				if ((cp.equals("가위") && user.equals("바위")) || (cp.equals("바위") && user.equals("보"))
						|| (cp.equals("보") && user.equals("가위"))) {
					System.out.println("이겼습니다.");
					++win;
				} else if (cp.equals(user)) {
					System.out.println("비겼습니다.");
					++tie;
				} else {
					System.out.println("졌습니다 ㅠㅠ");
					++defeat;
				}
				continue;
			} else if (user.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", win + tie + defeat, win, tie, defeat);
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		sc.close();
	}
}

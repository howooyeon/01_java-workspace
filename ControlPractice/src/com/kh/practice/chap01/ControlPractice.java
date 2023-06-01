package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		}

	}

	public void practice2() {
		/*
		 * 스캐너. 정수받기 if 양수 if 짝수 ( i % 2 == 0) 짝수다 출력 else 양수 아니먄 양수만 입력해주세요 출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}

		} else
			System.out.println("양수만 입력해주세요.");
	}

	public void practice3() {

		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을
		 * 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 합격 했을 경우 과목 별 점수와 합계,
		 * 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();

		int total = korean + math + english;
		double average = total / 3;

		if (korean >= 40 && english >= 40 && math >= 40 && average >= 60) {
			System.out.println("국어점수 : " + korean);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + english);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다. 합격입니다!");
		} else
			System.out.println("불합격입니다.");
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}

	}

	public void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		 */
		String ID = "hoyeonLEE";
		String password = "12345678";

		Scanner sc = new Scanner(System.in);
		// 2개의 String을 입력 받겠다는
		System.out.print("아이디 : ");
		String IDin = sc.next();
		System.out.print("비밀번호 : ");
		String Passwordin = sc.next();

		if (IDin.equals(ID) && Passwordin.equals(password)) {
			System.out.print("로그인 성공");
		} else {
			System.out.print("로그인 실패");
		}
	}

	public void practice6() {
		/*
		 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 회원은 게시글 작성, 게시글 조회, 댓글 작성이
		 * 가능하고 비회원은 게시글 조회만 가능합니다. ex. 권한을 확인하고자 하는 회원 등급 : 관리자 회원관리, 게시글 관리 게시글 작성, 댓글
		 * 작성 게시글 조회
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		if (level.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		} else if (level.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else {
			System.out.println("게시글 조회");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);

		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI >= 23 && BMI < 25) {
			System.out.println("과체중");

		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("비만");

		} else {
			System.out.println("고도비만");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);

		if (op == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (op == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (op == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (op == '/') {
			double result = (double) num1 / num2; // 대박 !
			System.out.printf("%d %c %d = %.6f", num1, op, num2, result);
		} else if (op == '%') {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수  : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수  : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수  : ");
		int assign = sc.nextInt();
		System.out.print("출석 점수  : ");
		int attend = sc.nextInt();
		double total = ((mid * 0.2) + (fin * 0.3) + (assign * 0.3) + attend);

		System.out.println("=============결과=============");
		if (attend < 14) {
			System.out.println("Fail [출석 회수 부족 (" + attend + "/20)]");
			return;
		} else if (total >= 70) {
			System.out.println("중간고사 점수(20) : " + mid * 0.2);
			System.out.println("기말고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수		(30) : " + assign * 0.3);
			System.out.println("과제 점수		(20) : " + (double) attend);
			System.out.println("총점 : " + total);
			System.out.println("PASS");
		} else {
			System.out.println("중간고사 점수(20) : " + mid * 0.2);
			System.out.println("기말고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수		(30) : " + assign * 0.3);
			System.out.println("과제 점수		(20) : " + (double) attend);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		}
	}

	public void practice10() {

		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("7. P/F");
		System.out.print("선택 : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}

		sc.close();
	}

}

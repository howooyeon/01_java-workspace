package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.println();
		System.out.println(result);

	}

	public void practice2() {
		// 양수, 음수, 0
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다." : "음수다";
		System.out.println();
		System.out.println(result);

	}

	public void practice3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println();
		System.out.println(result);
	}

	public void practice4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int a = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int b = sc.nextInt();

		int share = a / b;
		int remain = a % b;

		System.out.println();
		System.out.println("1인당 사탕 개수 : " + share);
		System.out.println("남는 사탕 개수 : " + remain);

	}

	public void practice5() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int cls = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		sc.nextLine();

		String result = ((gender == 'M' || gender == 'm') ? "남학생" : "여학생");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, cls, number, name, result, score);

	}

	public void practice6() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
		// 성인(19세 초과)인지 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print( age <= 13 ? "어린이" : ( age <= 19 ? "청소년" : "성인" ));
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		/* 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		*/
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		System.out.print("수학 : ");
		int num2 = sc.nextInt();
		System.out.print("영어 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double average = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println( num1 >= 40 && num2 >= 40 && num3 >= 40 
				&& average >= 60 ? "합격" : "불합격" );
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char idCardNumber = sc.nextLine().charAt(7);
		System.out.println(" ");
		
		System.out.println(idCardNumber % 2 == 0 ? "여자" : "남자" );
	} 
	
	public void practice9() {
		/*
		    키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
			그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
			아니면 false를 출력하세요.
			(단, num1은 num2보다 작아야 함) 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		System.out.println(" ");
		
		System.out.print( input <= num1 || input > num2 );
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 3 : ");
		int num3 = sc.nextInt();
		
		System.out.print( num1 == num2 && num1 == num3 && num2 == num3 );
			
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		
		double totalA = a * 1.4;
		double totalB = b * 1;
		double totalC = c * 1.15;
		System.out.println(" ");
		
		System.out.println("A사원의 연봉/연봉+a : " + a + "/" + totalA);
		System.out.println(totalA >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원의 연봉/연봉+a : " + b + "/" + totalB);
		System.out.println(totalB >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원의 연봉/연봉+a : " + c + "/" + totalC);
		System.out.println(totalC >= 3000 ? "3000 이상" : "3000 미만");
		
	}
}

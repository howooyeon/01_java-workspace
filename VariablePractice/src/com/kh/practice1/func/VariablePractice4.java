package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void printVariable4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		//char ch = sc.nextLine().charAt(0);
		System.out.print("첫 번째 문자 : " + sc.nextLine().charAt(0));
		sc.nextLine();
		System.out.print("두 번째 문자" + sc.nextLine().charAt(1));
		System.out.print("세 번째 문자" + sc.nextLine().charAt(2));
		
		sc.close();
		
	}
}

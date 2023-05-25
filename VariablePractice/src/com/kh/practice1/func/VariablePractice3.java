package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void printVariable3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double garo = sc.nextDouble();
		System.out.print("세로 : ");
		double sero = sc.nextDouble();

		System.out.println("면적 : " + (garo * sero));
		System.out.println("둘레 : " + (garo + sero) * 2);
		
		sc.close();

	}
}

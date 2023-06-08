package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		int[] arr = new int [3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop문  => 단순한 for문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Phone[] phones = new Phone[3]; // 객체 생성한 것이 아니고 배열을 생성한 것
		
		/*
		 * System.out.println(phones); System.out.println(phones[0]);
		 * phones[0].setName("아이폰");
		 */

		phones[0] = new Phone();
		phones[1] = new Phone("아이폰", "애플", 13000000, "14pro");
		phones[2] = new Phone("갤럭시", "삼성", 12000000, "s23");
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("LG");
		phones[0].setPrice(100000);
		phones[0].setSeries("1");
		
		int total = 0;
		for(int i =0; i <phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		System.out.println("총가격 : " + total);
		System.out.println("평균 가격 : " + total / phones.length);
		
		System.out.println("=======================================");
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 핸드폰 명 : ");
		String search = sc.nextLine();
		// 해당 휴대폰을 찾은 후에 그 가격을 알려

		for (int i = 0; i < phones.length; i++) {
			if (phones[i].getName().equals(search)) {
				System.out.println(phones[i].information()); //
			}
		}

		// 구매하고자 하는 휴대폰 이름 입력 : 벨벳폰
		// 당신이 구매하고자 하는 휴대폰의 가격은 1000000원 입니다.

	}

}

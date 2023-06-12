package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for each문(향상된 for문 / 개선된 for문)
		// 배열 또는 컬랙션과 함께 사용됨
		// 배열 또는 컬랙션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		
		/*
		 * [표현법]
		 * for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션) { // 반복횟수 == 배열 또는 컬렉션의 크기
		 *  반복적으로 실행할 내용
		 * }
		 */
		
		for(int value : arr) { // value = arr[0], value = arr[1], value = arr[2]
			System.out.println(value);
		}
		
		// 객체배열
		Phone[] phones = new Phone[3]; // 아직 객체가 만들어진게 아니라 배열만 만들어진 것
		phones[0] = new Phone("갤럭시", "삼성", 15000000, "S23"); // 객체 생성
		phones[1] = new Phone("아이폰", "애플", 13000000, "S23");
		phones[2] = new Phone("G4", "LG", 11000000, "G4");
		
		phones[2].setSeries("1");
		int total = 0;
		
		for (Phone p : phones) { // p = phones[0], p = phones[1], p = phones[2]
			System.out.println(p.information());
			total = p.getPrice();
			// 모든 인덱스의 금액 누적합 => total += i
			System.out.println("총합 : " + total);

			
		System.out.println("평균가 : " + total / phones.length +"원");
		}
		
		// 구매하고자 하는 핸드폰
		// 롤리팝
		// 가격 : xx원 => 향상된 for문

		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 핸드폰 : ");
		String search = sc.nextLine();
		
		for(int i = 0; i < phones.length; i++) {
			if(phones[i].getName().equals(search)) {
				System.out.println( "가격 : "+ phones[i].getPrice()+ "원");
			}
		}
		
		for(Phone p : phones) { // p => phones[0], p => phones[1], p => phones[2], 
			if(p.getName().equals(search)) {
				System.out.println("가격 : " + p.getPrice() + "원");
			}
		}

	}

}

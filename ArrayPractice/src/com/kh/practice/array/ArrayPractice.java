package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 길이가 10인 배열을 선언하고
		// 1부터 10까지의 값을 반복문 이용해 순서대로 배열 인덱스에 넣은 후 그 값을 출력

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public void practice4() {
		// 길이가 5인 String 배열을 선언하고
		// 사과, 귤, 포도, 복숭아, 참외로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요

		String[] str = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(str[1]);

	}

	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];
		String index = "";
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				index += i + " ";
				count++;

			}
		}

		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + " 개수 : " + count);
	}

	public void practice6() {
		// 월 ~ 일 까지 초기화된 문자열 배열을 만들고
		// 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력시 "잘못 입력하셨습니다"

		String[] str = { "월", "화", "수", "목", "금", "토", "일" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 7) {
			System.out.println(str[num] + "요일");
		} else
			System.out.println("잘못 입력하셨습니다.");

	}

	public void practice7() {
		// 1. 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수열 배열을 선언 할당
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		int sum = 0;

		// 2. 배열 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 => for문 쓰라는건가
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		// 3. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("총 합 : " + sum);

	}

	public void practice8() {
		// 1. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지 1부터 1씩 증가해 오름차순 값 넣고
			Scanner sc = new Scanner(System.in);
			
			int input;
			int[] arr;
			int num = 1;
			
			while (true) {
				System.out.print("정수 : ");
				input = sc.nextInt();
				
				if (input < 3 || input % 2 == 0)
					System.out.println("다시 입력하세요.");
				else {
					arr = new int[input];
					
					for (int i = 0; i < arr.length; i++) {
						System.out.println(arr[i]);
						if (i < arr.length / 2)
							arr[i] = num++;
						else //2. 중간 이후부터 끝까지 1씩 감소해 내림차순으로 값을 넣어 출력
							arr[i] = num--;
						
						if (i < arr.length - 1)
							System.out.print(arr[i] + ", ");
						else
							System.out.println(arr[i]);
					}
					
					break;
				}
			}
			
			sc.close();
		}
	
	public void practice9() {
		// 1. 사용자가 입력한 값이 배열에 있는지 검색하여
		// 2. 있으면 000 치킨 배달 가능.... 없으면 치킨은 없는 메뉴입니다
		// 단, 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"양념", "간장","파닭","후라이드"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if(chicken.equals(arr[i])) {
				count++;
			}
		}
			if(count == 1) {
				System.out.println(chicken + "치킨 배달 가능");
			}else {
				System.out.println(chicken+"치킨은 없는 메뉴입니다.");
			}
		}

	}
	
	

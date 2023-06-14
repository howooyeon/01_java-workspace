package com.kh.practice.array;

import java.util.Arrays;
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

		if (num < 7 && num > 1) {
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
			
			int num = 1;
			
			while (true) {
				System.out.print("정수 : ");
				int input = sc.nextInt();
				
				if (input < 3 || input % 2 == 0)
					System.out.println("다시 입력하세요.");
				else {
					int[] arr = new int[input];
					
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
	
	
		public void practice10() {
			// 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요
			// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경
			
			Scanner sc = new Scanner(System.in);
			System.out.print("주민등록번호(-포함) : ");
			String str = sc.nextLine();
			
			// 반복문을 활용해서 char[]에 옮겨담기
			char[] origin = new char[str.length()];
			
			for(int i = 0; i<str.length(); i++) {
				origin[i] = str.charAt(i);
			}
			
			// 복사본 char[]에 성별자리 이후부터 *로 값이 들어가게끔 깊은 복사 후 바로 출력
			
			char[] copy = new char[origin.length];
			
			for(int i = 0; i < copy.length; i++) {
				// 7번 인덱스 이하까지는 기존의 주민 번호들 복사
				if(i <= 7) {
					copy[i] = origin[i];
					// 그 이후부터는 * 값 들어가도록
				}else {
					copy[i] = '*';
				}
				// 바로 출력
				System.out.print(copy[i]);
			}
			
		}
		
		public void practice11() {
			// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			// 1~10사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
			
			int[] arr = new int [10];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 10 + 1);
			
				System.out.print(arr[i] + " ");
			}
		}
		
		public void practice12() {
			// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
			int[] arr = new int [10];
			
			// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 10 + 1);
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
			int max, min;
			
			max = min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(max<arr[i])
					max = arr[i];
				if(min>arr[i])
					min = arr[i];
			}
			System.out.println("최대 값 : " + max);
			System.out.println("최소 값 : " + min);
			
		}
		
		public void practice13() {
			// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			int[] arr = new int [10];
			
			// 1~10 사이의 난수를 발생시켜 *중복된 값이 없게* 배열에 초기화한 후 출력하세요
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random()*10 + 1);
				
				for (int j = 0; j < i ; j++) { // 코드 중요
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}

		}
		
		public void practice14() {
			// 로또 번호 자동 생성기 프로그램을 작성하는데 중복값 없이 오름차순으로 정렬하여 출력하세요
			
			int[] arr = new int [6];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45 + 1);
				
			// 중복값 판별 13번 참고
				for (int j = 0; j < i ; j++) { 
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
			
			// 오름차순 정렬
			for(int i = 0; i < arr.length; i++) {
				for(int j =  i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		public void practice15() {
			// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			// 문자의 개수와 함께 출력하세요
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			char[] arr = new char[str.length()];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i);
			}
			
			int count = 0;
			
			System.out.print("문자열에 있는 문자 : ");
			for(int i = 0; i < arr.length; i++) {
				boolean flag = true;
				
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					if(i == 0) {
						System.out.print(arr[i]);
					}else {
						System.out.print(", " + arr[i]);
					}
					count ++;
				}
			}
			System.out.println();
			System.out.println("문자 개수 : " + count);
			
		}
		
		public void practice16() {
			// 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언, 할당
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 크기를 입력하시오 : ");
			int size = sc.nextInt();
			sc.nextLine();
			
			// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화
			String[] arr = new String[size];
			
			// 사용자에게 첫 배열에 저장할 문자열 입력 받기
			for(int i = 0; i <arr.length; i++) {
				System.out.print((i+1)+ "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}
			
			// 반복이 시작되는 구간부터 무한루프로 내부에 종료 조건 만들고 break걸어주기
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				
				// 값을 더 입력할 경우
				if (ch =='Y'|| ch == 'y') {
					
					// 더 입력받을 개수 입력 받기
					System.out.print("더 입력하고 싶은 개수 : ");
					int plusSize = sc.nextInt();
					sc.nextLine();
					
					// 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력개수
					String[] newArr = new String[arr.length + plusSize];
					
					// 배열 복사 + 새로운 문자열 입력받기
					for(int i = 0; i <newArr.length; i++) {
						if(i< arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 기존 배열 값 복사
							newArr[i] = arr[i];
						}else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 문자열 입력 받기
							System.out.print((i+1)+"번째 문자열 : ");
							newArr[i] = sc.nextLine();
						}
					}
					
					// 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간 주소 newArr 대입
					arr = newArr;
				} else if(ch == 'N'|| ch == 'n') { // 값을 더 입력하지 않은 경우
					break; // 반복문 종료
				} else { // 잘못 입력한 경우
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			
			// 배열 값 모두 출력
			System.out.println(Arrays.toString(arr));
		}
		
	}

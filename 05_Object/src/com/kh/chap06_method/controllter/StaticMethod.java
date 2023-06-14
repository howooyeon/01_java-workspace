package com.kh.chap06_method.controllter;

public class StaticMethod {
	// 이클립스 키자 마자 바퀴벌레 잡듯이 잡아 쓴다
	
	
	// 1. 매개변수 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값 둘다 없는 static 메소드 입니다.");
		
	}
	
	
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	public static int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 static 메소드 입니다.");
				
		// 1부터 랜덤값 100 까지의 총 합계
		int sum = 0;
		int random = (int)(Math.random()*100 + 1);
		
		for (int i = 1; i < random; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public static void method3(String name) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드 입니다.");
		
		System.out.println( name + "님의 방문을 환영합니다.");
	}
	
	
	//4. (최강보스) 매개변수와 반환값 둘 다 있는 메소드
	public static boolean method4(String str1, String str2) {
		System.out.println("매개변수와 반환값 둘 다 있는 static 메소드 입니다.");
		

		/*
		 if(str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
		 */
		
		return str1.equals(str2); // return값은 출력해야만 확인 가능, 코드 한줄로 줄인 거임
	
	}

}

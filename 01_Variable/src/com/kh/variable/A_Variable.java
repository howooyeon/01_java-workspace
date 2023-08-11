package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printVariable() {
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 차은우 : 0000원 형식으로 출력하고 싶다
		
		System.out.println("차은우 : " + (9620 * 6 * 8)+ "원");
		System.out.println("주지훈 : " + (9620 * 6 * 8)+ "원");		
		System.out.println("이제훈 : " + (9620 * 6 * 8)+ "원");		
		System.out.println("장원영 : " + (9620 * 6 * 8)+ "원");		
		System.out.println("이호연 : " + (9620 * 6 * 8)+ "원");
		
		// 변수 사용 후
		System.out.println("=== 변수 사용 후 ===");
		
		int pay = 10000; // 자바에서 = 기호는 동등하다 라는 뜻이 아니라 10000이라는 값을 pay라는 상자에 넣겠다는 뜻
		int time = 8;
		int day = 4;
		// int pay = 20000; 중복됐기 때문에 안 됨
		
		
		System.out.println("차은우 : " + (pay * day * time)+ "원");
		System.out.println("주지훈 : " + (pay * day * time)+ "원");		
		System.out.println("이제훈 : " + (pay * day * time)+ "원");		
		System.out.println("장원영 : " + (pay * day * time)+ "원");		
		System.out.println("이호연 : " + (pay * day * time)+ "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다.)
		 * 2. 단 한 번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다.(재사용이 높아진다.)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 * */		
		
		System.out.println("시급 : " + pay);
		System.out.print("오"); // ln은 개행이다~
		System.out.println("안녕하세요");
		
		}
		
	// 변수의 선언을 공부하기 위한 메소드
	
	public void declareVariable() { //메소드는 소문자로 시작해서 두단어 이상이면 두번째 대문자 클래스는 대문자로 시작
		/* 
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉 값을 보관하기 위한 상자를 만들겠다!
		 * 
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미 부여!)
		 * 
		 * 변수 선언시 주의할 점
		 * 1. 변수이름은 소문자로 시작 / 단, 낙타봉 표기법을 지킬 것! 예약어는 불가
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가! => 즉, 중복이 불가능하다!
		 * 3. 해당 영역 안 ({}) 에서 선언한 변수는 그 영역 안에서만 사용 가능
		 * => 다른 메소드에서는 사용이 불가능하다!
		 * */
		
		// 사용자 이름 => user + name => userNamePhone (camelCase 낙타봉표기법)
		
		// ===== 자료형에 대한 개념 =====
		// 1. 논리형(논리값 = true / false)
		boolean isTrue;
		boolean isFalse = false; // boolean자료형 1byte, 변수 선언과 동시에 값을 대입
		
		System.out.println("isFalse 의 값 " + isFalse + " 입니다."); //sysout
		
		isTrue = 1 + 3 > 1; // 1 + 3이 1보다 큽니까? 참입니다! (true)
		isFalse = 4 + 2 < 1; // 4 + 2가 1보다 작습니까? 거짓입니다! (false)
		
		// 2. 숫자형
		// 2_1. 정수형 (소숫점x)
		byte bNum; // 1byte(-128 ~ 127)
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte, 정수형의 기본 자료형
		
		long lNum = 100000; // 8byte
		
		//2_2 실수형(소숫점O)
		float fNum = 0.0f; // 4byte => 소숫점 7자리까지 표현 가능
							//float의 경우 double과 값을 구분하기 위해 값 뒤에 f를 붙임.
		double dNum = 0.12345; // 8byte => 소수점 15자리까지 표현 가능, 실수형의 기본 자료형
		
		//3. 문자형
		//3_1. 문자
		char ch = 'a'; // 2byte '홑따옴표' 사용
		char kim;
		kim = '김';
		
		//3_2. 문자열
		String str; // String은 참조자료형, 색깔이 안 바뀜
		str = "abc";
		
		//값이 잘 담겨있는지 확인해보자!
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse );
		System.out.println("sNum : " + sNum );
		System.out.println("iNum : " + iNum );
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("kim : " + kim);
		System.out.println("ch : " + ch);	
		System.out.println("str : " + str);		
		
		// 상수의 선언!
		// [표현법] final 자료형 상수이름(대문자);
		final int AGE;
		AGE = 10; // 초기화
		
		System.out.println("AGE : " + AGE);
		// AGE = 11; 상수의 값은 변경이 불가하다.
		
		// 대표적인 상수의 예 : 3.14(원주율)
		
		System.out.println("파이 : " + Math.PI);
		
		// 번외 : 가독성을 위해 언더바를 사용할 수 있음
		int etc = 999_999_999;
		System.out.println("etc : " + etc);
		
		// * 변수 명명규칙
		int number;
		// 1) 같은 영역내에 중복된 이름 안 됨!
		int numBer; // 이건 된다. 자바는 대소문자를 구별한다.
		// 2) 예약어(자바에서 사용되고 있는 키워드) 안 된다.
		//int true;
		//int abstract;
		//int class;
		//int static;
		//int public;
		// 3) 숫자 사용가능하나(단, 숫자로 시작하는건 안 됨)
		int number1;
		int num1ber;
		// int 1number;
		// 4) 특수문자 사용가능하나 (단, 언더바와 $이외에는 사용불가)
		int number_1;
		int number$1;
		// int number!1;
		// int number#1;
		
		// 권장사항 !! 오류는 안나지만 지켜줬으면 하는 규칙
		// 1) 낙타봉표기법(두번째 단어부터 첫글자를 대문자로 작성)
		
		String userName; // 관례상 맞는 표현
		// String usernamel // 관례상 틀린 표현
		//String userNameTest
		
		// 2) 한글 사용 가능하나 무조건 영문자로 작성하자!! 
		String 이름; // 한글을 사용하지 않는 곳에서는 에러가 날 수 있음
		int 나이;
		int userAge;
		
		
		
	}
	
	
}

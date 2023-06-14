package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {

//	String s = "안뇽";	// 참조 자료형 **
//	int a = 10; 		// 기본 자료형

		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello"); // 매개변수 생성자
		String str2 = new String("hello"); // 매개변수 생성자

		// 주소값이 출력되지 않을까?
		System.out.println(str1.toString());
		System.out.println(str2);
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음! (실제 담긴 문자열 반환하도록)

		// 동등비교
		System.out.println(str1 == str2); // 주소값을 비교하니까 당연히 false
		System.out.println(str1.equals(str2)); // 무조건 equals로 비교해야함!
		// String 클래스에 있는 equals 메소드 이미 오버라이딩 돼있음!
		// Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String클래스에 hashCode 메소드 이미 오버라이딩 돼있음!(주소값이 아닌 실제 담겨있는 문자열(hello)을 가지고 해쉬코드
		// 만듦)

		// 근데 나는 주소값을 꼭 알고싶다
		// System.identityHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

	public void method2() {
		String str = new String("Hello");
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello"; 
		String str2 = "hello";
		
		// new 말고 리터럴값 "hello"
		
		// String  pool : 동일한 문자열을 가질 수 없음
		// 똑같은 문자네? 그럼 같은 주소값 참조해~ (바라봐)
		
		
		System.out.println(str1/*.toString()*/);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(str1 == str2); // 엥? true! (주소값 일치함) // 같은 주소값을 참조하고 있기 때문
		
		// String  pool : 동일한 문자열을 가질 수 없음
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		// str은 new 생성자를 통해 만들어서 주소값 다를 것
		
		String str3 = "hi";
		System.out.println(str1 == str3); // false
		System.out.println(System.identityHashCode(str3));
		
		// String 클래스 == 불변 클래스(변하지 않는 클래스)
		// 그럼 값을 못 바꾸는 건가요? 그건 아님..
		// 변경이 가능하긴 하나 그 자리에서 수정되는 개념 아님! -> 주소값을 새로 받는다는 뜻
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌 
		// 새로운 곳을 참조하도록 됨 (새로운 주소값 부여받음 == 주소값 변경)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));
		
		
	}

}

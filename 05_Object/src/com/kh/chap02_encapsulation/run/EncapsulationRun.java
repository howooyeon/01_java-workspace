package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!
	 * 
	 * * 캡슐화 : 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로
	 * 			클래스에서 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로	
	 * 			외부로부터 "데이터의 직접 접근을 막고"
	 * 			대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 돌려준다거나)" 할 메소드를 클래스 내부에 작성해서 관리
	 * 
	 * 
	 * 1) 정보은닉 : private 
	 * 	  직접접근을 막기 위해 private라는 접근제한자를 사용
	 * 
	 * 2) setter / getter 메소드 만들어야함
	 * 	  private 하는 순간 필드에 직접접근 불가!
	 *    setter 메소드 : 해당 필드에 대입시키고자 하는 값 전달 받아서 해당 필드에 대입시켜주는 메소드
	 *    getter 메소드 : 해당 필드에 담긴 값을 반환해주는 메소드
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Student moon = new Student();
		/*
		 * moon.name = "문동은";
		 * moon.age = 20;
		 */
		
		//moon.method1(0);
		
		moon.setName("문동은"); 
		moon.setAge(20);
		moon.setHeight(160.3);
		moon.setKorScore(100);
		moon.setmathScore(90);
		
		System.out.println(moon.getName());
		System.out.println(moon.getAge());
		System.out.println(moon.getHeight());
		System.out.println(moon.getMathScore());
		
		
		// 수정하고 싶다면?
		System.out.println("=== 수정후 ===");
		moon.setAge(25);
		System.out.println(moon.getAge());
	
	}

}

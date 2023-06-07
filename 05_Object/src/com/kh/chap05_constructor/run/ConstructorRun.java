package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 기본생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM 초기값들 담겨 있음!
		
		// 회원가입시 필수 입력사항만 입력받는다면?
		/*
		 * User u2 = new User(); u2.setUserId("user02"); u2.setUserPwd("pwd02");
		 * u2.setUserName("차은우"); u2.setGender('여');
		 System.out.println(u2.information());
		 
		 */
		
		//2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02","pwd02","차은우" ); 
		System.out.println(u2.information());
		
		// 그럼 setter 안만들어도 되지않을까? => 안됨
		// 비번을 바꾸는 경우, 개명을 한 경우 이름 
		u2.setUserName("차으누");
		System.out.println(u2.information());
		
		// getter은?
		// 비번을 까먹은 경우에는 비번만 보여줘야 함. 그때 getter 필요
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		// "user03" "pwd03" "장원영" "23" '여'
		// informtation() 출력
		
		User u3 = new User("user03", "pwd03", "장원영", 23, '여'); 
		System.out.println(u3.information());

	}

}

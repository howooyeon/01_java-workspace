package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		// 추상클래스 객체 생성 불가 (왜? 미완성 클래스기 때문에!)
		// Sports s = new Sports();
		// Sports s; // 객체 생성이 안될 뿐이지 래퍼런스로는 사용가능
		
		Sports s = new BasketBall(); // 다형성 적용 시켜서 부모타입으로 자식객체를 받아주는 형태는 가능
		
		Sports[] arr = new Sports[2]; // 배열만 만든거
		// 부모				자식
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		// 단순for문
		for(int i  =0; i <arr.length; i++) {
			arr[i].rule();
		}
		
		for(Sports a : arr) { // a= arr[0], a = arr[1] 
			a.rule(); // 여기서도 동적 바인딩!!
		}
		
		/*
		 * 동적 바인딩 : 컴파일 시점에서는 정적 바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키긴함
		 * 			   런타임 시점(실행 시점)에서는 동적 바인딩으로 각각의 자식 클래스에 오버라이딩된 메소드가 있을 경우 그거 실행됨
		 */
		
		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부({})가 구현되어 있지 않은 메소드
		 * * 추상 클래스
		 * - 미완성된 클래스
		 * - 일반 필드 + 일반 메소드[+ 추상 메소드]
		 * => 추상 메소드를 가진 클래스는 반드시 추상클래스로 명시 해야됨
		 * 
		 * * 추상메소드가 굳이 없어도 추상 클래스로 만들 수 있음
		 *   언제 사용되나요?
		 *   
		 *   > 개념적 : 단지 이 클래스가 미완성된 클래스다 라는 걸 부여할 목적 => 덜 만들었을 때
		 *   > 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때
		 *   
		 * * 추상 메소드가 존재하는 클래스를 쓰는 이유!
		 * - 부모 클래스에 추상메소드가 존재할 경우
		 *   자식 클래스에서는 강제로 오버라이딩 해서 동일한 패턴의 메소드를 가지게 됨
		 *  
		 *  => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 *  	=> 메소드 통일성 확보 목적
		 *  	=> 표준화된 툴을 제공할 목적
		 *  
		 *   
		 */
	}

}

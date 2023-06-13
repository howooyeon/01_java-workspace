package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mom;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		// Person p = new Person(); 추상 클래스에서 객체 생성 안 됨
//		Person m = new Mom("김엄마", 50, 70, "출산");
//		Person b = new Baby("김아기", 3.5, 70);
//		
//		System.out.println(m);
//		System.out.println(b);
//		
//		m.eat(); // 몸무게 + 10 / 건강도 - 10
//		b.eat(); // 몸무게 + 3 / 건강도 + 1
//		
//		m.sleep(); // 건강도 + 20
//		b.sleep(); // 건강도 + 3
//		
//		System.out.println("======다음날======");
//		System.out.println(m);
//		System.out.println(b);
		
		// Basic b = new Basic(); 래퍼런스 변수로는 사용 가능하나 객체 생성은 불가능함
		Basic m = new Mom("김엄마", 50, 70, "출산");
		Basic b = new Baby("김아기", 3.5, 70);

		System.out.println(m);
		System.out.println(b);
		
		m.eat();
		b.eat();
		
		m.sleep();
		b.sleep();
		
		System.out.println(m);
		System.out.println(b);
		
		/*
		 * 클래스에서 클래스를 상속받을 때 : 클래스 extends 클래스 (단일 상속만 가능)						 : 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스 1, 인터페이스2, ... (다중구현 가능) : 화살표 점선
		 * 인터페이스에서 인터페이스를 상속  : 인터페이스 extends 인터페이스1, 인터페이스2, ...(다중상속 가능)	  : 화실표 실선
		 * 
		 * 
		 * 
		 * 
		 * 				|		 추상클래스			|		인터페이스
		 * ===========================================================
		 * 		상속개수	|		단일 상속			|		다중상속
		 * -----------------------------------------------------------
		 * 		키워드	|		extends			|		implements
		 * -----------------------------------------------------------
		 * 	  추상메서드   |	추상메서드 0개 이상		|		묵시적으로
		 * 	 표현법/개수   |	명시적으로 abstract		|		abstract사용가능
		 * -----------------------------------------------------------
		 * 일반 메소드 여부 |           O			|	 		x
		 * -----------------------------------------------------------
		 * 		필드				일반필드가능		상수 필드만 가질 수 있음 (묵시적으로 public statice final..)
		 * 
		 * * extends 일반 클래스 --> extends 추상 클래스 --> implements 인터페이스
		 * -------------------------------------------------------------->
		 * 					강제성이 더 짙어짐 (규약이 더 쎄짐)
		 * 
		 */
	
		
		
		
		
		
	}

}

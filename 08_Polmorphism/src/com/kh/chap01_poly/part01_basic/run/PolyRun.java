package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {
	
	public static void main(String[] args) {
		
		// 기억해둘 것! '=' 기준으로해서 왼쪽과 오른쪽의 자료형(타입)은 같아야함!
		
		System.out.println("1. 부모타입 래퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 래퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 래퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 자동형변환 된거였음! (child1 => Parent)
		// ((Parent)c1).printParent();
		// c1 래퍼런스로 child1, Parent 둘다 접근 가능
		// Parent 접근시 자동으로 형변환 된 체로 진행된 거임
		
		System.out.println("3. 부모타입 래퍼런스로 자식객체 다루는 경우(다형성)");
		Parent p2 = /*(Parent)*/new Child1(); // 자료형이 다르다? => 에러 안 뜸 => 자동형변환 된 거임
		p2.printParent();
		//p2.printChild();
		((Child1)p2).printChild1();

	}

}

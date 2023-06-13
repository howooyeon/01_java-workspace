package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mom;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		// Person p = new Person(); 추상 클래스에서 객체 생성 안 됨
		Person m = new Mom("김엄마", 50, 70, "출산");
		Person b = new Baby("김아기", 3.5, 70);
		
		System.out.println(m);
		System.out.println(b);
		
		m.eat(); // 몸무게 + 10 / 건강도 - 10
		b.eat(); // 몸무게 + 3 / 건강도 + 1
		
		m.sleep(); // 건강도 + 20
		b.sleep(); // 건강도 + 3
		
		System.out.println("======다음날======");
		System.out.println(m);
		System.out.println(b);
		
	}

}

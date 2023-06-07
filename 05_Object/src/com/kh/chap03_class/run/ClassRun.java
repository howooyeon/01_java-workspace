package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		Product snack = new Product();

		/*
		 * snack.setpName("참크래커"); snack.setBrand("해태"); snack.setPrice(1200);
		 * 
		 * System.out.println("===상품1==="); System.out.println(snack.getpName());
		 * System.out.println(snack.getBrand()); System.out.println(snack.getPrice());
		 * System.out.println();
		 * 
		 * snack.setpName("자두알맹이"); snack.setBrand("오리온"); snack.setPrice(2000);
		 * 
		 * System.out.println("===상품2==="); System.out.println(snack.getpName());
		 * System.out.println(snack.getBrand()); System.out.println(snack.getPrice());
		 * System.out.println();
		 * 
		 * snack.setpName("비타오백젤리"); snack.setBrand("광동"); snack.setPrice(1500);
		 * 
		 * System.out.println("===상품3==="); System.out.println(snack.getpName());
		 * System.out.println(snack.getBrand()); System.out.println(snack.getPrice());
		 */
		
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		
		Product p2= new Product();
		p2.setpName("아이폰");
		p2.setPrice(1300000);
		p2.setBrand("애플");
		
		System.out.println("pName : " + p1.getpName() + ", Price : " + p1.getPrice() + ", Brand : " + p1.getBrand());
		System.out.println("pName : " + p2.getpName() + ", Price : " + p2.getPrice() + ", Brand : " + p2.getBrand());
		
		System.out.println("===메소드 만들고 난 후===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		
		Person p = new Person();
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("이호연");
		p.setAge(23);
		p.setGender('F');
		p.setPhone("010-xxxx-xxxx");
		p.setEmail("hihihi@naver.com");
		
		System.out.println("=== 값 대입후 ===");
		
		System.out.println(p.getId());
		System.out.println(p.getpwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEamil());
		
		
		System.out.println(p.information());
		
		

	}

}

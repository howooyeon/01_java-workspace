package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		Product snack = new Product();
		
		snack.setpName("참크래커");
		snack.setBrand("해태");
		snack.setPrice(1200);
		
		System.out.println("===상품1===");
		System.out.println(snack.getpName());
		System.out.println(snack.getBrand());
		System.out.println(snack.getPrice());
		System.out.println();

		snack.setpName("자두알맹이");
		snack.setBrand("오리온");
		snack.setPrice(2000);
		
		System.out.println("===상품2===");
		System.out.println(snack.getpName());
		System.out.println(snack.getBrand());
		System.out.println(snack.getPrice());
		System.out.println();
		
		
		snack.setpName("비타오백젤리");
		snack.setBrand("광동");
		snack.setPrice(1500);
		
		System.out.println("===상품3===");
		System.out.println(snack.getpName());
		System.out.println(snack.getBrand());
		System.out.println(snack.getPrice());
		
	}

}

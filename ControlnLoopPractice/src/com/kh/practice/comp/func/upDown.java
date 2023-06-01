package com.kh.practice.comp.func;

import java.util.Scanner;

public class upDown {

	public void practice1() {
	      int random = (int) (Math.random() * 100 + 1);
	      Scanner sc = new Scanner(System.in);
	      int count = 1;
	      System.out.println(random);
	      
	      while(true) {
	         System.out.print("1 ~ 100 사이의 난수를 맞춰보세요 : ");
	         int num = sc.nextInt();
	         
	         if(num > 0 && num < 101) {
	            if(random == num) {
	               System.out.println("정답입니다 !!");
	               System.out.printf("%d회만에 맞추셨습니다.",count);
	               break;
	            }else if(random > num) {
	               System.out.println("UP !");
	               count++;
	            }else {
	               System.out.println("DOWN !");   
	               count++;
	            }
	            
	         }else {
	            System.out.println("1~100 사이의 숫자를 입력해주세요.");
	         }
	      }
	}
}

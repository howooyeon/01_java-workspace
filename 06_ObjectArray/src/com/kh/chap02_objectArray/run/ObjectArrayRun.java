package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		int[] arr = new int [3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop문  => 단순한 for문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Phone[] phones = new Phone[3]; // 객체 생성한 것이 아니고 배열을 생성한 것
		System.out.println(phones);
		System.out.println(phones[0]);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

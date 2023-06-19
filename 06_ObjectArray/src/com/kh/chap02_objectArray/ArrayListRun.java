package com.kh.chap02_objectArray;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;


public class ArrayListRun {

	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<>(); // 뒤에 제네릭 생략가능 jdk 6이상
		
		list.add(new Phone()); // 기본생성자
		list.add(new Phone("아이폰", "애플", 1300000, "14pro"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "s23"));
		
		list.get(0).setName("밸벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}
		
		System.out.println("총가격 : " + total + "원 ");
		System.out.println("평균가 : " + total / list.size() + "원");

		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 핸드폰 명 : ");
		String search = sc.nextLine();
		// 해당 휴대폰을 찾은 후에 그 가격을 알려

		for (Phone p : list) {
			if (p.getName().equals(search)) {
				System.out.println(p.information());
			}
		}

	}

}

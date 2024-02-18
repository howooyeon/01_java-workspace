package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 50000)");
		while (true) {
			System.out.print("나라이름, 인구 >> ");
			String nation = sc.next();
			if (nation.equals("그만"))
				break;
			int population = sc.nextInt();
			nations.put(nation, population);
		}
		while (true) {
			System.out.println("인구 검색 >> ");
			String nation = sc.next();
			if (nation.equals("그만"))
				break;
			Integer n = nations.get(nation);
			if (n == null)
				System.out.println(nation + " 나라는 없습니다.");
			else
				System.out.println(nation + "의 인구는 " + n);
		}
		sc.close();
	}
}

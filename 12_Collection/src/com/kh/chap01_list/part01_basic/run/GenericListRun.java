package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("쌔삥","지코"));
		// list.add("가보자고"); 다른 타입 담기 불가 제네릭 설정했을 때 다른 타입 담기가 안됨
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0,2);
		// 제네릭 설정 안 하면 안 됨
		
		list.addAll(sub);
		
		Music m = list.get(0); // 아깐 제네릭 설정 안해서 오브젝트 자료형이었음 지금은 Music으로 받음
		System.out.println(m);
		
		System.out.println(list.get(0).getArtist()); // 너무 편--안
		
		for(Music mu : list) {  // mu => list.get(0) => mu = list.get(1)
			System.out.println(mu);
		}
		
		/*
		 * 제네릭<>을 사용하는 이유
		 * 
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객첵를 꺼내서 사용할 때 매번 형변환 하는 절차를 없애기 위해
		 * 
		 * - 공부를 하는 효과적인 방법 객체배열을 다 컬렉션으로 바꾸는 것
		 * 
		 */
		
	}

}

package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주는 클래스!! 출력문 쓰지 않기
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();

	{
		// 초기화 블럭
		list.add(new Music("Attention", "뉴진스")); // [Attention, 뉴진스]
		list.add(new Music("새삥", "지코"));

	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectMusic() {
		// 돌려준다 => return
		return list;
	}

	public void deleteMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

}

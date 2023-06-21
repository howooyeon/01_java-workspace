package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주는 클래스!! 출력문 쓰지 않기
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("사건의 지평선", "윤하"));
		list.add(new Music("느린 심장박동", "래원"));
		list.add(new Music("너의 모든 순간", "성시경"));
		list.add(new Music("모든 날, 모든 순간", "폴킴"));
	}

	public void insertMusic(String title, String artist) {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectMusic() {
		return list;
	}

	public int deleteMusic(String title) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) { // 이해하기
				list.remove(i);
				result = 1;
				break; // 반복문 탈출
			}
		}
		return result;
	}

	public ArrayList<Music> searchMusic(String title) {
		ArrayList<Music> searchList = new ArrayList<Music>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(title)) {
				searchList.add(list.get(i)); // 이 부분 중요
			}
		}
		return list;
	}

	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(upArtist)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
			}
		}

		return result;
	}

}

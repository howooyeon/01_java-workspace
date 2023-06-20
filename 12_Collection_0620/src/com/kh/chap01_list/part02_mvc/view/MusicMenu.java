package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스(출력문, 입력문)
/**
 * @author LHY
 * @since 2023.06.20
 * @version 1.0
 *
 */

public class MusicMenu {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println("\n========= Welcome 별밤 ==========");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");

			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMusic();
				break;
			case 2:
				selectMusic();
				break;
			case 3:
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");

			}

		}

	}

	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n=========새로운곡 추가=========");
		System.out.print("제목을 입력해주세요 : ");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 곡이 추가되었습니다.");
		
	}

	/**
	 * 2. 전체곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n=========전체 곡 조회=========");
		ArrayList<Music> list = mc.selectMusic();

		if (list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}

	/**
	 * 3. 음악 삭제하는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n=========음악 삭제=========");
		System.out.print("삭제하고자 하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if (result == 1) {
			System.out.println("음악이 삭제 되었습니다.");
			selectMusic();
		} else {
			System.out.println("삭제할 음악을 찾지 못했습니다.");
		}
	}

	/**
	 * 4. 특정 곡을 검색하는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n=========음악 검색=========");
		System.out.print("검색할 음악을 입력해주세요(키워드 가능) : ");
		String title = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(title);
		
	}

	/**
	 * 5. 특정 곡 수정하는 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n=========곡 수정=========");
		System.out.print("수정하고자 하는 곡명 : ");
		String title = sc.nextLine();
		System.out.print("수정 내용 가수 : ");
		String upArtist = sc.nextLine();
		System.out.print("수정 내용 곡명: ");
		String upTitle = sc.nextLine();
		
		int result = mc.updateMusic(title, upArtist, upTitle);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.ㅣ");
		}
		
	}

}

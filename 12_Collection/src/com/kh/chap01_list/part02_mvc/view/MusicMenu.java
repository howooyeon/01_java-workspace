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
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	
	public void mainMenu() {
		
		while(true) {
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
			
			switch(menu) {
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
				continue;
				
			}

		}

	}
	
	
	
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n======= 새로운 곡 추가 ========");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청 보내기! (사용자의 요청 처리해주는 컨트롤러단에!)
		// 사용자가 입력한 곡명, 가수명 같이 넘기면서!!
		// 즉, controller 메소드 호출
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 곡이 추가되었습니다.");
		
		
	}
	
	/**
	 * 2. 전체곡 조회용 서브화면
	 */
	public void selectMusic() {
		
		System.out.println("\n======= 전체곡 리스트 ========");
		// 전체곡 조회 요청! (Controller 메소드 호출)
		ArrayList<Music> list = mc.selectMusic();
		
		/* 리스트가 비어있을 때는 이 for문이 안 돌아감
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		if(list.isEmpty()) { // 현재 리스트가 비어있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		} else { // 그게 아닐 경우 (즉, 뭐라도 담겨 있을 경우)
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
		
	}
	
	/**
	 * 3. 음악 삭제하는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n======= 특정 곡 삭제 ========");
		System.out.print("삭제하고자 하는 곡 명 : ");
		String title = sc.nextLine();
		
		mc.deleteMusic(title);
		
	}
	
	/**
	 * 4. 특정 곡을 검색하는 서브화면
	 */
	public void searchMusic() {
		
	}
	
	/**
	 * 5. 특정 곡 수정하는 서브화면
	 */
	public void updateMusic() {
		
	}	
	
	
}
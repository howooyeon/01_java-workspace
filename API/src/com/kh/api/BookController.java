package com.kh.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class BookController {
		
	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	
	private Book[] bk = new Book[5];
	{
		bk[0] = new Book("자바의 정석", "차은우", "나무", new Date(), 10000);
		bk[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(), 20000);
		bk[2] = new Book("API의 모든것", "문동은", "오렌지", new Date(), 35000);
		bk[3] = new Book("언어의 천재", "장원영", "키위", new Date(), 70000);
		bk[4] = new Book("개발왕국", "시연쌤", "바나나", new Date(), 80000);
	}
	
	public BookController() {
		
	}
	
	public BookController(Book bk[]) {
		this.bk = bk;
	}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		// 1) for loop문 방법
//		for(int i = 0; i < bk.length; i++) {
//			System.out.println(bk[i]);
//		}
		for(Book b : bk) {
			System.out.println(b);
		}
	}

	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		// 1. 매개변수로 전달받은 newPrice값 ==> String --> int로 변환작업 (int price라는 변수에 담으시오) "20000" --> 20000
		int price = Integer.parseInt(newPrice);
		
		// 2. 매개변수로 전달받은 newDate값 ==> String --> Date로 변환 작업 (Date publishDate에 담으시오)
		
		// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
		// 1) StringTokenizer를 이용한 방법
		// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리("2020", "07", "01")
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		
		// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
		// 1_3) year, month, date 가지고 Date객체 생성하기
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int date = Integer.parseInt(stn.nextToken());

		Date publishDate = new Date(year - 1900, month -1, date);
		
		// 2) split 메소드를 이용한 방법
//		String[] date = newDate.split("-");
//
//		// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서 int 변수들에 담기
//		int year = Integer.parseInt(date[0]);
//		int month = Integer.parseInt(date[1]);
//		int day = Integer.parseInt(date[2]);
//
//		// 2_3) year, month, date 가지고 Date객체 생성하기
//		Date publishDate = new Date(year - 1900, month - 1, day);
		
		Book newBook = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		
		Book[] newArray = new Book[bk.length + 1];

		// 기존 배열의 요소들을 새로운 배열로 복사
//		for (int i = 0; i < bk.length; i++) {
//			newArray[i] = bk[i];
//		}
		
		int count = 0;
		for(Book a : bk) {
			newArray[count] = bk[count];
			count++;
		}

		// 새로운 요소를 추가
		newArray[bk.length] = new Book(newTitle, newAuthor, newPublisher, publishDate, price);

		// 기존 배열을 새로운 배열로 업데이트
		bk = newArray;

		System.out.println("추가도서 추가완료!");
		
	}

	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 출간");

		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력
		Date publishDate = bk[5].getPublishDate();

		// SimpleDateFormat을 이용하여 출력
		String formattedDate = dateFormat.format(publishDate);
		System.out.println(formattedDate);

		System.out.println();
	}

	// 4. 도서 검색 기능 메소드

	public void searchBook(String searchTitle) { // 도서 검색 기능 메소드
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		for (int i = 0; i < bk.length; i++) {
			if (bk[i].getTitle().contains(searchTitle)) {
				System.out.println(bk[i]);
			}
		}
	}

}
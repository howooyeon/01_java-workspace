package com.kh.practice.pracAPI;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;


public class BookController {
	private Book[] bk= new Book[5]; {
		bk[0] = new Book("자바의정석","차은우", "나무", new Date(2023-1900, 6-1, 14), 10000);
		bk[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023-1900, 5-1, 11), 20000);
		bk[2] = new Book("API의 모든것", "문동은", "오렌지", new Date(2020-1900, 4-1, 25), 35000);
		bk[3] = new Book("언어의 천재","장원영", "키위", new Date(2015-1900, 1-1, 1), 70000);
		bk[4] = new Book("개발왕국","시연쌤","바나나", new Date(2022-1900, 12-1, 25),  80000);
	}
	
	public BookController() {
		
	}
	
	public BookController(Book bk[]) {
		this.bk = bk;
	}
	
	public void printAll() {
		// list에 담긴 전체 Book 객체의 정보 출력하는 구문 작성
		for(int i = 0; i < bk.length; i++) {
			System.out.println(bk[i]);
		}
	}
	
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		int price = Integer.parseInt(newPrice);
		
		StringTokenizer stn= new StringTokenizer(newDate, "-");
		
		// 각각 분리된 문자열 매번 뽑아서 int 변수에 담기
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int date = Integer.parseInt(stn.nextToken());
		
		// 값 가지고 Date 객체 생성하기
		Date publishDate = new Date(year -1900, month - 1, date);
		
		// 나머지 전달 받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고 Book 클래스의 매개변수 생성자를 통해 생성
		Book newBook = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		
		// 배열 한 자리 늘리기 1. newArray 객체 생성
		Book[] newArray = new Book[bk.length+1];
		
		// 기존의 배열을 새로운 배열에 옮겨 담기
		for(int i  = 0; i < bk.length; i++) {
			newArray[i] = bk[i];
		}
		
		// 새로운 요소를 추가
		newArray[bk.length] = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		
		// 기존 배열을 새로운 배열로 업뎃
		bk = newArray;
		
		System.out.println("추가도서 추가완료!");
		
		
	}
	
	public void printBookPublishDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		
		// 새로 입력받은 도서(5번째 도서)의 출간일 출력
		Date publishDate = bk[5].getPublishDate();
		// SimpleDateFortmat 사용해서 출력 -- > ???
		String formattedDate = dateFormat.format(publishDate);
		System.out.println(formattedDate);
		
	}
	
	public void searchBook(String searchTitle) {
		// 도서 리스트를 전체적으로 조회, 전달받은 검색명을 포함
		for(int i = 0; i < bk.length; i++) {
			if(bk[i].getTitle().contains(searchTitle)) {
				System.out.println(bk[i]);
			}
		}
	}
	
	
}

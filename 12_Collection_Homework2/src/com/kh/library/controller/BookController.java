package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Magazine;
import com.kh.library.model.vo.Book;

//BookManager 인터페이스 구현
public class BookController implements BookManager{
	ArrayList<Book> bList = new ArrayList<Book>();

	@Override
	public void addBook(Book nBook) {
		bList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		// 도서관 전체 소장책 조회하기
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book b = null;
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i).getbNo().equals(bNo)) {
				b = bList.get(i);
			}

		}
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for(int i = 0; i < bList.size(); i++) {
			if(bList.get(i).getTitle().equals(title)) {
				temp.add(bList.get(i));
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {

		ArrayList<Book> temp = new ArrayList<>();
		for (Book b : bList) {
			if (b instanceof Magazine)
				continue;
			else
				temp.add(b);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book b : bList) {
			if (b instanceof Magazine)
				temp.add(b);
		}
		return temp;

	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> b = new ArrayList<Book>();
		
		
			
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> b = new ArrayList<Book>();
		
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> b = new ArrayList<Book>();
		
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}

	public static BookController getInstance() {
		return null;
	}
	
	
	
	
	

}

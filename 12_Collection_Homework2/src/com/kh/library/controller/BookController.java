package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Magazine;
import com.kh.library.model.vo.Book;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
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
		Book b = null; // 처음에 null로 초기화
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i).getbNo().contains(bNo)) {
				b = bList.get(i);
			}

		}
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>(); //[책 1, 책 2] or []
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i).getTitle().contains(title)) {
				temp.add(bList.get(i));
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {

		ArrayList<Book> searBook = new ArrayList<>();
		for (Book b : bList) {
			if (b instanceof Magazine)
				continue;
			else
				searBook.add(b);
		}
		return searBook;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> searchMag = new ArrayList<>();
		for (Book b : bList) {
			if (b instanceof Magazine)
				searchMag.add(b);
		}
		return searchMag;

	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> yearList = new ArrayList<Book>();
		
		for(int i = 0; i < bList.size(); i++) {
			 if(bList.get(i) instanceof Magazine) {
				 if(((Magazine)bList.get(i)).getYear() == year) {
					 yearList.add(bList.get(i));
				 }
			 }
		}
		
//		for (Book b : bList) {
//			if (((Magazine) b).getYear() == year) {
//				yearList.add(b);
//			}
//		}
		return yearList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> pubList = new ArrayList<Book>();
		for(int i = 0; i < bList.size(); i++) {
			if(bList.get(i).getPublisher().contains(publisher)) {
				pubList.add(bList.get(i));
			}
		}
		
//		for (Book b : bList) {
//			if (b.getPublisher().contains(publisher)) {
//				pubList.add(b);
//			}
//		}

		return pubList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> searList = new ArrayList<Book>();
		for(int i = 0; i < bList.size(); i++) {
			if(bList.get(i).getPrice() < price) {
				searList.add(bList.get(i));
			}
		}
		return null;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for(int i = 0; i < bList.size(); i++) {
			total += bList.get(i).getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {
		int avgprice = 0;
		for(int i = 0; i < bList.size(); i++) {
			avgprice = (getTotalPrice()/ bList.size());
		}
		return avgprice;
	}

	public static BookController getInstance() {
		return null;
	}

}

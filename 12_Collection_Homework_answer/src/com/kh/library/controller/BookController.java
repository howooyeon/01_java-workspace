package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book book = null;
		for(Book b:list) {
			if(b.getbNo().equals(bNo)) {
				book=b;
			}
		}
		return book;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book b:list) {
			if(b.getTitle().contains(title)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bookList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				continue;
			}
			bookList.add(list.get(i));
		} 
		
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> bookList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				bookList.add(list.get(i));
			}
		} 
		
		return bookList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> mList = onlySearchMagazine();
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book b : mList) {
			if(((Magazine)b).getYear() == year) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book b:list) {
			if(b.getPublisher().contains(publisher)) {
				searchList.add(b);
			}
		}
		return searchList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book b : list) {
			if(b.getPrice() < price) {
				searchList.add(b);
			}
		}
		return searchList;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for(Book b:list) {
			total += b.getPrice();
		}
		
		return total;
	}

	@Override
	public int getAvgPrice() {
		int total = 0;
		for(Book b:list) {
			total += b.getPrice();
		}
		
		return total / list.size();
	}
	

}

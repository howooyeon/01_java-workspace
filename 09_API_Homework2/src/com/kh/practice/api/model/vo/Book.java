package com.kh.practice.api.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private Date publishDate;
	private int price;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, java.util.Date publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = (Date)publishDate;
		this.price = price;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		if (publishDate != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
			// return dateFormat.format(publishDate);
			return "[title=" + title + ", author=" + author + ", publicher=" + publisher + ", publichDate="
					+ dateFormat.format(publishDate) + ", price=" + price + "]";
		}

		return "";

	}

}

package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	
	// 객체 자체를 입출력 하고자 한다면 직렬화 과정 필수
	
		private String name;
		private int price;
		
		public Phone() {
			
		}
		
		public Phone(String name, int price){
			this.name = name;
			this.price = price;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Phone [name=" + name + ", price=" + price + "]";
		}
		
		
		
}

package com.kh.chap03_class.model.vo;

// 클래스 선언 구문에 작성가능한 접근제한자(public, default만 가능)
// default라고 쓰는게 아니고 접근제한자를 지우면 default가 되는 거임
// default로 하면 같은 패키지 내에서만 사용가능 / 다른 패키지에서는 해당 파일 사용 불가 => 못찾음


public class Product {
		
	/*
	 * 필드(field)
	 * 
	 * *필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 
	 */
	
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * * 생성자
	 * - 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명 ([매개변수, 매개변수, 매개변수, ...]){
	 * 
	 * 
	 * }
	 * 
	 */
	
	
	/*
	 * 메소드
	 * - 기능을 처리하는 담당
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명() {
	 * // 기능구현
	 * 
	 * 
	 * }
	 */
	
	// 기본생성자
	public Product() {
		
	}

	public void setpName(String pName) { // 세팅하고 반환할 거 없기 때문에 void
		this.pName = pName; 
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
	
	/*
	 * 내가 생각할 때 유용할 거 같은 메소드 자유롭게 생성 가능
	 */
	
	// 모든 필드값을 다 합친 한 문자열을 반환해주는 메소드
	public String information() {
		// return pName, brand, price; return 하나만 됨. 여러개 나열 x 그리고 반환형 정할 수가 없음..
		
		return "pName : " + pName + ", " + "price : " + price + ", " + "brand : " + brand;
		
	}
	
	

}

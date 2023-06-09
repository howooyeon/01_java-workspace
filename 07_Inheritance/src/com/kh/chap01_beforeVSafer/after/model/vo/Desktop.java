package com.kh.chap01_beforeVSafer.after.model.vo;
			// 자식-----------> 부모
			// 후손-----------> 조상
			// 하위-----------> 상위
			// this----------> super
public class Desktop extends Product{ // extends Product
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		// brand ~ price 네 개의 값들은 부모 클래스(product)의 필드에 대입
		
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		
		// 해결방법 2. 부모클래스에 있는 setter 메소드 활용하기 (public이기 때문)
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결방법 3. 부모생성자 호출하기 => 우리는 이걸로 간다
		// this 생성자 this(), super() 위치가 항상 위여야 한다
		super(brand, pCode, pName, price); // 이게 무슨 의미인지 잘 알기
		this.allInOne = allInOne;
		
		
	}
	public boolean isAllInOne() {
		return isAllInOne();
	}
	
	public void setIsAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것 엄마 아빠 차 탄다
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
	
	
}

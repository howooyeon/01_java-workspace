package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class BasketBall extends Sports{

	// 자식 클래스에 강제성을 부여하기 위함
	// basketball, football이든 무조건 rule이 있으니 rule을 구현했으면 해서...
	
	// 추상 메소드가 존재하는 추상 클래스를 상속받는 순간
	// 부모 클래스에 있던 추상메소드를 강제로 오버라이딩 해야됨

	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 다뤄야 합니다.");
	}
}

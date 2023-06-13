package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	private int people;

	public Sports() {

	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void getPeople(int people) { // 머리부
		this.people = people; 			// 몸통부 = ** 이게 없으면 완벽한 메소드가 아님
	}
	
	

	@Override
	public String toString() {
		return "people : " + people;
	}
	
	// 추상메소드 (미완성된 메소드) 만들기
	// public void rule(); // 머리부만 있음.. 몸통부가 없다고 에러
	public abstract void rule(); // 덜 떨어짐을 인정하는 것
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성이라는 이야기
	
	// 그럼 언제 완성하나요...? => 해당 추상클래스를 상속 받는 자식에서!!!
	
	
	
	
	
	
	
	

}

package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// 실행용 클래스는 납품 업체라고 생각!
		
		// 1. 다형성을 적용 안 했을 경우(ElctronicShop1)
//		ElectronicShop1 es = new ElectronicShop1();
//		// es에서 마련해놓은 desk, note, tab이라는 필드에
//		// 객체를 생성해서 넣어주기 위해서 우선 es 생성!
//		
//		// 메소드를 써서 생성하겠음
//		// 먼저 필요한 메소드를 생각해보자
//		
//		// 아직은 없는 메소드
//		// 추가용 메소드 => insert
//		// desktop이라는 객체를 생성해서 넘기는 메소드
//		
//		es.insert(new Desktop("삼성", "데스크탑", 120000, "GTX1070"));
//		
//		// 노트북이라는 객체를 생성해서 넘기는 메소드
//		es.insert(new NoteBook("LG", "노트북", 200000, 4));
//		
//		// 테블릿이라는 객체를 생성해서 넘기는 메소드
//		es.insert(new Tablet("애플", "아이패드", 8000000, false));
//		
//		// 가게에 해당 객체들이 잘 생성돼 있는지를 확인해보자
//		// 조회용 메소드 => select();
//		
//		// String desk = es.selectDesktop();
//		Desktop d = es.selectDesktop();
//		NoteBook n = es.selectNoteBook();
//		Tablet t = es.selectTablet();
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
		
		// 2. 다형성 적용했을 경우(ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		// 추가용 메소드 => insert
		
		es.insert(new Desktop("삼성", "데땁", 12000000, "gtx2112"));
		es.insert(new NoteBook("LG", "노트북", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 700000, false));
		
		// 조회용 메소드 => select
		// 이번에는 이름을 하나로!!
		
		
		// es.select(인덱스값);
		// Desktop d = es.select(0); ? 안되네
		// 실제로 들어있는 값은 데스크탑 객체가 맞으나 반환형이 Electronic 이라서 맞춰줘야함 => 강제형변환
		
//		Desktop d = (Desktop)es.select(0);
//		NoteBook n = (NoteBook)es.select(1);
//		Tablet t = (Tablet)es.select(2);
		
		// 위아래 방법 둘다  가능
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		// 이런걸 다운캐스팅 이라고 한다.
		
		// 그럼 toString() 할 때 부모에 있는 toString을 불러오지 않을까?
		// 아님 => 왜? 동적 바인딩!

		System.out.println(d /*.toString()*/); // 어떻게 뒤에 상세정보도 나오는 거지? 동적 바인딩
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입 배열로 다양한 자식 객체들을 받을 수 있음
		 * 2.메소드 정의시 매개변수로 다형성을 적용하게 되면 메소드 개수가 확 줄어든다!
		 * 3. 필수로 써야하는 곳이 있음 => 추상클래스 (인터페이스)
		 */

	}

}

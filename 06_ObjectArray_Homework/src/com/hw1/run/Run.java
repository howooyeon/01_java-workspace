package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] employees = new Employee[3];
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		employees[0] = new Employee();
		System.out.println(employees[0].information());
		
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		Employee employees1 = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		System.out.println(employees1.information());
		
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		Employee employee2 = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 10000000, 0.01, "01011112222", "서울 마곡");
		System.out.println(employee2.information());
		
		System.out.println("===========================================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		employees[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
		System.out.println(employees[0].information());
		employees[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000 , 0.3, "01022223333", "서울 잠실");
		
		System.out.println(employees[1].information());
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
		int e1Total = (int) ((3000000 + 3000000 * 0.2) * 12);
		int e2Total = (int) ((4000000 + 4000000 * 0.3) * 12);
		int e3Total = (int) ((1000000 + 1000000 * 0.01) * 12);
		
		int totalAverage = (e1Total + e2Total + e3Total)/ 3; 
		
		System.out.println("김말똥의 연봉 : " + e1Total);
		System.out.println("홍길동의 연봉 : " + e2Total);
		System.out.println("강말순의 연봉 : " + e3Total);
		
		System.out.println("===========================================================================");
		
		// 3명 직원의 연봉 평균을 구하여 출력
		System.out.println("직원들의 연봉 평균 : " + totalAverage);
		
		

	}

}

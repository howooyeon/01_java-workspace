package com.hw1.run;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee());
		emp.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"));
		emp.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"));
		
		System.out.println(emp.get(0).information());
		System.out.println(emp.get(1).information());
		
		System.out.println("========================================================");
		
		emp.get(0).setEmpNo(0);
		emp.get(0).setEmpName("김말똥");
		emp.get(0).setDept("영업부");
		emp.get(0).setJob("팀장");
		emp.get(0).setAge(30);
		emp.get(0).setGender('M');
		emp.get(0).setSalary(3000000);
		emp.get(0).setBonusPoint(0.2);
		emp.get(0).setPhone("01055559999");
		emp.get(0).setAddress("전라도 광주");
		
		emp.get(1).setDept("기획부");
		emp.get(1).setJob("부장");
		emp.get(1).setSalary(4000000);
		emp.get(1).setBonusPoint(0.3);
		
		for(Employee e : emp) {
			System.out.println(e.information());
		}
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
		System.out.println("========================================================");
		
		for(Employee e : emp) {
			e.setSalary((int) (e.getSalary() + ((e.getSalary() * e.getBonusPoint()))) * 12);
			System.out.println(e.getEmpName() + "의 연봉 : " + e.getSalary() + "원");		
		}
		
		int total = 0;
		for(Employee e : emp) {
			total += e.getSalary();
		}
		System.out.println("직원들의 평균 연봉 : " + (total/ 3) + "원");	
		
	}

}

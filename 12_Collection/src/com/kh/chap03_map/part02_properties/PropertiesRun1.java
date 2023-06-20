package com.kh.chap03_map.part02_properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
	
	// Properties : Map 계열의 컬렉션 => 키 + 벨류 세트로 저장
	// HashMap과의 차이점 : Properties에는 key값도 String, value도 String으로 담음!!

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
//		prop.put("다이제", new Snack("초코맛", 1500));
//		prop.put("새우깡", new Snack("짠맛", 500));
//		
//		System.out.println(prop);
//		
//		System.out.println(prop.get("다이제")); // get메소드 이용 가능!!
//		
//		// 하지만 properties 사용하는 경우 주로 properties에 담긴 것들을 파일로 출력 또는 입력 받아 올 때 사용함!
//		// 즉, Properties에서 제공하는 store(), load() 매소드를 사용하기 위해서
//		
//		try {
//			prop.store(new FileOutputStream("test.properties"), "Properties Test");
//			//ClassCastException
//			// 내부적으로 store 실행시 properties에 담겨있는 키 + 벨류 세트로 String 형변환해서
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 파일 입출력 하고 싶으면 다른 메소드를 사용해야됨!!
		
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서 유지 안 됨, key값 중복시 덮어씌워짐
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		
		System.out.println(prop.getProperty("새우깡")); // 존재하지 않는 키값 제시하면 null 반환
		
		try {
			// 3. store(OutputStream os, String comments) : Properties에 담겨있는 key - value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "properties Test");
			
			// 4. storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// load()
		
		try {
			//prop.load(InputStream is);
			// prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			/*
			 * properties르 사용하는 경우
			 * 프로그램상에 필요한 기본 환경설정과 관련한 문구를 기술하는 경우
			 * => 모두 문자열이기 때문에 개발자가 아닌 일반 관리자가 해당 문서를 파악해서 수정하기 쉽다
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
	}

}

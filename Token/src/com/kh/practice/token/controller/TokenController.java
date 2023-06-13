package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	// 띄어쓰기 없앤 문자열
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		for (int i = 0; i < stn.countTokens();) {
			System.out.print(stn.nextToken());
		}
		System.out.println();
		StringTokenizer stn1 = new StringTokenizer(str, " ");
		System.out.println("토큰 처리 후 개수 : " + stn1.countTokens());
		System.out.print("모두 대문자로 변환 : ");
		for (int i = 0; i < stn.countTokens();) {
			System.out.print(stn.nextToken().toUpperCase());
		}
		return str.replace(" ", "");

	}

	// 첫글자만 대문자
	public String firstCap(String input) {

		return input.substring(0, 0).toUpperCase() + input.substring(1);
	}

	// 문자 몇갠지 반환
	int count = 0;

	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}

}

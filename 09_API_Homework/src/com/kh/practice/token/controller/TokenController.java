package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");

		int count = stn.countTokens();

		String str1 = "";
		for (int i = 0; i < count; i++) {
			str1 += stn.nextToken();
		}
		return str1;
	}

	// 첫글자만 대문자
	public String firstCap(String input) {

		  String upper = input.substring(0, 1).toUpperCase();
	      String lower = input.substring(1).toLowerCase();
	      return upper + lower;

	}

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

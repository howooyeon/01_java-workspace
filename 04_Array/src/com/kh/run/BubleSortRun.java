package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {
		int[] arr = { 22, 99, 30, 68, 87, 1, 13 };
		// 임시 변수 => temp
		
		int temp = 0;
		for(int i = 0; i < arr.length; i++) { // 전체 사이클
			for(int j = 1; j < arr.length; i++) { // 안쪽 사이클
				if(arr[j-1]> arr[j]) { // 앞에 숫자가 뒤에 숫자보다 큰 경우
					temp = arr[j-1]; // temp 앞에 있는 숫자 보관
					arr[j-1] = arr[j]; // 더 작은 숫자를 앞자리에 넣기
					arr[j] = temp; // temp에 보관한 숫자를 뒷자리에 넣기
					
				}
				
			}
		}
		
	}

}

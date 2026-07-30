package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_02 {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("전체 객체 :" +list);
		
		//합계
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int data = list.get(i);
			sum += data;            // 누적 합계 계산
		}
		
		System.out.println("합계 : " + sum);
		
		int a= 10;
		Integer aa= a; //박싱
		
		int b = aa; //언박싱
	}

}

package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_01 {
	public static void main(String[] args) {
		List aList = new ArrayList();
		//비어있는지 여부 확인
		if(aList.isEmpty()) {
			System.out.println("List는 비어있음");
		}
		if(aList.size()==0) {
			System.out.println("List는 비어있음");
		}
		
		//객체추가
		boolean bool = aList.add(1234);
		if(bool)
			System.out.println("성공");
		else
			System.out.println("성공");
		
		aList.add("java");
		aList.add(3.14);
		aList.add(false);
		aList.add('A');
		
		//객체수
		int cnt = aList.size();
		System.out.println("List에 저장된 객체 수 : " + cnt);
		
		//저장된 객체 확인 (꺼내오는 것이 아님)
		System.out.println("List 객체 확인 : " + aList);
		
		//객체 꺼내오기
		System.out.println("0번 위치 객체 : " + aList.get(0));
		
		//전체 객체 꺼내기 : 기본 for
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
		}		
		//전체 객체 꺼내기 : 확장 for
		for(Object x : aList) {
			System.out.println(x);
		}
		
		
	}

}

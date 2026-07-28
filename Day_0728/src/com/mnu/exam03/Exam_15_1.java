package com.mnu.exam03;

public class Exam_15_1 {
	public static void main(String[] args) {
		String str = "990405-1418293";//주민번호
		//0123456789
		//문자열 길이
		int len = str.length();
		System.out.println("문자열 길이 = " + len);
		
		//나이 계산
		int year = Integer.parseInt(str.substring(0,2)) + 1900;
		int age = 2026-year;
		System.out.println("나이 = " + age);
		
		//성별 체크
		int index = str.indexOf("-");
		
		String g2 = str.substring(index+1,index+2);
		String gender2="여자";
		if(g2.equals("1")) {
			gender2 = "남자";
			
		}
		System.out.println("성별 2 =" + gender2);
	}
	
}

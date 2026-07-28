package com.mnu.exam03;
//문자 추출
public class Exam_14 {
	public static void main(String[] args) {
		String str="자바 프로그래밍";
		char ch = str.charAt(4);
		
		System.out.println(ch);
		
		for(int x=0; x<str.length(); x++) {
			char c = str.charAt(x);
			System.out.println(c);
		}
	}

}

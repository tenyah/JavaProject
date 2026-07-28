package com.mnu.exam03;

public class Exam_14_7 {
	public static void main(String[] args) {
		//알파벳 소, 대문자 변경 (toLowerCase(),toUpperCase())
		String str = "Java Programming";
		String str2 = str.toLowerCase();//전부 소문자로 변경
		String str3 = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		//문자열 앞뒤 공백 잘라내기
		String str4 = "     Java Programming      ";
		String str5 = str.trim();
		System.out.println(str4);
		System.out.println(str5);
		
	}

}

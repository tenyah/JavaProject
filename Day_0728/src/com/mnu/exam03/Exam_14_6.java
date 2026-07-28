package com.mnu.exam03;

import java.lang.Character.Subset;

public class Exam_14_6 {
	public static void main(String[] args) {
		//문자열 길이 (.length())
		String str = "자바 프로그래밍";
		
		int cnt = str.length(); //8
		System.out.println(cnt);
		
		//문자열 대치(replace())
		String str2 = "";
		str2=str.replace("자바","파이썬");
		System.out.println(str2);
		
		//문자열 분리(split())
		String str3 = "1,aaaa,90,80,90";
		String hak[] = str3.split(",");
		System.out.println(hak[0]);
		
		//문자열 잘라내기(substring())
		String str4 = "동해물과 백두산이 마르고 닳도록";
		String cut = str4.substring(6);
		System.out.println(cut);
		
		String cut2 = str4.substring(6,10);
		System.out.println(cut2);

	}

}

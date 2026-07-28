package com.mnu.exam03;
//문자,문자열 위치 찾기(indexOf())
public class Exam_14_4 {
	public static void main(String[] args) {
		String str="Java&jsp programming 프로그래밍";
		str.indexOf('a');//1
		str.indexOf("프");//21
		str.indexOf('a',2); //2번부터 a탐색
		
		String str2="abcabc";
		str2.lastIndexOf("c"); //문자열의 마지막 c는 5
		str2.lastIndexOf("c",2); //2
		
		System.out.println(str2.lastIndexOf("c"));
		System.out.println(str2.lastIndexOf("c",2));
	}

}

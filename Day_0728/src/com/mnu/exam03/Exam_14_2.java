package com.mnu.exam03;
//지정된 문자열 포함유무
public class Exam_14_2 {

	public static void main(String[] args) {
		String str = "Hello 자바 World 자바 프로그래밍";
		
		boolean bool = str.contains("자바");
		boolean vool = str.contains("사랑");
		System.out.println(bool); //true
		System.out.println(vool); //false
	}

}

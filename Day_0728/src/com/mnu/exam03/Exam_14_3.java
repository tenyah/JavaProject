package com.mnu.exam03;
//String format() = printf
public class Exam_14_3 {
	public static void main(String[] args) {
		String str = String.format("%,d 더하기 %d는 %d입니다", 123456,1000,123456+1000);
		//세자리마다(,) 123,456
		
		String str2 = String.format("%d 더하기 %d는 %d입니다",3,5,3+5 );
		
		String str3 = String.format("%7.2f",3.12567 );//전체 7자리 소수이하 2자리 반올림
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
	}

}

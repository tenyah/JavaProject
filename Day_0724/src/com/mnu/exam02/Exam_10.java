package com.mnu.exam02;

public class Exam_10 {
	public static void main(String[] args) {
		int kor=71,eng=98,mat=87;
		int sum = kor+eng+mat;
		//switch case 정수 문자 문자열만 가능
		switch(sum/30) {
		case 10:
		case 9: System.out.print("A");
		case 8: System.out.print("B");
		case 7: System.out.print("C");
		default: System.out.print("D");
		}
		//break가 없어서 BCD출력 
	}

}

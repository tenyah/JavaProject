package com.mnu.exam01;
public class Exam_04 {
	public static void main(String[] args) {
		int a=1, b=2, c=3;
		int m=(a>b)?a:b;//m=2
		m=(m<c)?c:m;//m=3
		//m=(m>c)?m:c;//m=3
		System.out.println("m=" + m); //m=3
	}

}

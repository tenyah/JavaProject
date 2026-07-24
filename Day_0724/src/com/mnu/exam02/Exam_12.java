package com.mnu.exam02;

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) throws Exception {
		//입력값이 'c'인경우
		
		System.out.print("문자 입력:");
		char ch = (char)System.in.read();
		//System.in.read(); 1문자를 입력받아서 정수로변환
		switch(ch) {
			case 'a':
				System.out.print("one");
			case 'b':
				System.out.print("two");
			case 'c':	
				System.out.print("three");
				break;
			case 'd':
				System.out.print("four");
				break;
		}

	}

}

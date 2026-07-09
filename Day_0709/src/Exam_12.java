//키보드로 실수를 입력된 값이 85 ~ 95 사이면 "Pass"
//아니면 "No"로 출력하는 프로그램 작성

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력하시오: ");
		double score = scn.nextDouble();
		String str = (score>=85 && score<=95) ? "pass" : "no";
		System.out.println(score+"은" + str + "입니다");
	}
			
	}


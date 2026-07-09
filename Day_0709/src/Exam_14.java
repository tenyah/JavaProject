//키보드로 정수를 입력 입력된 정수가 80 이상 "합격" 아니면 "불합격"

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
	      System.out.println("값을 입력하시오: ");
	      int score = scn.nextInt();
	      String str="";
	         if(80<=score) {
	        	 str="합격";
	        	 }
	         else {
	        	 str="불합격";
	        	 }
	         System.out.println(str);
	         
	   }
	         
	   }
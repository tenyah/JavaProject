import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int a = scn.nextInt(); //입력받은 값
		int b = a%16;
		
		if(a<0 || a>15) {
			System.out.print("입력오류");
			System.exit(1);		
		}
		if(b<10) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + a);
		}else if(b>9 && b<=10) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "A");
		}else if(b>10 && b<=11) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "B");
		}else if(b>11 && b<=12) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "C");
		}else if(b>12 && b<=13) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "C");
		}else if(b>13 && b<=14) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "D");
		}else if(b>14 && b<=15) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "E");
		}else if(b>15 && b<=16) {
			System.out.print("10진수: " + a + "\n" 
		+ "16진수: " + "F");
		}
			

	}

}

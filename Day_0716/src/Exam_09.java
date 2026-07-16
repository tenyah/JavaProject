//키보드로 정수 연산자를 정수로 입력하면 사칙연산을 하는 프로그램

import java.util.Scanner;

public class Exam_09 {
	static void add(int a, int b) {
		System.out.print(a+ "+" + b + "=" + (a+b));
	}
	static void sub(int k1, int k2) {
		int r = k1 - k2;
		System.out.printf("%d - %d = %d\n", k1,k2,r);
	}
	static void mul(int t1, int t2) {
		int t = t1 * t2;
		System.out.printf("%d * %d = %d\n", t1,t2,t);	
	}
	static void div(int d1, int d2) {
		int d = d1 / d2;
		System.out.printf("%d / %d = %d\n", d1,d2,d);
	}
	static void mod(int f1, int f2) {
		int f = f1 % f2;
		System.out.printf("%d %% %d = %d\n", f1,f2,f);
	}
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력: " );
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+"))
			add(a,b);
		else if(op.equals("-"))
			sub(a,b);
		else if(op.equals("*"))
			mul(a,b);
		else if(op.equals("/"))
			div(a,b);
		else if(op.equals("%"))
			mod(a,b);
		else
			System.out.println("연산자 오류");
	}

}

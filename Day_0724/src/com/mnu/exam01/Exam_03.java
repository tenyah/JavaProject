package com.mnu.exam01;

public class Exam_03 {
	public static void main(String[] args) {
	int a=3,b=4,c=2;
	boolean r1,r2,r3;
	
	r1 = b<4 || c==2;
//		  f   or  t   = t
	r2 = a>0 && b<5;
	//    T  and  T    =t	
	r3 =!r1; //F
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	
	System.out.println(r1+","+r2+","+r3);//결과: true,true,false
	
	
	}

}

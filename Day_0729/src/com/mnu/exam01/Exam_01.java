package com.mnu.exam01;
class AA{
	int bun = 10;
	String name = "홍길동";
	
	@Override
	public String toString() {
		return bun + "," + name;
	}
	
}
//==(주소(값))을 비교 equals() 같은 객체인지를 비교
public class Exam_01 {
	public static void main(String[] args) {
		String str = new String("AAAAA");
		AA a = new AA();
		
		System.out.println("str =" + str);
		System.out.println("a =" + a);

	}
}

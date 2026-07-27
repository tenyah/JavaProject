package com.mnu.exam01;
class Parent{
	void show() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	//오버라이딩
	void show() {
		System.out.println("Child");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Parent pa1 = new Parent();
		pa1.show();
		
		Parent pa = new Child(); //조상 클래스는 자식개체를 생성 가능
		pa.show();
	}

}

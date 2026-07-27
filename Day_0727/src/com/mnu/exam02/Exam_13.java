package com.mnu.exam02;
abstract class BB{
	abstract int a(int a, int b);
	
	abstract void b(int a);
	
}
class SubBB extends BB{
	@Override
	int a(int a, int b) {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	void b(int a) {
		// TODO Auto-generated method stub
		
	}
}


public class Exam_13 {

	public static void main(String[] args) {
		BB b =new SubBB();
		int s = b.a(10,20);
		System.out.println("s=" + s);
		b.b(100);
	}

}

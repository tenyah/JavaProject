package com.mnu.exam01;

public class Exam_02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.capacity());//sb의 버퍼 크기 반환 4+16 = 20
		System.out.println(sb);
		sb.append("program");//문자열 추가
		System.out.println(sb);//Javaprogram
		System.out.println(sb.charAt(0)); // 0번의 문자를 반환
		sb.delete(0, 4); //0부터 4 전까지 삭제
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(0,"Java P");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		sb.replace(0, 3, "AAA");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}

package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;

//학생 객체를 생성
//스택에 저장 후 출력
public class Exam_10 {
	public static void main(String[] args) {
		
		
		Deque<Student> student = new ArrayDeque<Student>();
		
		
		student.push(new Student(1,"김학생",100,90,80));
		student.push(new Student(2,"강학생",70,50,80));
		student.push(new Student(3,"이학생",80,75,90));
		student.push(new Student(4,"박학생",75,90,86));
		student.push(new Student(5,"최학생",100,98,90));
		
		
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(!student.isEmpty()) {
			Student st = student.pop();
			
			int tot = st.getKor()+st.getEng()+st.getMat();
			double ave = (double)tot/3.;
			
			System.out.print(st.getBun()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMat()+"\t");
			System.out.print(tot + "\t");
			System.out.printf("%.2f",ave);
			System.out.print("\n");
			
			
			
		}
		
		
		
		//출력
		//번호   이름   국어   영어   수학   총점   평균

	}

}

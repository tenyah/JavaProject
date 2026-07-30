package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 키보드로 학생정보를 입력 학생 객체를 생성 List에 저장 후
 *  총점, 평균, 학점을 구여 출력
 *  [입력형식]
 *  학생정보 입력 : 1101 이학생 90 80 90
 *  
 *  [출력형식]
 *  번호    이름   국어   영어   수학   총점   평균   학점
 * 
 * [처리조건]
 * 3명만 입력, 동일한 번호가 있는 경우 "이미 등록된 학생입니다" 출력 후 재입력
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<Student> hak = new ArrayList<Student>();
		Student stu = null;
		
		while(hak.size()<3) {
			stu = new Student();
			System.out.print("학생정보 입력 : ");
			//키보드로 입력받아서 바로 변수에 저장
			stu.setBun(scn.nextInt());
			stu.setName(scn.next());
			stu.setKor(scn.nextInt());
			stu.setEng(scn.nextInt());
			stu.setMat(scn.nextInt());
			
			boolean bool = false;
			for(int i=0; i<hak.size(); i++) {
				if(stu.getBun()==hak.get(i).getBun()) {
					bool = true;
					break;
				}
			}
			if(bool) {
				System.out.println(stu.getBun() + "은 이미 등록된 학번입니다");
				continue;
			}				
			hak.add(stu);	
		}
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			
			//출력
			for(Student s : hak) {
				int tot = (s.getKor()+s.getEng()+s.getMat());
				double ave = tot/3.;
				
				System.out.print(s.getBun() + "\t" );
				System.out.print(s.getName()+ "\t" );
				System.out.print(s.getKor()+ "\t" );
				System.out.print(s.getEng()+ "\t" );
				System.out.print(s.getMat()+ "\t" );
				System.out.print(tot + "\t" );
				System.out.printf("%2f.",ave );
				System.out.print("\t");
				String grade = ""; //학점 계산
				System.out.print(grade +"\n" );
		}

	}

}

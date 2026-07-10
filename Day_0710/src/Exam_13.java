/*키보드로 이름 국어 영어 수학 입력 총점 평균 등을 구하여 출력
 * 등급은 100~90 구, 89~80 우, 79~70 미, 69~60 양, 59~0 가
 * [입력형식]
 * 입력: 이학생 90 77 85 
 * 
 * [출력형식]
 * 이름 : 이학생 
 * 총점 : xx
 * 평균 : xx.xx
 * 등급 : x
 * 
 *  switch case 만 사용
 */

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int tot = (kor+eng+mat);
		double ave =(int)(tot /3.*100+0.5)/100.;
		String grade ="가";
		
		int menu = (int)ave/10;
		switch(menu) {
			case 10:
			case 9:
				grade = "수";
				break;
			case 8:
				grade="우";
				break;
			case 7:
				grade="미";
				break;
			case 6:
				grade = "가";
				break;
				
		}
		
		
		System.out.println("이름 :" + name + "\n" + "총점 :" + tot + 
				"\n" + "평균 :" + String.format("%.2f", ave) 
				+ "\n" + "등급 :" + grade);			
	}
}

//키보드 이름, 국어, 영어, 수학, 과학 점수를 입력 총점, 평균을 구하여
// 최대 점수, 최소 점수를 출력
/* 입력 : 홍길동 90 80 70 60
 * 
 * 출력
 * 이름:
 * 총점:
 * 평균:
 * 최대점수:
 * 최소점수:
 */

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sci = scn.nextInt();
		
		int tot = kor + eng + mat + sci;
		double ave =(int)(tot /4.*100+0.5)/100.;
		
		int max = kor;
		int min = kor;
		
		if(max < eng) {
			max=eng;
		}else if(min > eng) {
			max=eng;
		}
		if(max < mat) {
			max=mat;
		}else if(min > mat) {
			max=mat;
		}
		if(max < sci) {
			max=sci;
		}else if(min > sci) {
			max=sci;
		}
		if(max < kor) {
			max=kor;
		}else if(min > kor) {
			max=kor;
		}
			
	}
	

}

//키보드로 학번, 이름, 국어, 영어, 수학 입력
/* 학생 개체(Student) 생성 후 출력
 * 
 */
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		//키보드 입력(학생 객체 생성)
		Scanner scn = new Scanner(System.in);
		
		System.out.print("학번 : ");
		int hak = scn.nextInt();
		System.out.print("이름 : ");
		String name = scn.next();
		System.out.print("국어 : ");
		int kor = scn.nextInt(); 
		System.out.print("영어 : ");
		int eng = scn.nextInt();
		System.out.print("수학 : ");
		int mat = scn.nextInt();
		
		//기본 생성자
		Student st1 = new Student();
		st1.hakbun=hak;
		st1.name = name; 
		st1.kor = kor;
		st1.eng = eng;
		st1.mat = mat;
		
		st1.cal();
		
		//초기화 생성자
		Student st2 = new Student(hak,name,kor,eng,mat);
		//총점,평균을 구하여 다음과 같이 출력
		//학번   이름   국어   영어   수학   총점   평균
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(st1.hakbun + "\t");
		System.out.print(st1.name + "\t");
		System.out.print(st1.kor + "\t");
		System.out.print(st1.eng + "\t");
		System.out.print(st1.mat + "\t");
		System.out.print(st1.tot + "\t");
		System.out.print(st1.ave + "\n");

		
		//학점을 구하여 출력(A,B,C,D,F)
		//학번   이름   국어   영어   수학   총점   평균   학점
		System.out.println(st1.getGrade());

}

}

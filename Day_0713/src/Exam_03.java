import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("성적 입력: ");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int tot = kor+eng+mat;
		double ave = tot/3.;
		
		String con = ""; //합,불
		String reason =""; //사유
		if(kor>=60 && mat>=60 && eng>=60 && ave>=80) {
			con = "합격";
			reason = "";
		}else if(kor<40 || eng<40 || mat<40) {
			con = "불합격";
			reason = "사유: 과락";
		}else if(kor>=40 && eng>=40 && mat>=40 && ave<60) {
			con ="불합격";
			reason = "사유: 평균 미만";
		}
		System.out.println("이름: " + name);
		System.out.println("총점: " +tot);
		System.out.println("평균: " +ave);
		System.out.println("판정: " +con);
		System.out.println(reason);
	}

}

//if(result.equals("불합격"){
//      System.out.println("사유: " + reason);

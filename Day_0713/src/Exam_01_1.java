//피드백 버전 (if)
import java.util.Scanner;

public class Exam_01_1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 입력: ");
		int dec = scn.nextInt(); //입력받은 값
		if(dec<1 || dec>15) {
			System.out.println("입력오류");
			System.exit(0);
		}
		//정상입력일 경우
		int mok = dec/16; //몫
		int na = dec%16;  //나머지
		
		String con = "";
		if(na==10) {
			con = "A";
		}else if(na==11) {
			con = "B";
		}else if(na==12) {
			con = "C";
		}else if(na==13) {
			con = "D";
		}else if(na==14) {
			con = "E";
		}else if(na==15) {
			con = "F";
		}else {
			con = na+"";//con은 문자 na는 정수라서 오류발생 +""로
		}	            //문자로 만듬
			            //반대로 할 경우 
			            //int aa = Integer.parseInt("1")
		System.out.println("10진수: " + na);
		System.out.println("16진수: " + con);
		}
		
}



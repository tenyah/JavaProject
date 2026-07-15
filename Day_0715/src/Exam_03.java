//2,8,16 진수 변환 -> 배열 사용
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		//나머지 값을 모두 저장
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','A'
				,'B','C','D','E','F'};
		
		while(true) {
			System.out.print("10 진수 : ");
			int dec = scn.nextInt(); // 입력한 10진수
			if(dec==0) {
				System.out.print("프로그램을 종료합니다");
				break;
			}
			System.out.print("변환(2,8,16) :");
			int con = scn.nextInt(); //변환할 진법
			//진법교환
			String str = ""; //변환된 값
			int imsi = dec; //dec값을 보존하기 위함
			while(imsi != 0) {
				int mok = imsi / con;
				int na = imsi % con;
				str = ch[na] + str;
				imsi = mok;	
				//imsi = imsi/con; 23줄 삭제
				
			}
														
			//출력
			System.out.println("10 진수 :" + dec);
			System.out.println( con + "진수 :" + str);
		
		}
		
		
				

	}

}

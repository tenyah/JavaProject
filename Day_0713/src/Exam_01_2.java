//switch
import java.util.Scanner;

public class Exam_01_2 {
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
		
		String con="";
		switch(na) {
		case 10:
			con="A";
			break;
		case 11:
			con="B";
			break;
		case 12:
			con="C";
			break;
		case 13:
			con="D";
			break;
		case 14:
			con="E";
			break;
		case 15:
			con="F";
			break;
		default:    //case에 해당되는게 없을 때. 위에서 0이하 16이상은 거름
			con = na +"";
			
			
		}
	}
}


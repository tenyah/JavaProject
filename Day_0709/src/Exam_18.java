import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력");
		int val = scn.nextInt();
		
		String str="";
		if(val>=80) {
			if(val<=90) {
				//System.out.println("80~90 Pass");
				str= "80~90 Pass";
			}else {
				//System.out.println(80 이상 90 초과 No")
				str="80 미만 NO";
			      }
			System.out.println(val + "점수의 결과는" + str);
			
				
			        }
		}	
	}


import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int pay = scn.nextInt();
		int money = 50000;		
		System.out.printf("급여 : %10d\n", pay);
		boolean flag = true;
		
		while(pay!=0) {
			System.out.printf("%5d : ", money);
			int mok = pay / money;
			System.out.printf("%3d : ", mok);
			pay = pay % money;
			
			if(flag) {
				money = money/5;
				flag=false;
			}else {
				money = money/2;
				flag=true;
			}			
		}				
	}
}



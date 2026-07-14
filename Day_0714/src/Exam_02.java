import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int pay = scn.nextInt();
		int money = 50000;
		
		System.out.printf("급여 : %10d\n", pay);
		for(int i=1; i<=10; i++) {
			System.out.printf("%10d : ", money );	
			int mok = pay/money;  //장 수
			System.out.printf("%3d\n", mok);
			pay%=money; //나머지								
			if(i%2==1) {
				money /= 5; //money = money/5
				}else {
				money /= 2; //money = money/2
				}
			    if(pay==0)
			    	break;
		}
	}

}



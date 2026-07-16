import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int count[] = new int[6];
		while(true) {
			int a = scn.nextInt();
			if(a == -99)
				break;
			
			int index=5;
			if(a>=90)
				index=0;
			else if(a>=80)
				index=1;
			else if(a>=70)
				index=2;
			else if(a>=60)
			    index=3;
		    else if(a>=50)
			    index=4;
			
			count[index]++;
			    			    
		}
	/*	System.out.println("100 ~ 90 : " + count[0]);
		System.out.println("89 ~ 80 : " + count[1]);
		System.out.println("79 ~ 70 : " + count[2]);
		System.out.println("69 ~ 60 : " + count[3]);
		System.out.println("59 ~ 50 : " + count[4]);
		System.out.println("49 ~ 0  : " + count[5]);
 	*/
		String[] str = {"100 ~ 90","89 ~ 80","89 ~ 80",
				"79 ~ 70","69 ~ 60","59 ~ 50","49 ~ 0"};
			for(int i=0; i<count.length; i++) {
				System.out.println(str[i] + ": " + count[i]);
		}						
	}
}

import java.util.Scanner;

public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scn.nextInt();
		int sum = score;
		int max = score;
		int min = score;
		
		int cnt=1; //데이터 수 카운트
		while(cnt<7) {
			score = scn.nextInt();
			if(max<score)
				max = score;
			else if(min>score)
				min = score;
			
			sum += score;
			cnt++;
		}
		//출력
		System.out.println("최대 :" + max);
		System.out.println("최소 :" + min);
		System.out.println("합계(합계-최대=-최소) :" + (sum-max-min));
		
		
		
	}

}

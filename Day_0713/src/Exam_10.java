//소수 판별 : 소수는 1과 자기 자신 외의 수로 나눠지지 않는 수
//4/2 나머지 0 - 자신, 3/2, 3/3 -> 0
import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력");
		
		int a = scn.nextInt();

		for(int x = 2; x<=a; x++) {
			if(a%x ==0) {
				if(x==a) {
					System.out.println(a+ "는 소수입니다");
					break;
				}else {
					System.out.print(a+"소수가 아닙니다");
					break;
				}
			}
		}

	}

}

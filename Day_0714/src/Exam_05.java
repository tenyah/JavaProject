
public class Exam_05 {
	public static void main(String[] args) {		

		int cnt = 0;
		for(int i=1; i<=5; i++) {
			//공백 출력
			for(int j=1; j<=6-i; j++) {
				System.out.printf("%3s"," ");		
			}
			for(int k=1; k<=i; k++) {
				cnt++;
				System.out.printf("%3d", cnt );
				
			}
			System.out.print("\n");
	    }

	}

}

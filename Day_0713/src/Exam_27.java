
public class Exam_27 {
	public static void main(String[] args) {
		
		int cnt = 0;
		for(int i=1; i<=5; i++) {
			//cnt++; //5번 반복
			for(int j=1; j<=5; j++) {
				cnt++;//25번 반복
				System.out.printf("%3d",cnt); 
				//두자리수와 한자리수 간격맞춤 우측정렬
			}
			System.out.print("\n");
		}

		cnt=0;
		for(int i=1; i<=5; i++) {
			//cnt++; //5번 반복
			for(int j=1; j<=i; j++) {
				cnt++;//25번 반복
				System.out.printf("%3d",cnt); 
				//두자리수와 한자리수 간격맞춤 우측정렬
			}
			System.out.print("\n");
		}
		
	}

}

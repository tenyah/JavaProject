import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65};
		int test[] = score.clone();
		int test2[] = score.clone();
		
		//선택정렬
		for(int i=0; i<test.length-1; i++) {
			for(int j=i+1; j<test.length; j++) {
				if(test[i]>test[j]) {
					int imsi = test[i];
					test[i] = test[j];
					test[j]= imsi;
				}
			}
		}
		//System.out.println("정렬 전 :" + Arrays.toString(score));
		//System.out.println("정렬 후 :" + Arrays.toString(test));
		
		System.out.print("정렬 전 : ");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		System.out.print("정렬 후 : ");
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.print("\n");
		

		
		//버블정렬
		for(int i=0; i<test2.length-1; i++) {
			for(int j=0; j<test2.length-i-1; j++) {
				if(test2[j]<test2[j+1]) {
					int imsi = test2[j];
					test2[j] = test2[j+1];
					test2[j+1]= imsi;
				}
			}
			
		}
		//System.out.println("정렬 전 :" + Arrays.toString(score));
		//System.out.println("정렬 후 :" + Arrays.toString(test2));
		System.out.print("정렬 전 : ");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		System.out.print("정렬 후 : ");
		for(int i=0; i<test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.print("\n");
		
	}

}

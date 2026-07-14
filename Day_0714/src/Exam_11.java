/*
 * 
 */
public class Exam_11 {
	public static void main(String[] args) {
		int score[] = {90,75,80,77,85,79,95,80,85,90,77};
		
		int sec = 0;
		int ave = 0;
		System.out.print("Data :");

		//확장 for()
		for(int a : score) {
			System.out.print( a + " ");		
			sec+=a;
			ave = sec/score.length;
		}
		System.out.print("\n");
		System.out.println("총점 :"+sec);
		System.out.println("평균 :"+(double)ave);

		
		//for()
		System.out.print("Data :");
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			System.out.printf( "%4d",score[i]);	
			sum+=score[i];
			
		}
		System.out.print("\n합계 : "+sum);
		System.out.print("\n평균 :"+(double)sum/score.length);
	}
}
/* N개의 배열이 저장된 데이터를 출력,
 * 마지막에 평균을 구하여 출력하고 평균 이상 데이터 및 데이터 수 출력
 * 평균 : 83.0
 * 평균 이상 :
 * 평균 이상 데이터 :
 * 
 */
public class Exam_12 {
	public static void main(String[] args) {
				
		int score[] = {90,75,80,77,85,79,95,80,85,90,77};
		int sec = 0;
		double ave = 0;
		System.out.print("Data : ");	
		for(int a : score) {
			System.out.print( a + " ");		
			sec+=a;
			ave =(double)sec/score.length;
		}
		System.out.printf("\n평균 : %4.1f",ave);	
		System.out.print("\n평균 이상 :");	
		int over = 0;
		for(int i=0; i<score.length; i++) {			
			if(score[i]>ave) {
				System.out.printf("%3d", score[i]);
				over++;
			}
		}
		System.out.printf("\n평균이상 건 수 : %d", over);
		
	}
}

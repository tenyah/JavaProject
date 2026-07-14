/* Data : 90,75,80,77,85,79,95,80,85,90,77
 * 평균 : 83.0
 * 평균에 가장 가까운 값 : 85
 */
public class Exam_14 {
	public static void main(String[] args) {
		
		int score[] = {90,75,80,77,85,79,95,80,85,90,77};
		System.out.print("Data : ");
		int sum =0;
		for(int a : score) {
			System.out.print(a + " ");
			sum += a;												
		}
		double ave =(double)sum/score.length;
		System.out.print("\n");
		System.out.print("평균 :" + ave);
		System.out.print("\n");
		
		
		//평균에 가장 가까운 값 (절댓값의 최솟값)
		/*int min =0; //간격
			if(score[0]>ave)
				min = score[0] - (int)ave;
			else
				min = (int)ave-score[0];
		int minValue = score[0]; //실제 데이터
		  */
		
		int min = (score[0]>ave) ? score[0]-(int)ave : (int)ave-score[0];
		int minValue = score[0]; //실제 데이터
		
		for(int i=1; i<score.length; i++) {
			int imsi = (score[i]>ave) ? score[i]-(int)ave : (int)ave-score[i];
			
			if(min > imsi) {
				min=imsi;
				minValue=score[i];
				
			}
		}
		System.out.print("평균에 가장 가까운 값 :" + minValue);
	}
}
/* Data : 90,75,80,77,85,79,95,80,85,90,77
 * 최댓값 :
 * 최소값 :
 * 합계 : (전체합-최대-최소)
 *
 */
public class Exam_13 {
	public static void main(String[] args) {
		
		int score[] = {90,75,80,77,85,79,95,80,85,90,77};
		System.out.print("Data : ");
		for(int s : score) {
			System.out.printf("%4d" , s);
		}
		System.out.print("\n");
		//최대,최소,전체합
		
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) 
				max=score[i];
			if(score[i]<min) 
				min=score[i];
			sum += score[i];
			
		}
		//출력
		System.out.print("최대값 : " + max + "\n");
		System.out.print("최소값 : " + min + "\n");
		System.out.print("합계 : " + (sum-max-min) );
			
			
	}
}



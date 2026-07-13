// 1~10까지 홀수합, 짝수합( 증가는 1씩)
public class Exam_06 {
	public static void main(String[] args) {
		
		//1~10 출력 후 홀수합, 짝수합
		int s=0;//홀수합
		int t=0;//짝수합
		int tot = 0;//전체합
		for(int i=1; i<11; i++) {
			System.out.println(i);
			if(i%2 == 1) {
				s += i;
	     	}else {
	     		t += i;
	     	}
			tot += i;
		System.out.println("1~10 홀수 합 : " + s);
		System.out.println("1~10 짝수 합 : " + t);
		
		
		}

	}

}

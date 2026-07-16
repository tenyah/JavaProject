//가변인자를 이용하여 n개의 자료중에서 최대값을 구하여 반환하는 메소드
public class Exam_12 {
	static int maximum(int ...a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i])
				max = a[i];
				
		}
		return max;
	}
		
		
	
	
	public static void main(String[] args) {
		int max=maximum(1,2);
		System.out.println("max = " + max);
		
		System.out.println("max =" + maximum(4,2,6,9,3,5,6));
		
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.println("max =" + maximum(a));
		//System.out.println("max =" + maximum(new int[] = {5,3,9,2,11,34,23}));
		
	}

}

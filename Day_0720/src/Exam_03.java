
public class Exam_03 {
	//합계 출력 메소드
	//Data : 30+67+55+79+97+65+33+78+96+58+94+32=784
	static void dataTotal(int arr[]) {
		int tot = 0;
		System.out.print("Data : ");
		for(int i=0; i<arr.length; i++) {
			tot += arr[i];
			System.out.print(arr[i]);
			if(i==arr.length-1) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(tot);
		System.out.print("\n");
	}
	//평균이상 점수를 구하여 출력하는 메소드
	//Data : 30 67 55 79 97 65 33 78 96 58 94 32
	//평균(65.33)이상 : 67 79 78 96 94
	static void dataAveragre(int arr[]) {
		int tot = 0;
		System.out.print("Data : ");
		for(int i=0; i<arr.length; i++) {
			tot += arr[i];
			System.out.printf("%4d",arr[i]);
		}
		System.out.print("\n");
		double ave = (double)tot/arr.length;
		System.out.printf("평균(%.2f) 이상 : ", ave);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=ave) {				
				System.out.printf("%3d",arr[i]);
			}
		}
		System.out.print("\n");
	}
	
	//오름차순 정렬 메소드
	//Data : 30 67 55 79 97 65 33 78 96 58 94 32
	//Sort : 
	
	static void dataSort(int arr[]) {
		int temp[] = arr.clone();
		for(int i=0; i<temp.length-1; i++) {
			for(int j=i+1; j<temp.length; j++) {
				if(temp[i]>temp[j]) {
					int imsi =0;
					imsi = temp[i];
					temp[i]=temp[j];
					temp[j]=imsi;									
				}
			}
		}
		System.out.print("\n");
		System.out.print("Data : ");
	    for(int i = 0; i < arr.length; i++) {
	        System.out.printf("%d ", arr[i]);
	    }
	    System.out.print("\n");
		System.out.print("Sort : ");
	    for(int i = 0; i < temp.length; i++) {
	        System.out.printf("%d ", temp[i]);
	    }
	    System.out.print("\n");
		
		
		
	}
	//최댓값 출력 메소드
	
	
	static int dataMax(int arr[]) {
		int max = arr[0];
		System.out.print("Data : ");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%4d",arr[i]);
			if(max < arr[i])
				max=arr[i];
		}
		System.out.print("\n");
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {30, 67, 55, 79, 97, 65, 33, 78, 96, 58, 94, 32};
		
		dataTotal(data);
		dataAveragre(data);
			dataSort(data);
			int max = dataMax(data);
			System.out.println("최댓값 : " + max);
	
	}

	

}

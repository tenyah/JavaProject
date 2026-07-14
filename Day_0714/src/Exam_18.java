//데이터 정렬(오름차순, 내림차순)
/* 1.선택정렬법 : selection sort
 * 2.거품정렬 : bubble sort
 * 3.삽입정렬 : insertion sort
 * 4.힙정렬 : heap sort
 * 그 외 다수 1~3번 주로 씀
 */

import java.util.Arrays;

public class Exam_18 {
	public static void main(String[] args) {
		int arr[] = {7,5,9,8,3};
		int brr[] = arr.clone();
		
	
		//암기하면 좋음
		for(int i =0; i<brr.length-1; i++) {//기준
			for(int j = i+1; j<brr.length; j++) {
				if(brr[i]>brr[j]) { // (<) 내림차순
					int imsi = brr[i];
					brr[i] = brr[j];
					brr[j] = imsi;					
				}
			}
		}
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		System.out.println("정렬 후 : " + Arrays.toString(brr));
	}

}

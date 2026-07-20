public class Exam_01 {

	public static void main(String[] args) {		
		int a [][]  = new int[5][5];
		int cnt = 0;
		
		// 4x4 영역에만 값을 채우고 합계를 계산하는 반복문
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a[i].length-1; j++) {
				cnt++;
				a[i][j] = cnt;       // 현재 칸에 값 채우기
				a[i][4] += cnt;      // 행의 합 (마지막 열에 누적)
				a[4][j] += cnt;      // 열의 합 (마지막 행에 누적)
				a[4][4] += cnt;      // 전체 총합 (마지막 칸에 누적)
			}
		}
		
		// 출력을 위해 5x5 전체를 도는 반복문
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.print("\n");
		}
	}
}
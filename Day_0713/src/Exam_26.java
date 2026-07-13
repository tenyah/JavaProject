
public class Exam_26 {
	public static void main(String[] args) {
		for(int x = 1; x <= 5; x++) {
			for(int k=1; k<=x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=(6-x)*2-1; y++) {
				System.out.print("*");
			}
			System.out.print("\n");	
		}
	}

}

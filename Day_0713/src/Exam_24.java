
public class Exam_24 {
	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			for(int k=1; k<=6-x; k++) {
				System.out.print(" ");
			}
			for(int y=1; y<=x; y++) {
				System.out.print("*");				
			}
			System.out.print("\n");
		}
		
	}

}

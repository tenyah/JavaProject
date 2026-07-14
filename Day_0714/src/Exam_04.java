
public class Exam_04 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int x=1; x<=(6-i)*2-1; x++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		
		
		
	}


  		
}
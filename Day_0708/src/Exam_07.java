import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력하시오");
		//String str1 = scanner.next();//문자열1 문자열2
		//String str2 = scanner.next();
		
		//System.out.print("2. 입력하시오");
		String str3 = scanner.nextLine();//문자열1 문자열2 엔터치기까지
		
		//System.out.println("str1 : " + str1);
		//System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
			//띄어쓰기 있어도 한번에 입력 받으려면 nextLine 사용 (공백 무시)
	}

}

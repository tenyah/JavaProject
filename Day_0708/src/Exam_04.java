//표준 입력 : System.in.read() 예외 발생 가능 ->throws Exception 예외처리 필수
//System(클래스).in(속성).read()(메소드=함수	)
public class Exam_04 {
	public static void main(String[] args) throws Exception {
		System.out.print("문자를 입력하세요?");
		System.out.println("입력된 글자는 " + (char)System.in.read());
		System.out.println("입력된 글자는 " + (char)System.in.read());
		System.out.println("입력된 글자는 " + (char)System.in.read());

	}

}

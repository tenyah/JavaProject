//로그인, 로그아웃
public class Exam_02 {
	public static void main(String[] args) {
		Member m2 = new Member("이사람","user","1234","010-1111-1111");
		
		//키보드 입력
		String id="user";
		String pass="4321";
		boolean bool = m2.memberLogin(id, pass);
		if(bool) {
			System.out.println("로그인 성공");
			//로그인 성공
		}else {
			System.out.println("아이디 또는 비밀번호 오류입니다");
			//아이디 또는 비밀번호 오류입니다
		}

		//로그인
		
		id="user";
		pass="1234";
		bool=m2.memberLogin(id, pass);
		if(bool) {
			System.out.println("로그인 성공");
			//로그인 성공
		}else {
			System.out.println("아이디 또는 비밀번호 오류입니다");
			//아이디 또는 비밀번호 오류입니다
		}
		if(bool) {
			String str = m2.memberLogout();
			System.out.println(str);
		}
	}
	
}

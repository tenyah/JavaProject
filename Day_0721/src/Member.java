public class Member {
	// 멤버변수
	String name;
	String id;
	String pass;
	String phone;
	
	public Member() {}
	
	public Member(String name, String id, String pass, String phone) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.phone = phone;
	}
	
	// 1. 회원가입 정보 검증
	boolean memberRegister() {
		if (name == null || id == null || pass == null || phone == null) {
			return false; // 누락된 정보가 있으면 실패
		} else {
			return true;  // 모든 정보가 있으면 성공
		}	
	}	
	
	// 2. 로그인 기능
	boolean memberLogin(String id, String pass) {
		// 가입되어 있지 않은(null) 상태면 로그인 불가
		if (this.id == null || this.pass == null) {
			return false;
		}
		
		// 저장된 id/pass와 입력받은 id/pass가 모두 같은지 비교
		if (this.id.equals(id) && this.pass.equals(pass)) {
			return true;  // 로그인 성공
		} else {
			return false; // 로그인 실패
		}
	}
	
	// 3. 로그아웃 기능
	String memberLogout() {
		this.name = null;
		this.id = null;
		this.pass = null;
		this.phone = null;
		return "로그아웃 되었습니다";
	}
}
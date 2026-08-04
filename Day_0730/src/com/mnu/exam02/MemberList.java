package com.mnu.exam02;

import java.util.List;

import com.mnu.model.MemberDAO;
import com.mnu.model.MemberDTO;

// 전체 회원정보 출력
public class MemberList {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list =dao.memberList();		
		//성별(M:남자 /F:여자)
		//등급(A:VIp,B:일반C:직원)
		System.out.println("회원번호\t회원성명\t전화\t\t성별\t등급\t도시명\t가입일자");
		if(!list.isEmpty()) {
				for(MemberDTO dto : list) {
					System.out.print(dto.getCustno()+ "\t");
					System.out.print(dto.getCustname()+ "\t");
					System.out.print(dto.getPhone()+ "\t");
					String gen = "남자";
					if(dto.getGender().equals("F")) {
						gen = "여자";
					}
					System.out.print(gen + "\t");
					
					String grd = "";
					if(dto.getGrade().equals("A")) {
						grd = "vip";
					}else if(dto.getGrade().equals("B")) {
						grd = "일반";
					}else if(dto.getGrade().equals("C")){
						grd = "직원";
					}
					System.out.print(grd + "\t");
					
					System.out.print(dto.getCityname()+ "\t");
					System.out.print(dto.getJoindate()+ "\t");
					System.out.print("\n");
				}
		}else {
			System.out.println("등록된 회원이 없음");
		}
		
		
	}

}

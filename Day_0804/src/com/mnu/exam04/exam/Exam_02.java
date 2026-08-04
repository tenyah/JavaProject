package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

public class Exam_02 {
	public static void main(String[] args) {
		//키보드 입력(부서번호)
		Scanner scn = new Scanner(System.in);
		int no = scn.nextInt();
		
		
		//부서번호 부서명 사원번호 이름 입사일 급여 출력
		EmpDAO dao = EmpDAO.getInstance();
		List<CommDTO> list = dao.totalList(no);
		System.out.print("부서번호\t부서명\t사원번호\t이름\t입사일\t급여");
		for(CommDTO dto : list) {
			System.out.print(dto.deptDTO.getDno()+"\t");
			System.out.print(dto.deptDTO.getDname()+"\t");
			System.out.print(dto.empDTO.getEno()+"\t");
			System.out.print(dto.empDTO.getEname()+"\t");
			System.out.print(dto.empDTO.getHiredate()+"\t");
			System.out.print(dto.empDTO.getSalary()+"\t");
			System.out.print(dto.deptDTO.getLoc()+"\t");
			System.out.print("\n");
			
		}
	}

}

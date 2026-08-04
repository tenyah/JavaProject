package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.EmpDAO;
import com.mnu.exam04.model.EmpDTO;

public class Exam_03 {

	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("찾을 글자 입력 : ");
		String na = scn.next().toUpperCase();
		
		//출력
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.nameList(na);
		System.out.print("사원번호\t사원명\t업무\t상사\t고용일\t급여\t커미션\t부서번호");
		for(EmpDTO dto : list){
			System.out.print(dto.getEno() +"\t" );
			System.out.print(dto.getEname() +"\t" );
			System.out.print(dto.getJob() +"\t" );
			System.out.print(dto.getManager() +"\t" );
			System.out.print(dto.getHiredate() +"\t" );
			System.out.print(dto.getSalary() +"\t" );
			System.out.print(dto.getCommission() +"\t" );
			System.out.print(dto.getDno() +"\t" );
			System.out.print("\n");
		}

	}

}

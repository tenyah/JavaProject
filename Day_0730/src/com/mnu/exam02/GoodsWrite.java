package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.GoodsDAO;
import com.mnu.model.GoodsDTO;

public class GoodsWrite {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("상품코드 :");
		String pcode = scn.next();
		System.out.print("상품명 :");
		String pname = scn.next();
		System.out.print("단가 :");
		int pcost = scn.nextInt();
		System.out.print("재고 :");
		int stock = scn.nextInt();
		
		GoodsDAO dao = GoodsDAO.getInstance();
		GoodsDTO dto = new GoodsDTO(pcode,pname,pcost,stock);
		
		int row = dao.GoodsWrite(dto);
		if(row==1)
			System.out.println("등록 성공");
		else
			System.out.println("등록 실패");

				
	}
}

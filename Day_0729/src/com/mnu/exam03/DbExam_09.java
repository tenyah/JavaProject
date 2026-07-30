package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mnu.util.DBManager;

public class DbExam_09 {
	public static void main(String[] args) {
		//키보드로 부서번호 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("사번을 입력하시오 : ");
		int sabun = scn.nextInt();
		
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "DELETE FROM EMP WHERE ENO = ?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			
		
			
			//select = executeQuery();
			int row = pstmt.executeUpdate(); //insert,update,delete	
			System.out.println("삭제 된 로우 : " + row);
				
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
}

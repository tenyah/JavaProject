package com.mnu.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mnu.util.DBManager;

public class DBExam_02 {
	public static void main(String[] args) {
		Connection conn = null; //DBL 연결담당
		PreparedStatement pstmt = null; //SQL 명령문 처리 담당
		ResultSet rs = null; //Query 결과 저장
		
		conn = DBManager.getConnection();
		
		String sql ="select * from emp";
		try {
		pstmt =conn.prepareStatement(sql);
		//pstmt = conn.prepareStatement("select * from dept");
		
		rs = pstmt.executeQuery();//명령셀 실행 후 결과를 rs에 저장 = ctrl Enter
		 
		//결과 출력
		System.out.println("사원번호\t사원명\t직무\t상사\t고용일\t봉급\t커미션\t부서번호");
		while(rs.next()) {//rs에 값이 존재하면 반복
			System.out.print(rs.getInt("eno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.print(rs.getString("job")+"\t");
			System.out.print(rs.getInt("manager")+"\t");
			System.out.print(rs.getString("hiredate")+"\t");
			System.out.print(rs.getInt("salary")+"\t");
			System.out.print(rs.getInt("commission")+"\t");
			System.out.print(rs.getInt("dno")+"\n");
		}
		
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
	}

}
package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class MemberDAO {
	//싱글톤 패턴으로 제작
	private MemberDAO (){}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	// 1. 등록 메소드(회원가입)
	public int memberWrite(MemberDTO mDTO) {
		//반환타입 정의
		int row = 0;
		//쿼리문장 정의
		String sql = "INSERT INTO TBL_MEMBER(CUSTNO,CUSTNAME,PHONE,GENDER,GRADE,CITY)\r\n"
				+ "            VALUES(?,?,?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,mDTO.getCustno());
			pstmt.setString(2,mDTO.getCustname());
			pstmt.setString(3,mDTO.getPhone());
			pstmt.setString(4,mDTO.getGender());
			pstmt.setString(5,mDTO.getGrade());
			pstmt.setString(6,mDTO.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,pstmt);
		}
		return row;
	}
	
	// 2.회원전체목록 검색
	public List<MemberDTO> memberList(){
		//반환타입
		List<MemberDTO> mList = new ArrayList();
		//쿼리
		String sql = "SELECT CUSTNO,CUSTNAME,PHONE,GENDER,GRADE,CITYNAME,JOINDATE \r\n"
				+ "            FROM TBL_MEMBER M JOIN TBL_CITY C ON M.CITY=C.CITY";	
		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setCityname(rs.getString("cityname"));
				dto.setJoindate(rs.getString("joindate"));
				
				mList.add(dto);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
		
	}
	
	//회원정보 검색 (회원번호)
	public MemberDTO memberSearch(int custno) {
		MemberDTO dto = new MemberDTO();
		String sql = "SELECT * FROM TBL_MEMBER WHERE CUSTNO=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			pstmt.setInt(1, custno);
			
			if(rs.next()) {
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setJoindate(rs.getString("joindate"));
			}
		}catch(Exception e) {
			
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
			return dto;
	}
}

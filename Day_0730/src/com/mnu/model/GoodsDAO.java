package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class GoodsDAO {
		//싱글톤 생성
		private GoodsDAO() {}
		private static GoodsDAO instance = new GoodsDAO();
		public static  GoodsDAO getInstance() {
			return instance;
		}
		
		
		
		//등록 메소드
		public int GoodsWrite(GoodsDTO gDTO) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int row = 0;
			//퀴리문
			String sql = "INSERT INTO TBL_GOODS(PCODE,PNAME,PCOST,STOCK) VALUES(?,?,?,?)";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gDTO.getPcode());
				pstmt.setString(2, gDTO.getPname());
				pstmt.setInt(3, gDTO.getPcost());
				pstmt.setInt(4, gDTO.getStock());
				
				row = pstmt.executeUpdate();
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				DBManager.close(conn,pstmt);
			}
				return row;
			
			
			
		}
		
		//목록 조회 메소드
		public List<GoodsDTO> GoodsList(){		
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			List<GoodsDTO> gList = new ArrayList();
			
			String sql = "SELECT PCODE,PNAME,PCOST,STOCK FROM TBL_GOODS";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					GoodsDTO dto = new GoodsDTO();
					dto.setPcode(rs.getString("pcode"));
					dto.setPname(rs.getString("pname"));
					dto.setPcost(rs.getInt("pcost"));
					dto.setStock(rs.getInt("stock"));
					
					gList.add(dto);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			} 
				return gList;
			
			
			
			
			
		}
		
	}



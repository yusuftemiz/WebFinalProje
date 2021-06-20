package com.eticaret.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.KategoriModel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class KategoriDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;
	
	public static ArrayList<KategoriModel> tumKatagoriler () throws SQLException {
		ArrayList<KategoriModel> categorylist = new ArrayList<KategoriModel>();
		String sql = "SELECT * FROM kategori;";
		try{
			
			con = ConnectionDAO.getConnection();			
			psmt = (PreparedStatement) con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				categorylist.add(new KategoriModel(rs.getInt(1), rs.getString(2)));
			}			
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally {
			con.close();
			psmt.close();
			rs.close();			
		}
		
		return categorylist;
	}
	
	
	
	public static String kategoriAdGetir(int id) throws SQLException{
		String kategori = null;
		String sql="Select adi from kategori where id="+id+";";
		try{	
			con=ConnectionDAO.getConnection();
			psmt=(PreparedStatement) con.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()){
				kategori=rs.getString("adi");
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			con.close();
			psmt.close();
			rs.close();
		}
		return kategori;
		
	}
}


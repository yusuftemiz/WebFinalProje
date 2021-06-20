package com.eticaret.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.MusteriIletisimModel;

public class IletisimDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;
	public static int iletisimEkle(MusteriIletisimModel iletisim){
		int state = 0;
		String sql = "INSERT INTO iletisim(isim,mail,konu,mesaj) VALUES(?,?,?,?);";
		try {		
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, iletisim.getName());
			psmt.setString(2, iletisim.getMail());
			psmt.setString(3, iletisim.getSubject());
			psmt.setString(4, iletisim.getMessage());
			state = psmt.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
				psmt.close();				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return state;
	}
	
	public static ArrayList<MusteriIletisimModel> iletisimGetir() throws SQLException {
		ArrayList<MusteriIletisimModel> iletisimlist = new ArrayList<MusteriIletisimModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from iletisim;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				MusteriIletisimModel iletisim=new MusteriIletisimModel();
				iletisim.setIletisimId(rs.getInt(1));
				iletisim.setName(rs.getString(2));
				iletisim.setMail(rs.getString(3));
				iletisim.setSubject(rs.getString(4));
				iletisim.setMessage(rs.getString(5));								
				iletisimlist.add(iletisim);
			}
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
				psmt.close();
				rs.close();	
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return iletisimlist;
	}
}

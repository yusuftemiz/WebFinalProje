package com.eticaret.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.SiparisModel;
import com.eticaret.model.MusteriModel;

public class SiparisDAO {
	
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;
	
	public static int siparisTamamla(SiparisModel siparis,MusteriModel musteri){
		int state = 0;
		String sql = "INSERT INTO siparis(musteri_id,urun_id,tarih,siparis_durumu,adet,fiyat) VALUES(?,?,?,?,?,?)";
		try {			
			con = ConnectionDAO.getConnection();			
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, musteri.getMusteriId());
			psmt.setInt(2, siparis.getUrun_id());
			psmt.setString(3,siparis.getTarih() );
			psmt.setString(4, "Siparis Hazirlaniyor..");
			psmt.setInt(5, siparis.getAdet());
			psmt.setInt(6, siparis.getFiyat());
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
	public static ArrayList<SiparisModel> tumSiparisleriGetir() throws SQLException {
		ArrayList<SiparisModel> tumSiparisler = new ArrayList<SiparisModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from siparis;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				SiparisModel siparis = new SiparisModel();
				siparis.setId(rs.getInt(1));
				siparis.setMusteri_id(rs.getInt(2));
				siparis.setUrun_id(rs.getInt(3));
				siparis.setTarih(rs.getString(4));
				siparis.setSiparis_durumu(rs.getString(5));
				siparis.setAdet(rs.getInt(6));
				siparis.setFiyat(rs.getInt(7));
				tumSiparisler.add(siparis);
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
		return tumSiparisler;
	}
	
	public static String musteriAdGetir(int id){
		String ad2 = null;
		String sql = "Select kullaniciAdi from musteri where id=?;";
		try {
			con = ConnectionDAO.getConnection();
			psmt =  con.prepareStatement(sql);
			psmt.setInt(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()){			
				String ad=(rs.getString(1));
				ad2=ad;
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
		return ad2;
	}
	
	public static int siparisSayisiGetir(){
		int adet = 0;
		String sql = "Select count(id) from siparis;";
		try {
			con = ConnectionDAO.getConnection();
			psmt =  con.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			if(rs.next()){			
				int sayi=(rs.getInt(1));
				adet=sayi;
								
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
		return adet;
	}
public static int siparisSil(int id) throws SQLException {
		
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("delete from siparis where id="+id+";");
			psmt.executeUpdate();			
			con.close();
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
		return 1;
	}


}













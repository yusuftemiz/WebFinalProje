package com.eticaret.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.MusteriModel;

public class MusteriDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;
	
	
	
	
	public static int MusteriEkle(MusteriModel musteriKayitNesne){
		int state = 0;
		String sql = "INSERT INTO musteri(isim,mail,telefon,adres,kullaniciAdi,sifre) VALUES(?,?,?,?,?,?);";
		try {		
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, musteriKayitNesne.getMusteriIsim());
			psmt.setString(2, musteriKayitNesne.getMusteriMail());
			psmt.setString(3, musteriKayitNesne.getMusteriTelefon());
			psmt.setString(4,musteriKayitNesne.getMusteriAdres());
			psmt.setString(5, musteriKayitNesne.getMusteriKullaniciAdi());
			psmt.setString(6, musteriKayitNesne.getMusteriSifre());
			
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
	
	
	public static ArrayList<MusteriModel> MusteriGetir() throws SQLException {
		ArrayList<MusteriModel> musteriListe = new ArrayList<MusteriModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from musteri;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				MusteriModel musteriModel=new MusteriModel();
				
				musteriModel.setMusteriId(rs.getInt(1));
				musteriModel.setMusteriIsim(rs.getString(2));
				musteriModel.setMusteriMail(rs.getString(3));
				musteriModel.setMusteriTelefon(rs.getString(4));
				musteriModel.setMusteriAdres(rs.getString(5));
				musteriModel.setMusteriKullaniciAdi(rs.getString(6));								
				musteriModel.setMusteriSifre(rs.getString(7));
				musteriListe.add(musteriModel);
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
		return musteriListe;
	}

}

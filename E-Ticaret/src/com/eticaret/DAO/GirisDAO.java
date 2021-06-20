package com.eticaret.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.AdminModel;
import com.eticaret.model.MusteriModel;


public class GirisDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;


	public static MusteriModel getMusteriControl(String kullaniciAdi, String sifre){
		MusteriModel musteri = new MusteriModel();
		String sql = "Select * from musteri where kullaniciAdi = ? and sifre=?;";
		try {
			con = ConnectionDAO.getConnection();
			psmt =  con.prepareStatement(sql);
			psmt.setString(1, kullaniciAdi);
			psmt.setString(2, sifre);
			rs = psmt.executeQuery();

			if(rs.next()){
				musteri.setMusteriId(rs.getInt(1));
				musteri.setMusteriMail(rs.getString(3));
				musteri.setMusteriKullaniciAdi(rs.getString(6));
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
		return musteri;
	}
	public static AdminModel getAdminControl(String k_adi, String parola){
		AdminModel admin=new AdminModel();
		String sql = "Select * from admin where adminKullaniciAdi=? and adminSifre=?;";
		try {
			con = ConnectionDAO.getConnection();
			psmt =  con.prepareStatement(sql);
			psmt.setString(1, k_adi);
			psmt.setString(2, parola);
			rs = psmt.executeQuery();
			System.out.println(k_adi+ "  "+parola);
			if(rs.next()){
				System.out.println(rs.getString(4));
				admin.setAdminId(rs.getInt(1));
				admin.setAdminKullaniciAdi(rs.getString(2));
				admin.setAdminSifre(rs.getString(3));
				admin.setAdminIsim(rs.getString(4));
			}

			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
				psmt.close();
				//rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return admin;
	}

	public static int musteriEkle(MusteriModel musteri){
		int state = 0;

		String sql = "INSERT INTO musteri(isim,mail,telefon,adres,kullaniciAdi,sifre) VALUES(?,?,?,?,?,?)";
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, musteri.getMusteriIsim());
			psmt.setString(2, musteri.getMusteriMail());
			psmt.setString(3, musteri.getMusteriTelefon());
			psmt.setString(4, musteri.getMusteriAdres());
			psmt.setString(5, musteri.getMusteriKullaniciAdi());
			psmt.setString(6, musteri.getMusteriSifre());


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
	public static ArrayList<MusteriModel> tumMusterilerGetir() throws SQLException {
		ArrayList<MusteriModel> tumMusteriler = new ArrayList<MusteriModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from musteri;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				MusteriModel musteri = new MusteriModel();
				musteri.setMusteriIsim(rs.getString(2));
				musteri.setMusteriMail(rs.getString(3));
				musteri.setMusteriTelefon(rs.getString(4));
				musteri.setMusteriAdres(rs.getString(5));
				musteri.setMusteriKullaniciAdi(rs.getString(6));
				musteri.setMusteriSifre(rs.getString(7));

				tumMusteriler.add(musteri);
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
		return tumMusteriler;
	}
	public static int musteriSil(int id) throws SQLException {

		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("delete from musteri where id="+id+";");
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

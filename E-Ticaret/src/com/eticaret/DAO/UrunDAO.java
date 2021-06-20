package com.eticaret.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.eticaret.model.UrunModel;
public class UrunDAO {

	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;

	public static ArrayList<UrunModel> tumUrunleriGetir() throws SQLException {
		ArrayList<UrunModel> tumUrunler = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from eticaret.urun Order By id DESC LIMIT 20;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				UrunModel urun = new UrunModel();
				urun.setUrunId(rs.getInt(1));
				urun.setUrunKategoriId(rs.getInt(2));
				urun.setUrunAd(rs.getString(3));
				urun.setUrunAciklama(rs.getString(4));
				urun.setUrunFiyat(rs.getInt(6));
				urun.setUrunStok(rs.getInt(7));
				urun.setUrunResim(rs.getBinaryStream(5));
				tumUrunler.add(urun);

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
		return tumUrunler;
	}


	public static UrunModel tekUrunGetir(int urunID) throws SQLException {
		ArrayList<UrunModel> urun = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("select * from urun where id=?;");
			psmt.setInt(1, urunID);
			rs = psmt.executeQuery();
			if (rs.next()) {
				UrunModel urunler = new UrunModel();
				urunler.setUrunId(rs.getInt(1));
				urunler.setUrunKategoriId(rs.getInt(2));
				urunler.setUrunAd(rs.getString(3));
				urunler.setUrunAciklama(rs.getString(4));
				urunler.setUrunFiyat(rs.getInt(6));
				urunler.setUrunStok(rs.getInt(7));
				urunler.setUrunResim(rs.getBinaryStream(5));
				urun.add(urunler);
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
		return urun.get(0);
	}


	public static int urunSil(int id) throws SQLException {

		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("delete from urun where id="+id+";");
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
	public static int urunEkle(UrunModel urun){

		int state = 0;
		String sql = "INSERT INTO urun(kategoriId,ad,aciklama,fiyat,stok,resim) VALUES(?,?,?,?,?,?)";
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, urun.getUrunKategoriId());
			psmt.setString(2, urun.getUrunAd());
			psmt.setString(3, urun.getUrunAciklama());
			psmt.setInt(4, urun.getUrunFiyat());
		    psmt.setInt(5, urun.getUrunStok());
			psmt.setBlob(6, urun.getUrunResim());
			state = psmt.executeUpdate();
			System.out.println("Urun EKLE bASARILI");

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

	public static byte[] getImageByUrunId(int urunID) {
		String query = "select resim from urun where id=?";
		Connection con = ConnectionDAO.getConnection();
		PreparedStatement psmt;
		byte[] bytesImage = null;
		try {
			psmt = con.prepareStatement(query);
			psmt.setInt(1, urunID);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				bytesImage = rs.getBytes("resim");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bytesImage;
	}

	public static ArrayList<UrunModel> elektronikKategoriGetir() throws SQLException {
		ArrayList<UrunModel> elektronik = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from urun where kategoriId=2;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				UrunModel urun = new UrunModel();
				urun.setUrunId(rs.getInt(1));
				urun.setUrunKategoriId(rs.getInt(2));
				urun.setUrunAd(rs.getString(3));
				urun.setUrunAciklama(rs.getString(4));
				urun.setUrunFiyat(rs.getInt(6));
				urun.setUrunStok(rs.getInt(7));
				urun.setUrunResim(rs.getBinaryStream(5));
				elektronik.add(urun);
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
		return elektronik;
	}
	
	public static ArrayList<UrunModel> evKategoriGetir() throws SQLException {
		ArrayList<UrunModel> ev = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from urun where kategoriId=1;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				UrunModel urun = new UrunModel();
				urun.setUrunId(rs.getInt(1));
				urun.setUrunKategoriId(rs.getInt(2));
				urun.setUrunAd(rs.getString(3));
				urun.setUrunAciklama(rs.getString(4));
				urun.setUrunFiyat(rs.getInt(6));
				urun.setUrunStok(rs.getInt(7));
				urun.setUrunResim(rs.getBinaryStream(5));
				ev.add(urun);
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
		return ev;
	}
		
		public static ArrayList<UrunModel> kitapKategoriGetir() throws SQLException {
		ArrayList<UrunModel> kitap = new ArrayList<UrunModel>();
		try {
			con = ConnectionDAO.getConnection();
			psmt = con.prepareStatement("Select * from urun where kategoriId=3;");
			rs = psmt.executeQuery();
			while (rs.next()) {
				UrunModel urun = new UrunModel();
				urun.setUrunId(rs.getInt(1));
				urun.setUrunKategoriId(rs.getInt(2));
				urun.setUrunAd(rs.getString(3));
				urun.setUrunAciklama(rs.getString(4));
				urun.setUrunFiyat(rs.getInt(6));
				urun.setUrunStok(rs.getInt(7));
				urun.setUrunResim(rs.getBinaryStream(5));
				kitap.add(urun);
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
		return kitap;
	}
		public static int urunGuncelle(UrunModel urun){
				int state = 0;
				String sql = "UPDATE urun SET ad = ?, aciklama = ?, fiyat= ?,stok=?,resim=? WHERE id = ?";
				try{

					con = ConnectionDAO.getConnection();
					psmt = con.prepareStatement(sql);
					psmt.setString(1, urun.getUrunAd());
					psmt.setString(2, urun.getUrunAciklama());
					psmt.setInt(3, urun.getUrunFiyat());
				    psmt.setInt(4, urun.getUrunStok());
					psmt.setBlob(5, urun.getUrunResim());
					psmt.setInt(6, urun.getUrunId());
					state = psmt.executeUpdate();
					System.out.println("URUN EKLE BASARILI");
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
}

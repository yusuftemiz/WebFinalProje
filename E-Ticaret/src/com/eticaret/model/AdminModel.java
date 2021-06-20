package com.eticaret.model;
public class AdminModel {
	public AdminModel() {
		super();
}
	public AdminModel(int adminId, String adminKullaniciAdi, String adminSifre, String adminIsim) {
		super();
		this.adminId = adminId;
		this.adminKullaniciAdi = adminKullaniciAdi;
		this.adminSifre = adminSifre;
		this.adminIsim = adminIsim;
	}
	private int adminId;
	private String adminKullaniciAdi;
	private String adminSifre;
	private String adminIsim;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminKullaniciAdi() {
		return adminKullaniciAdi;
	}
	public void setAdminKullaniciAdi(String adminKullaniciAdi) {
		this.adminKullaniciAdi = adminKullaniciAdi;
	}
	public String getAdminSifre() {
		return adminSifre;
	}
	public void setAdminSifre(String adminSifre) {
		this.adminSifre = adminSifre;
	}
	public String getAdminIsim() {
		return adminIsim;
	}
	public void setAdminIsim(String adminIsim) {
		this.adminIsim = adminIsim;
	}
}

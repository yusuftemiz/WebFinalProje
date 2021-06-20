package com.eticaret.model;

public class MusteriIletisimModel {
	public MusteriIletisimModel(int iletisimId, String isim, String mail, String konu, String mesaj) {
		super();
		this.iletisimId = iletisimId;
		this.isim = isim;
		this.mail = mail;
		this.konu = konu;
		this.mesaj = mesaj;
	}
	public MusteriIletisimModel() {
		super();
	}
	private int iletisimId;
	private String isim;
	private String mail;
	private String konu;
	private String mesaj;

	
	public int getIletisimId() {
		return iletisimId;
	}
	public void setIletisimId(int iletisimId) {
		this.iletisimId = iletisimId;
	}
	public String getName() {
		return isim;
	}
	public void setName(String isim) {
		this.isim = isim;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSubject() {
		return konu;
	}
	public void setSubject(String konu) {
		this.konu = konu;
	}
	public String getMessage() {
		return mesaj;
	}
	public void setMessage(String mesaj) {
		this.mesaj = mesaj;
	}
	
}

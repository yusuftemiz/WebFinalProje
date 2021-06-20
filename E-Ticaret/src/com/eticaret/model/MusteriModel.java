package com.eticaret.model;

public class MusteriModel {
	public MusteriModel() {
		super();
	}
	public MusteriModel(int musteriId, String musteriIsim, String musteriMail, String musteriTelefon,String musteriAdres,String musteriKullaniciAdi,String musteriSifre) {
		super();

		this.musteriId = musteriId;
		this. musteriIsim =  musteriIsim;
		this.musteriMail = musteriMail;
		this.musteriTelefon = musteriTelefon;
		this.musteriAdres=musteriAdres;
		this.musteriKullaniciAdi = musteriKullaniciAdi;
		this.musteriSifre = musteriSifre;
	}
	public int getMusteriId() {
		return  musteriId;
		}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	
	public String getMusteriIsim() {
		return  musteriIsim;
	}
	public void setMusteriIsim(String  musteriIsim) {
		this. musteriIsim =  musteriIsim;
	}
	
	public String getMusteriMail() {
		return musteriMail;
	}
	public void setMusteriMail(String musteriMail) {
		this.musteriMail = musteriMail;
	}
	
	public String getMusteriTelefon() {
		return musteriTelefon;
	}
	public void setMusteriTelefon(String telefon) {
		this.musteriTelefon = telefon;
	}
	
	public String getMusteriAdres() {
		return musteriAdres;
	}
	public void setMusteriAdres(String musteriAdres) {
		this.musteriAdres = musteriAdres;
	}
	
	public String getMusteriKullaniciAdi() {
		return musteriKullaniciAdi;
	}
	public void setMusteriKullaniciAdi(String musteriKullaniciAdi) {
		this.musteriKullaniciAdi = musteriKullaniciAdi;
	}
	
	public String getMusteriSifre() {
		return musteriSifre;
	}
	public void setMusteriSifre(String musteriSifre) {
		this.musteriSifre = musteriSifre;
	}

	
	private int musteriId;
	private String musteriTelefon;
	private String musteriIsim;
	private String musteriMail;
	private String musteriKullaniciAdi;
	private String musteriSifre;
	private String musteriAdres;

	
	
	
	
	
	
}

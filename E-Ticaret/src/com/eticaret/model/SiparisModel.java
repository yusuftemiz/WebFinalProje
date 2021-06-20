package com.eticaret.model;

public class SiparisModel {
	private int id;
	private int musteri_id;
	private int urun_id;
	private String tarih;
	private String siparis_durumu;
	private int adet;
	private int fiyat;
	
	public SiparisModel() {
		super();
	}
	
	public SiparisModel(int id, int musteri_id, int urun_id, String tarih, String siparis_durumu, int adet, int fiyat) {
		super();
		this.id = id;
		this.musteri_id = musteri_id;
		this.urun_id = urun_id;
		this.tarih = tarih;
		this.siparis_durumu = siparis_durumu;
		this.adet = adet;
		this.fiyat = fiyat;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMusteri_id() {
		return musteri_id;
	}
	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}
	public int getUrun_id() {
		return urun_id;
	}
	public void setUrun_id(int urun_id) {
		this.urun_id = urun_id;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	public String getSiparis_durumu() {
		return siparis_durumu;
	}
	public void setSiparis_durumu(String siparis_durumu) {
		this.siparis_durumu = siparis_durumu;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	

}

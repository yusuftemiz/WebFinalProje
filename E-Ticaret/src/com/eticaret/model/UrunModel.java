package com.eticaret.model;

import java.io.InputStream;

public class UrunModel {
	
	private int urunId;
	private String urunAd;
	private String urunAciklama;
	private int urunKategoriId;
	private int urunFiyat;
	private int urunStok;
	private InputStream urunResim;
	
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public String getUrunAd() {
		return urunAd;
	}
	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}
	public String getUrunAciklama() {
		return urunAciklama;
	}
	public void setUrunAciklama(String urunAciklama) {
		this.urunAciklama = urunAciklama;
	}
	public int getUrunKategoriId() {
		return urunKategoriId;
	}
	public void setUrunKategoriId(int urunKategoriId) {
		this.urunKategoriId = urunKategoriId;
	}
	public int getUrunFiyat() {
		return urunFiyat;
	}
	public void setUrunFiyat(int urunFiyat) {
		this.urunFiyat = urunFiyat;
	}
	public int getUrunStok() {
		return urunStok;
	}
	public void setUrunStok(int urunStok) {
		this.urunStok = urunStok;
	}
	public InputStream getUrunResim() {
		return urunResim;
	}
	public void setUrunResim(InputStream urunResim) {
		this.urunResim = urunResim;
	}
	
}

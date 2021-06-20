package com.eticaret.servlet;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.model.MusteriModel;
import com.eticaret.model.UrunModel;
import com.eticaret.model.SiparisModel;
import com.eticaret.DAO.SiparisDAO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/siparisTamamla")
public class SiparisTamamla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SiparisTamamla() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		if(request.getSession().getAttribute("musteri")!=null){
			SiparisModel siparis=new SiparisModel();
			
			MusteriModel musteri =(MusteriModel) request.getSession().getAttribute("musteri") ;
			@SuppressWarnings("unchecked")
			ArrayList<UrunModel> urunler=(ArrayList<UrunModel>) request.getSession().getAttribute("cart");
			
			 	Date simdikiZaman = new Date();
		        System.out.println(simdikiZaman.toString());
		        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		        System.out.println(df.format(simdikiZaman));
			
			
			for(int i=0;i<urunler.size();i++){
				musteri.setMusteriId(musteri.getMusteriId());
				musteri.setMusteriIsim(musteri.getMusteriIsim());
				musteri.setMusteriMail(musteri.getMusteriMail());
				musteri.setMusteriSifre(musteri.getMusteriSifre());
				
				siparis.setMusteri_id(musteri.getMusteriId());
				siparis.setAdet(1);
				siparis.setFiyat(urunler.get(i).getUrunFiyat());
				siparis.setSiparis_durumu("Siparisiniz Hazirlaniyor..");
				siparis.setTarih(df.format(simdikiZaman));
//				siparis.setTarih(simdikiZaman);
				siparis.setUrun_id(urunler.get(i).getUrunId());
				SiparisDAO.siparisTamamla(siparis,musteri);
				

				}	
			}
		response.sendRedirect("siparis");
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		
		
		
	}

}

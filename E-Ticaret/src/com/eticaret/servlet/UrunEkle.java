package com.eticaret.servlet;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.eticaret.DAO.UrunDAO;
import com.eticaret.model.UrunModel;

@WebServlet("/urunekle")
@MultipartConfig(maxFileSize = 16177215) 
public class UrunEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UrunEkle() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		
		int katId=Integer.parseInt(request.getParameter("formKategori"));
		String isim = request.getParameter("urunAd");
		String aciklama = request.getParameter("urunAciklama");
		int fiyat = Integer.parseInt(request.getParameter("urunFiyat"));
		int stok = Integer.parseInt(request.getParameter("urunStok"));
		System.out.println(katId+isim+aciklama+fiyat+stok);
				
			
		InputStream resim = null; 
		  Part filePart = request.getPart("UrunResim");
        if (filePart != null) {

            resim = filePart.getInputStream();
        }
		
		if(isim!="" && aciklama!="" && stok!=0 && fiyat!=0 && resim!=null){
			request.setCharacterEncoding("utf-8");
			System.out.println("Boþ deðil");
			
			UrunModel urun=new UrunModel();
			urun.setUrunKategoriId(katId);
			
			urun.setUrunAd(isim);
			urun.setUrunAciklama(aciklama);
			urun.setUrunStok(stok);
			urun.setUrunFiyat(fiyat);
			urun.setUrunResim(resim);			
			
			int eklendiMi = UrunDAO.urunEkle(urun);
			if(eklendiMi != 0){
				response.sendRedirect("adminurunekle");
				
			}else{	
				System.out.println("Hata Var 1");
				response.sendRedirect("hata");
				
			}
		}
		else{			
			System.out.println("hata büyük");
			response.sendRedirect("hata");
			
		}
	}
		
	}



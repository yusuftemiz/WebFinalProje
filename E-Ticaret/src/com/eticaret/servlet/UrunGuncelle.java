package com.eticaret.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.eticaret.DAO.UrunDAO;
import com.eticaret.model.UrunModel;


@WebServlet("/urunGuncelleServlet")
public class UrunGuncelle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UrunGuncelle() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("guncelle"));
		try {
			UrunModel urun= UrunDAO.tekUrunGetir(id);

			urun.setUrunAd(request.getParameter("urunAd"));
			urun.setUrunAciklama(request.getParameter("urunAciklama"));
			urun.setUrunFiyat(Integer.parseInt(request.getParameter("urunFiyat")));
			urun.setUrunStok(Integer.parseInt(request.getParameter("urunStok")));
			InputStream resim = null; 
			 Part filePart = request.getPart("UrunResim");
	        if (filePart != null) {
	            resim = filePart.getInputStream();
	        }
			urun.setUrunResim(resim);
			
			UrunDAO.urunGuncelle(urun);
			
			response.sendRedirect("urunGuncelle");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

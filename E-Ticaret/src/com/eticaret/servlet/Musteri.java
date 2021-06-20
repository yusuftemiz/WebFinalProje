package com.eticaret.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.DAO.MusteriDAO;
import com.eticaret.model.MusteriModel;

@WebServlet("/musteri")
public class Musteri extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Musteri() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		
		
		String isim = request.getParameter("isim");
		String mail = request.getParameter("mail");
		String telefon = request.getParameter("telefon");
		String adres = request.getParameter("adres");
		String kullaniciAdi = request.getParameter("kullaniciAdi");
		String sifre = request.getParameter("sifre");
	
		
		
		if(isim!="" && mail!="" && telefon!="" && adres!="" && kullaniciAdi!="" && sifre!=null ){
				MusteriModel cust=new MusteriModel();
				
				cust.setMusteriIsim(isim);
				cust.setMusteriMail(mail);
				cust.setMusteriAdres(adres);
				cust.setMusteriKullaniciAdi(kullaniciAdi);
				cust.setMusteriSifre(sifre);
				cust.setMusteriTelefon(telefon);
				
				int eklendiMi = MusteriDAO.MusteriEkle(cust);
			if(eklendiMi != 0){
				response.sendRedirect("index");
				
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

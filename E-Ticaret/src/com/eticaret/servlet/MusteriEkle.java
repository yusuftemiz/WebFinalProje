package com.eticaret.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eticaret.DAO.GirisDAO;
import com.eticaret.model.MusteriModel;
import com.eticaret.model.UrunModel;

@WebServlet("/musterikayit")
public class MusteriEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MusteriEkle() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String isim = request.getParameter("isim");
		String mail = request.getParameter("mail");
		String telefon =request.getParameter("telefon");
		String adres = request.getParameter("adres");
		String kullaniciAdi = request.getParameter("kullaniciAdi");
		String sifre = request.getParameter("sifre");
		
		System.out.println(isim +"   "+ mail+"   "+ telefon+"       "+adres+"   "+kullaniciAdi+"    "+sifre);
		
		if(isim!="" && mail!=""  && telefon !="" && adres!="" && kullaniciAdi!=""&& sifre!="" ){				
			MusteriModel musteri=new MusteriModel();
			musteri.setMusteriIsim(isim);
			musteri.setMusteriMail(mail);
			musteri.setMusteriTelefon(telefon);
			musteri.setMusteriAdres(adres);
			musteri.setMusteriKullaniciAdi(kullaniciAdi);
			musteri.setMusteriSifre(sifre);
						
			int eklendiMi = GirisDAO.musteriEkle(musteri);
			if(eklendiMi != 0){
				ArrayList<UrunModel> cart = new ArrayList<UrunModel>();
				request.getSession().setAttribute("cart", cart); //Session oluþtur(Müþteri Sepeti)
				request.getSession().setAttribute("musteri", musteri); //Session Oluþtur (Müþteri Bilgileri)
				response.sendRedirect("index"); //(Müþteri Eklendikten Sonra index sayfasýna git )
			}else{				
				request.getRequestDispatcher("hata").forward(request, response);
			}
		}
		else{			
			request.getRequestDispatcher("hata").forward(request, response);
			
		}
	}

}

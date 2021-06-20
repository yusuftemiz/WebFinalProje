package com.eticaret.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.DAO.GirisDAO;
import com.eticaret.model.AdminModel;
import com.eticaret.model.MusteriModel;
import com.eticaret.model.UrunModel;

@WebServlet("/musterilogin")
public class MusteriLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MusteriLogin() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String kullaniciAdi = request.getParameter("kullaniciAdi");
		System.out.println("Kullanici Adi"+kullaniciAdi);
		String sifre=request.getParameter("sifre");
		System.out.println("Kullanici Þifresi"+sifre);
		AdminModel admin = GirisDAO.getAdminControl(kullaniciAdi, sifre);
		if (admin.getAdminIsim() != null) {				
			request.getSession().setAttribute("admin", admin);				
			response.sendRedirect("adminIndex");
		}
		else{
			System.out.println(kullaniciAdi+""+sifre);
			MusteriModel musteri = GirisDAO.getMusteriControl(kullaniciAdi, sifre);
			if (musteri.getMusteriKullaniciAdi()!= null) {
				System.out.println("Kullanýcý Adi Alýndý");
				ArrayList<UrunModel> cart = new ArrayList<UrunModel>();
       			request.getSession().setAttribute("cart", cart);
       			System.out.println("card oluþturuldu");
       			request.getSession().setAttribute("musteri", musteri);
       			System.out.println("Musteri Oluþturuldu");
				response.sendRedirect("index");	
			} 
			else 
			{				
				request.setAttribute("status", "E-Posta adresiniz veya þifre hatalý");
				request.getRequestDispatcher("hata").forward(request, response);
			} 	
		}
	}
}
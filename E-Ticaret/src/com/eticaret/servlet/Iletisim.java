package com.eticaret.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.DAO.IletisimDAO;
import com.eticaret.model.MusteriIletisimModel;
import com.eticaret.model.MusteriModel;;


@WebServlet("/iletisimServlet")
public class Iletisim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Iletisim() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MusteriModel musteri =(MusteriModel) request.getSession().getAttribute("musteri") ;
		String name = musteri.getMusteriKullaniciAdi();
		String mail = musteri.getMusteriMail();
		System.out.println(musteri);
		System.out.println("Name: "+ name);
		System.out.println("Mail: "+ mail);
		String message = request.getParameter("message");
		String subject = request.getParameter("konu");
		if(name!=null && mail!=null && message!=null && subject!=null){
			System.out.println(name +" "+ mail + " "+ message + " "+subject);
			MusteriIletisimModel iletisim=new MusteriIletisimModel();
			iletisim.setName(name);
			iletisim.setMail(mail);
			iletisim.setMessage(message);
			iletisim.setSubject(subject);
			int state=IletisimDAO.iletisimEkle(iletisim);
			if(state==1){
				response.sendRedirect("iletisim");
			}else{
				response.sendRedirect("hata");
			}
		}else
				response.sendRedirect("hata");
		
	}

}


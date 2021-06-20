package com.eticaret.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.DAO.UrunDAO;
import com.eticaret.model.UrunModel;

@WebServlet("/sepetekle")
public class SepeteEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("urunID"));
		
		if(request.getSession().getAttribute("musteri")!=null){
																																														@SuppressWarnings("unchecked")
		ArrayList<UrunModel> sepet = (ArrayList<UrunModel>) request.getSession().getAttribute("cart");		
		try {
			sepet.add(UrunDAO.tekUrunGetir(id));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("index").forward(request, response);
		}
		else{
			response.sendRedirect("musteriGiris");
		}
	}
}

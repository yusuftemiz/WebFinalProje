package com.eticaret.servlet;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.model.UrunModel;

/**
 * Servlet implementation class SepettenCikar
 */
@WebServlet("/sepettencikar")
public class SepettenCikar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SepettenCikar() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("urunid"));
		@SuppressWarnings("unchecked")
		ArrayList<UrunModel> sepet = (ArrayList<UrunModel>) request.getSession().getAttribute("cart");
		
		sepet.remove(id);
		
		
		request.getRequestDispatcher("cart").forward(request, response);
	}
}

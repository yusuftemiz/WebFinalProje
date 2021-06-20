package com.eticaret.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eticaret.DAO.GirisDAO;


/**
 * Servlet implementation class musteriSil
 */
@WebServlet("/musteriSil")
public class MusteriSil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MusteriSil() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("sil"));
		try {
			GirisDAO.musteriSil(id);
			response.sendRedirect("adminMusteri");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

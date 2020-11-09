package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Clients
 */
@WebServlet(urlPatterns = {"/Clients","/pclt"}) 
public class Clients extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pclt.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom_famille = request.getParameter("nom_famille");
		request.setAttribute(nom_famille, nom_famille);
		
		String village = request.getParameter("village");
		request.setAttribute(village, village);
		
		String adresse = request.getParameter("adresse");
		request.setAttribute(adresse, adresse);
		
		String numero_tel = request.getParameter("numero_tel");
		request.setAttribute(numero_tel, numero_tel);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pclt.jsp").forward(request, response);
	}

}

package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Connect;

/**
 * Servlet implementation class Responsables
 */
@WebServlet(urlPatterns = {"/Responsables","/prsp"})
public class Responsables extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Responsables() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/prsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connect entrer = new Connect ();
		
		entrer.verify(request,response);
		
		request.setAttribute("entrer", entrer);
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/prsp2.jsp").forward(request, response);
		
		String id = request.getParameter("id");
		request.setAttribute(id, id);
		
		String nom = request.getParameter("nom");
		request.setAttribute(nom, nom);
		
		String prenom = request.getParameter("prenom");
		request.setAttribute(prenom, prenom);
		
		String email = request.getParameter("email");
		request.setAttribute(email, email);
		
		String password = request.getParameter("password");
		request.setAttribute(password, password);
		
	}

	
}

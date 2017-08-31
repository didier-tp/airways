package com.sopra.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.web.data.StatutResa;

/**
 * Servlet implementation class ServletResa
 */
// @WebServlet("/ServletResa")
public class ServletResa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletResa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String depart = request.getParameter("aeroportdepart");
		String arrivee = request.getParameter("aeroportarrivee");
		String datedepart = request.getParameter("datedepart");
		StatutResa statutResa = new StatutResa(depart, arrivee, datedepart);
		// creation de l'objet de redirection
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/" + "statutResa.jsp");

		request.setAttribute("statutResa", statutResa);

		// redirection (cote serveur) du servlet vers page jsp
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

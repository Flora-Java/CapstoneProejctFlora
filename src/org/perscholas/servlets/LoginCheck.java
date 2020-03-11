/**
 * File: 			LoginCheck.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.perscholas.jpa.entities.Product;
import org.perscholas.jpa.entities.ProductServices;
import org.perscholas.jpa.entities.User;
import org.perscholas.jpa.entities.UserServices;

import or.perscholas.classes.Cart;

/**
 * Servlet implementation class LoginCheck
 * 
 * Got the control from the index page. Here if the client tries to sign in,
 *  userid and pasword are validated with the user db to make sure that this user
 *  has the right credentials. If not an error message will be issued.
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("email");
		String password = request.getParameter("password");
//		HttpSession session = request.getSession(true);
//		session.setAttribute("notloggedIn", true);

		UserServices us = new UserServices();
		List<User> user = us.getUserByEmail(name);
		String url1, url2 ,url3, url4;
		String desc1, desc2, desc3, desc4;
		double price1, price2, price3, price4;
		Integer prodId1, prodId2, prodId3, prodId4;
		
		if (!user.isEmpty()) {
			if ((user.get(0).getEmail().equals(name)) && (user.get(0).getPassword().equals(password))) {
				HttpSession session = request.getSession(true);
				session.setAttribute("user", name);

				ProductServices ps = new ProductServices();
				List<Product> products = ps.getAllProducts();
				
				List<Cart> carts = new ArrayList<Cart>();
				session.setAttribute("carts", carts);
				session.setAttribute("prodlist", products);
				request.getRequestDispatcher("/member.jsp").forward(request, response);
			}
		}
		request.setAttribute("errorMessage", "Invalid email or password");
		request.getRequestDispatcher("/login.jsp").forward(request, response);

	}


}

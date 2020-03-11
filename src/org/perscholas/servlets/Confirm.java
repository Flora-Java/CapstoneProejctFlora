/**
 * File: 			Confirm.java
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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.perscholas.jpa.entities.Product;
import org.perscholas.jpa.entities.ProductServices;
import org.perscholas.jpa.entities.UserServices;

import or.perscholas.classes.Cart;


/**
 * Servlet implementation class Confirm
 * The page member.jsp send the control to this page to verify which product was selected.
 *   From here the control is send over to cart.jsp to show the content of the cart
 * 
 */
@WebServlet("/Confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		ProductServices ps = new ProductServices();
		
		String stringId = request.getParameter("selection");
		System.out.println("valor de seleccion: " + stringId);
		
		Integer prodId = Integer.parseInt(stringId);
		List<Product> prodList = new ArrayList<Product>();
		 prodList = ps.getProductById(prodId);
		
		Cart cart = new Cart();
		cart.setDescription(prodList.get(0).getDescription());
		cart.setQuantity(1);
		cart.setPrice(prodList.get(0).getPrice());
		double total = prodList.get(0).getPrice() * 1.0 ;
		cart.setTotal(total);
		List<Cart> cartList = new ArrayList<Cart>();
		cartList.add(cart);
		session.setAttribute("cartList", cartList);
		
		System.out.println("inside confirm " + cartList);
		request.getRequestDispatcher("/cart.jsp").forward(request, response);

		

	}

}

/**
 * File: 			SigningUp.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.perscholas.jpa.entities.Customer;
import org.perscholas.jpa.entities.CustomerServices;
import org.perscholas.jpa.entities.User;
import org.perscholas.jpa.entities.UserServices;

/**
 * Servlet implementation class SigningUp
 * 
 *   The servlet validates the information of the new user.When all the information is correct
 *   add a new user and a new customer in the respectives databases.
 */
@WebServlet("/SigningUp")
public class SigningUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigningUp() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String passw = request.getParameter("txtpass");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zipcode = request.getParameter("zipcode");
		String state = request.getParameter("state");
		int zipcodeInt = Integer.parseInt(zipcode);
		
		CustomerServices cs = new CustomerServices();
		UserServices us = new UserServices();
		List<User> user = us.getUserByEmail(email);
		System.out.println("value email " + email);
		if (user.isEmpty()) {
			System.out.println("email was not found inside user empty");
			Customer customer = new Customer();
			customer.setCustomerLastname(lname);
			customer.setCustomerName(fname);
			customer.setTelephone(phone);
			customer.setStreet(address);
			customer.setCity(city);	
			customer.setZipcode(zipcodeInt);
			customer.setState(state);
			customer.setOrderCustomerList(null);
			cs.addCustomer(customer);
			User userNew = new User(email, customer, passw,"client");
			us.addUser(userNew);
			request.getRequestDispatcher("/login.jsp").forward(request, response);

		}
		request.setAttribute("errorMessage1", "Email is already taken!!");
		request.getRequestDispatcher("/signup.jsp").forward(request, response);

	}

}

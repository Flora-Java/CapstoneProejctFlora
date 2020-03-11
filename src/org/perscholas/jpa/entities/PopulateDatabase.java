/**
 * File: 			PopulateDatabase.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Flora Lopez
 *
 *    Populate databases when testing data
 */
public class PopulateDatabase extends AbstractServices {

	 CustomerServices customerServices = new CustomerServices();
	 OrderCustomerServices orderCustomerServices = new OrderCustomerServices();
	 OrderDetailsServices orderDetailsServices = new OrderDetailsServices();
	 UserServices userServices = new UserServices();
	 ProductServices productServices = new ProductServices();
	
	private void run() {
	
//   Populate customer
//		List<OrderCustomer> ordercustomer = new ArrayList<OrderCustomer>();
		
// 		Customer customer = new Customer( "Darla", "Perez", "3332 Street", "Las Vegas", 34567, "Nevada",
//				"432-765-9807",null);
//		customerServices.addCustomer(customer);
//		Customer customer1 = new Customer("Luke", "Smith", "2965 Briabroke CT", "Columbus", 34876, "Ohio",
//				"452-765-3356", null);
//		customerServices.addCustomer(customer1);
//		Customer customer2 = new Customer( "Klaus", "Wolf", "24599 4th Street", "Miami", 54569, "Florida",
//				"232-765-9800", null);
//		customerServices.addCustomer(customer2);
//		customerServices.getAllCustomers();
//		List<Customer> customer5 = customerServices.getCustomerById(6);
//		System.out.println("customer by id : " + customer5);
//		customerServices.deleteById(7);
//		customerServices.updateCustomer( 1, "Perez", "3332 Street", "Albuquerque", 34567, "New Mexico",
//				"432-765-9807");
//    	customerServices.getAllCustomers();
		
// 	populate ordercustomer
		
// 		OrderCustomer orderCustomer = new OrderCustomer(5, 24.99, "2019/05/23",null);
// 		orderCustomerServices.addOrderCustomer(orderCustomer);
// 		OrderCustomer orderCustomer1 = new OrderCustomer(1, 15.77, "2020/01/20", null);
//		orderCustomerServices.addOrderCustomer(orderCustomer1);
//		OrderCustomer orderCustomer2 = new OrderCustomer(4, 33.85, "2020/02/13", null);
//		orderCustomerServices.addOrderCustomer(orderCustomer2);
//		orderCustomerServices.getAllOrders();
//		List<OrderCustomer> orderCustomer5 = orderCustomerServices.getOrderCustomerById(4);
//		System.out.println("ordercustomer by id : " + orderCustomer5);
//		orderCustomerServices.deleteByOrderNumber(1);
//		orderCustomerServices.getAllOrders();
		
// populate orderdetails	

//		OrderDetails orderDetails = new OrderDetails( 10, 5.99, "aloe vera","SK2345k");
// 		orderDetailsServices.addOrderDetails(orderDetails);
// 		
// 		OrderDetails orderDetails1 = new OrderDetails(14,2.99,"Cactus","SK2323P");
//		orderDetailsServices.addOrderDetails(orderDetails1);
//		
//		OrderDetails orderDetails2 = new OrderDetails(3,11.55, "Orchid", "ML4567P");
//		orderDetailsServices.addOrderDetails(orderDetails2);
		
		
//		orderDetailsServices.getAllDetails();
//		
//		List<OrderDetails> orderDetails6 = orderDetailsServices.getOrderDetailsById(7);
//		System.out.println("orderdetails by id : " + orderDetails6);
//		orderDetailsServices.deleteById(3);
//		orderDetailsServices.getAllDetails();
	
// 		Populate product
    	
//    	Product product = new Product(3.45, 112, "Cactus", "httml://user/cactus.jpg",
//			"plant");
// 		productServices.addProduct(product);
// 		Product product1 = new Product(2.45, 52, "Cactus-flower", "httml://user/flower.jpg",
// 				"plant");
// 	 	productServices.addProduct(product1);
// 	 	Product product2 = new Product(5.45, 32, "Aloe", "httml://user/aloe.jpg",
// 				"plant");
// 	 	productServices.addProduct(product2);
// 	 	productServices.getAllProducts();
//		productServices.updateProduct(1, 3.45, 111, "Cactus", "httml://user/cactus.jpg","plant");
// 	 	customerServices.getAllCustomers();
// 	 	productServices.deleteByProductId(2);
// 	 	customerServices.getAllCustomers();

//		Populate user
		
		Customer customer = new Customer( "Pedro", "Paramo", "3332 Street", "Las Vegas", 34567, "Nevada",
				"432-765-9807",null);
		customerServices.addCustomer(customer);

		User user = new User("flora.l@gmail.com", customer, "password", "client");
		userServices.addUser(user);
		Customer customer2 = new Customer("Claudia", "Smith", "87632 Grand Boulevard", "Las Vegas", 34567, "Nevada",
				"432-765-9807",null);
		customerServices.addCustomer(customer2);

		User user1 = new User("anna@yahoo.com", customer2, "secret", "client");
		userServices.addUser(user1);
		Customer customer3 = new Customer( "Albert", "Ritt", "4322 Auburn Rd", "Rochester", 44567, "Michigan",
				"432-765-9807",null);
		customerServices.addCustomer(customer3);

		User user2 = new User("Anna@gmail.com", customer3, "user", "client");
		userServices.addUser(user2);
		userServices.getAllUsers();
		userServices.getUserByEmail("anna@yahoo.com");
	//	userServices.deleteUserByEmail("anna@yahoo.com");
		userServices.getAllUsers();

		
	}

	public static void main(String[] args) {
		PopulateDatabase pd = new PopulateDatabase();
		pd.run();
		pd.closeup();
		
		

	}
	private void closeup() {
		customerServices.close();
		orderCustomerServices.close();
		orderDetailsServices.close();

	//	orderCustomerServices.close();

	}

}

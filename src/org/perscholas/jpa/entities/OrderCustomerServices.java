/**
 * File: 			OrderCustomerServices.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

/**
 * 
 * @author Flora Lopez
 *
 *
 *  Description: 	Services for  OrderCustomer entity, CRUD functionality (as needed)
 */

public class OrderCustomerServices extends AbstractServices {
	/**
	 *  Add a new order
	 *  
	 * @param order
	 */
		public void addOrderCustomer(OrderCustomer order) {
	        this.em.getTransaction().begin();
	        this.em.persist(order);
	        this.em.getTransaction().commit();
	    }
	/**
	 * Get all orders
	 * 
	 * @return a list of all customers
	 */
		public List<OrderCustomer> getAllOrders() {
	        Query query = this.em.createNamedQuery("FindAllOrders");
	        List<OrderCustomer> cList = query.getResultList();
	        Iterator var4 = cList.iterator();

	        while(var4.hasNext()) {
	        	OrderCustomer o = (OrderCustomer)var4.next();
	            System.out.println(o);
	        }

	        return cList;
	    }
	/**
	 * Update info of the order
	 * 
	 * @param id
	 * @param customerLastname
	 * @param street
	 * @param city
	 * @param zipcode
	 * @param state
	 * @param telephone
	 * @return
	 */
		
		public boolean update(int id, String customerLastname, String street, String city, Integer zipcode,
				String state, String telephone) {
	        this.em.getTransaction().begin();
	        Customer customer = (Customer)this.em.find(Customer.class, id);
	        customer.setCustomerLastname(customerLastname);
	        customer.setStreet(street);
	        customer.setCity(city);
	        customer.setZipcode(zipcode);
	        customer.setState(state);
	        customer.setTelephone(telephone);
	        this.em.getTransaction().commit();
	        return true;
	    }
	/**
	 * Delete Order by orderNumber
	 * 
	 * @param order Number
	 */
		 public void deleteByOrderNumber(Integer orderNumber) {
		        Query query = this.em.createNamedQuery("DeleteByOrder");
		        this.em.getTransaction().begin();
		        OrderCustomer foundOrder = (OrderCustomer)this.em.find(OrderCustomer.class, orderNumber);
		        this.em.remove(foundOrder);
		        this.em.getTransaction().commit();
		        
		    }
		 /**
		 * Get OrderCustomer by Id
		 * 
		 * @param orderNumber
		 */
		 
			@SuppressWarnings("unchecked")
			public List<OrderCustomer> getOrderCustomerById(Integer ordernumber) {
				Query query = this.em.createNamedQuery("FindOrderCustomerByOrder");
				query.setParameter("orderNumber", ordernumber);
				return query.getResultList();
			}
			
			public void close() {
				cleanup();
			}	


}

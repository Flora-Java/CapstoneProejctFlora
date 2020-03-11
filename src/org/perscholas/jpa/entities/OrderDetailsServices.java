/**
 * File: 			OrderDetailsServices.java
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
 *         Services for OrderDetails entity, CRUD functionality (as needed)
 */

public class OrderDetailsServices extends AbstractServices {
	/**
	 * Add a new detail of an order
	 * 
	 * @param order
	 */
	public void addOrderDetails(OrderDetails orderDetails) {
		this.em.getTransaction().begin();
		this.em.persist(orderDetails);
		this.em.getTransaction().commit();
	}

	/**
	 * Get all details of an order
	 * 
	 * @return a list of all customers
	 */
	public List<OrderDetails> getAllDetails() {
		Query query = this.em.createNamedQuery("FindAllOrdersDetails");
		List<OrderDetails> odList = query.getResultList();
		Iterator var4 = odList.iterator();

		while (var4.hasNext()) {
			OrderDetails o = (OrderDetails) var4.next();
			System.out.println(o);
		}

		return odList;
	}

	/**
	 * Update info of the orderDetails
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

	public boolean updateOrderDetails(Integer id, Integer quantity, double price, String description, String sku) {

		this.em.getTransaction().begin();
		OrderDetails ordDet = (OrderDetails) this.em.find(OrderDetails.class, id);
		ordDet.setQuantity(quantity);
		ordDet.setPrice(price);
		ordDet.setDescription(description);
		ordDet.setSku(sku);
		this.em.getTransaction().commit();
		return true;
	}

	/**
	 * Delete OrderDetails by id
	 * 
	 * @param id
	 */
	public void deleteById(Integer id) {
		Query query = this.em.createNamedQuery("DeleteOrderDetailsById");
		this.em.getTransaction().begin();
		OrderDetails foundOrderDet = (OrderDetails) this.em.find(OrderDetails.class, id);
		this.em.remove(foundOrderDet);
		this.em.getTransaction().commit();

	}

	/**
	 * Get OrderDetails by id
	 * 
	 * @param id
	 * @return List<OrderDetails>
	 */
	@SuppressWarnings("unchecked")
	public List<OrderDetails> getOrderDetailsById(int id) {
		Query query = em.createNamedQuery("FindOrderDetailsByOrderId");
		query.setParameter("id", id);
		return query.getResultList();
	}

	public void close() {
		cleanup();
	}

}

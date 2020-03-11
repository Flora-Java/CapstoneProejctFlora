/**
 * File: 			CustomerServices.java
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
 * Description: 	Services for Customer entity: CRUD functionality (as needed)
 */
public class CustomerServices extends AbstractServices {

/**
 *  Add a new customer
 *  
 * @param customer
 */
	public void addCustomer(Customer customer) {
        this.em.getTransaction().begin();
        this.em.persist(customer);
        this.em.getTransaction().commit();
      
    }
	/** 
	 * Get customer by id
	 * @param id
	 * @return List<
	 */
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomerById(int id) {
		Query query = em.createNamedQuery("FindCustomerById");
		query.setParameter("id", id);
		return query.getResultList();
	}
/**
 * Get all customers
 * 
 * @return a list of all customers
 */
	public List<Customer> getAllCustomers() {
        Query query = this.em.createNamedQuery("FindAllCustomers");
        List<Customer> cList = query.getResultList();
        Iterator var4 = cList.iterator();

        while(var4.hasNext()) {
            Customer c = (Customer)var4.next();
            System.out.println(c);
        }

        return cList;
    }
/**
 * Update info of the customer
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
	
	public boolean updateCustomer(int id, String customerLastname, String street, String city, Integer zipcode,
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
 * Delete customer by Id
 * 
 * @param id
 */
	 public void deleteById(int id) {
	        Query query = this.em.createNamedQuery("DeleteById");
	        this.em.getTransaction().begin();
	        Customer foundCustomer = (Customer)this.em.find(Customer.class, id);
	        this.em.remove(foundCustomer);
	        this.em.getTransaction().commit();
	    }
	 
	 public void close() {
			cleanup();
		}	

}

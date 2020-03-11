/**
 * File: 			UserServices.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

public class UserServices extends AbstractServices {

	/**
	 * Add a new user
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		this.em.getTransaction().begin();
		this.em.persist(user);
		this.em.getTransaction().commit();
	}

	/**
	 * Get all users
	 * 
	 * @return a list of all users
	 */
	public List<User> getAllUsers() {
		Query query = this.em.createNamedQuery("FindAllUsers");
		List<User> uList = query.getResultList();
		Iterator var4 = uList.iterator();

		while (var4.hasNext()) {
			User u = (User) var4.next();
			System.out.println(u);
		}

		return uList;
	}

	/**
	 * Update info of User
	 * 
	 * @param email
	 * @param customer
	 * @param typeAcct
	 * @return boolean
	 */

	public boolean update(String email, Customer customer, String password, String typeAcct) {
		this.em.getTransaction().begin();
		User user = (User) this.em.find(User.class, email);
		user.setCustomer(customer);
		user.setPassword(password);
		user.setTypeAcct(typeAcct);
		this.em.getTransaction().commit();
		return true;
	}

	/**
	 * Delete User by email
	 * 
	 * @param email
	 */
	public void deleteUserByEmail(String email) {
		Query query = this.em.createNamedQuery("DeleteUserByEmail");
		this.em.getTransaction().begin();
		User foundUser = (User) this.em.find(User.class, email);
		this.em.remove(foundUser);
		this.em.getTransaction().commit();
	}
	/**
	 * Get user by email
	 * 
	 * @param email
	 */
	
	@SuppressWarnings("unchecked")
	public List<User> getUserByEmail(String email) {
		Query query = this.em.createNamedQuery("FindUserByEmail");
		query.setParameter("email", email);
		return query.getResultList();
	}
	public void close() {
		cleanup();
	}

}

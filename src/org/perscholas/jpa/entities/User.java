/**
 * File: 			User.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity 
@NamedQueries({
	  @NamedQuery(
	    query = "select u from User u",name = "FindAllUsers"),
	  @NamedQuery(
	    query = "select u from User u where u.email=:email",name = "FindUserByEmail"),
	  @NamedQuery(
	    query = "delete from User u WHERE u.email=:email",name = "DeleteUserByEmail")
	  })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	   
	@Id
	private String email;
	@OneToOne (targetEntity=Customer.class)
	private Customer customer;
	
	private String password;
    @Column(name = "type_account") 
	private String typeAcct;

	public User() {
		super();
	}
	
	
	/**
	 * @param email
	 * @param customer
	 * @param password
	 * @param typeAcct
	 */
	public User(String email, Customer customer, String password, String typeAcct) {
		this();
		this.setEmail(email);
		this.setCustomer(customer);
		this.setPassword(password);
		this.setTypeAcct(typeAcct);
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the typeAcct
	 */
	public String getTypeAcct() {
		return typeAcct;
	}

	/**
	 * @param typeAcct the typeAcct to set
	 */
	public void setTypeAcct(String typeAcct) {
		this.typeAcct = typeAcct;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((typeAcct == null) ? 0 : typeAcct.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (typeAcct == null) {
			if (other.typeAcct != null)
				return false;
		} else if (!typeAcct.equals(other.typeAcct))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [email=");
		builder.append(email);
		builder.append(", customer=");
		builder.append(customer);
		builder.append(", password=");
		builder.append(password);
		builder.append(", typeAcct=");
		builder.append(typeAcct);
		builder.append("]");
		return builder.toString();
	}
	
	
}

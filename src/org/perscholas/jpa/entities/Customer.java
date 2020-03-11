/**
 * File: 			Customer.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */

package org.perscholas.jpa.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Description: Entity implementation class for Entity: Customer
 *
 */
@Entity  
@NamedQueries({
	  @NamedQuery(
	    query = "select c from Customer c",name = "FindAllCustomers"),
	  @NamedQuery(
	    query = "select c from Customer c where c.id=:id",name = "FindCustomerById"),
	  @NamedQuery(
	    query = "delete from Customer c WHERE c.id=:id",name = "DeleteById")
	  })

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	    
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
    @Column(name = "first_name")
	private String customerName;
    @Column(name = "last_name")
    private String customerLastname;
	private String street;
	private String city;
	private Integer zipcode;
	private String state;
	private String telephone;
	@OneToMany(targetEntity=OrderCustomer.class)
	private List<OrderCustomer> orderCustomerList;
	
	public Customer() {
		super();
	}
	
	

	/**
	 * @param id
	 * @param customerName
	 * @param customerLastname
	 * @param street
	 * @param city
	 * @param zipcode
	 * @param state
	 * @param telephone
	 * @param orderCustomerList
	 */
	public Customer(String customerName, String customerLastname, String street, String city,
			Integer zipcode, String state, String telephone, List<OrderCustomer> orderCustomerList) {
		this();
		this.setCustomerName(customerName);
		this.setCustomerLastname(customerLastname);
		this.setStreet(street);
		this.setCity(city);
		this.setZipcode(zipcode);
		this.setState(state);
		this.setTelephone(telephone);
		this.setOrderCustomerList(orderCustomerList);
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerLastname
	 * 
	 */
	public String getCustomerLastname() {
		return customerLastname;
	}

	/**
	 * @param customerLastname the customerLastname to set
	 */
	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */
	public Integer getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the orderCustomerList
	 */
	public List<OrderCustomer> getOrderCustomerList() {
		return orderCustomerList;
	}

	/**
	 * @param orderCustomerList the orderCustomerList to set
	 */
	public void setOrderCustomerList(List<OrderCustomer> orderCustomerList) {
		this.orderCustomerList = orderCustomerList;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((customerLastname == null) ? 0 : customerLastname.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderCustomerList == null) ? 0 : orderCustomerList.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
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
		Customer other = (Customer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (customerLastname == null) {
			if (other.customerLastname != null)
				return false;
		} else if (!customerLastname.equals(other.customerLastname))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderCustomerList == null) {
			if (other.orderCustomerList != null)
				return false;
		} else if (!orderCustomerList.equals(other.orderCustomerList))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerLastname=");
		builder.append(customerLastname);
		builder.append(", street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append(", state=");
		builder.append(state);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", orderCustomerList=");
		builder.append(orderCustomerList);
		builder.append("]");
		return builder.toString();
	}  
	
	
   
}

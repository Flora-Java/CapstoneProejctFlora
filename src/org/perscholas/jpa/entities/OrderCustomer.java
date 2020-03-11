/**
 * File: 			OrderCustomer.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderCustomer
 *
 */
@Entity 
@NamedQueries({
	  @NamedQuery(
	    query = "select o from OrderCustomer o",name = "FindAllOrders"),
	  @NamedQuery(
	    query = "select o from OrderCustomer o where o.orderNumber=:orderNumber",name = "FindOrderCustomerByOrder"),
	  @NamedQuery(
	    query = "delete from OrderCustomer o WHERE o.orderNumber=:orderNumber",name = "DeleteByOrder")
	  })

public class OrderCustomer implements Serializable {
	private static final long serialVersionUID = 1L;
   
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "order_number")
	private Integer orderNumber;
	private double total;
    @Column(name = "order_date")
	private String orderDate;
	@OneToMany(targetEntity=OrderDetails.class, cascade=CascadeType.REMOVE) 
	private List<OrderDetails> orderdetailsList;

	public OrderCustomer() {
		super();
	}

	
	/**
	 * @param orderNumber
	 * @param total
	 * @param orderDate
	 * @param orderdetailsList
	 */
	public OrderCustomer(double total, String orderDate,
			List<OrderDetails> orderdetailsList) {
		this();
		this.setTotal(total);
		this.setOrderDate(orderDate);
		this.setOrderdetailsList(orderdetailsList);
	}


	/**
	 * @return the orderNumber
	 */
	public Integer getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}


	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderdetailsList
	 */
	public List<OrderDetails> getOrderdetailsList() {
		return orderdetailsList;
	}

	/**
	 * @param orderdetailsList the orderdetailsList to set
	 */
	public void setOrderdetailsList(List<OrderDetails> orderdetailsList) {
		this.orderdetailsList = orderdetailsList;
	}

	
	/** 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((orderdetailsList == null) ? 0 : orderdetailsList.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		OrderCustomer other = (OrderCustomer) obj;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		if (orderdetailsList == null) {
			if (other.orderdetailsList != null)
				return false;
		} else if (!orderdetailsList.equals(other.orderdetailsList))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderCustomer [orderNumber=" + orderNumber + ", total=" + total 
				+ ", orderDate=" + orderDate + ", orderdetailsList=" + orderdetailsList + "]";
	} 
	
	
   
}

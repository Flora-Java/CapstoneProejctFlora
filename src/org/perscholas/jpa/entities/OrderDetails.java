/**
 * File: 			OrderDetails.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */package org.perscholas.jpa.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderDetails
 *
 */
@Entity 
@NamedQueries({
	  @NamedQuery(
	    query = "select o from OrderDetails o",name = "FindAllOrdersDetails"),
	  @NamedQuery(
	    query = "select o from OrderDetails o where o.id=:id",name = "FindOrderDetailsByOrderId"),
	  @NamedQuery(
	    query = "delete from OrderDetails o WHERE o.id=:id",name = "DeleteOrderDetailsById")
	  })
public class OrderDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	   
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private Integer quantity;
	private double price;
	private String description;
	private String sku;

	
	public OrderDetails() {
		super();
	}


	/**
	 * @param id
	 * @param quantity
	 * @param price
	 * @param description
	 * @param sku
	 */
	public OrderDetails(Integer quantity, double price, String description, String sku) {
		this();
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setDescription(description);
		this.setSku(sku);
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}


	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
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
		OrderDetails other = (OrderDetails) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderDetails [id=");
		builder.append(id);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append(", description=");
		builder.append(description);
		builder.append(", sku=");
		builder.append(sku);
		builder.append("]");
		return builder.toString();
	} 
	
	
}

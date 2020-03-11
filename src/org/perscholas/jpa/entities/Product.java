/**
 * File: 			Product.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */
package org.perscholas.jpa.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity 
@NamedQueries({
	  @NamedQuery(
	    query = "select p from Product p",name = "FindAllProducts"),
	  @NamedQuery(
	    query = "select p from Product p where p.productId=:productId",name = "FindProductByProductId"),
	  @NamedQuery(
	    query = "delete from Product p WHERE p.productId=:productId",name = "DeleteByProductId")
	  })

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer productId;
	private double price;
	private Integer inventory;
	private String description;
    @Column(name = "image_url") 
	private String imageUrl;
    @Column(name = "type_product")
	private String typeProd;
	

	public Product() {
		super();
	}


	
	/**
	 * @param productId
	 * @param price
	 * @param inventory
	 * @param description
	 * @param imageUrl
	 * @param typeProd
	 */
	public Product(double price, Integer inventory, String description, String imageUrl,
			String typeProd) {
		this();
		this.setPrice(price);
		this.setInventory(inventory);
		this.setDescription(description);
		this.setImageUrl(imageUrl);
		this.setTypeProd(typeProd);
	}



	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}


	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
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
	 * @return the inventory
	 */
	public Integer getInventory() {
		return inventory;
	}


	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
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
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}


	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	/**
	 * @return the typeProd
	 */
	public String getTypeProd() {
		return typeProd;
	}


	/**
	 * @param typeProd the typeProd to set
	 */
	public void setTypeProd(String typeProd) {
		this.typeProd = typeProd;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((inventory == null) ? 0 : inventory.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((typeProd == null) ? 0 : typeProd.hashCode());
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
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (inventory == null) {
			if (other.inventory != null)
				return false;
		} else if (!inventory.equals(other.inventory))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (typeProd == null) {
			if (other.typeProd != null)
				return false;
		} else if (!typeProd.equals(other.typeProd))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", price=");
		builder.append(price);
		builder.append(", inventory=");
		builder.append(inventory);
		builder.append(", description=");
		builder.append(description);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", typeProd=");
		builder.append(typeProd);
		builder.append("]");
		return builder.toString();
	}

   
}

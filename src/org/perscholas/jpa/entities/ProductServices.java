/**
 * File: 			ProductServices.java
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
 *         Services for Product entity, CRUD functionality (as needed)
 */
public class ProductServices extends AbstractServices {
	/**
	 * Add a product
	 * 
	 * @param product
	 */
	public void addProduct(Product product) {
		this.em.getTransaction().begin();
		this.em.persist(product);
		this.em.getTransaction().commit();
	}

	/**
	 * Get all products
	 * 
	 * @return a list of all products
	 */
	public List<Product> getAllProducts() {
		Query query = this.em.createNamedQuery("FindAllProducts");
		List<Product> pList = query.getResultList();
		Iterator var4 = pList.iterator();

		while (var4.hasNext()) {
			Product p = (Product) var4.next();
			System.out.println(p);
		}

		return pList;
	}

	/**
	 * Update info of a Product
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

	public boolean updateProduct(Integer productId, double price, Integer inventory, String description,
			String imageUrl, String typeProd) {
		this.em.getTransaction().begin();
		Product product = (Product) this.em.find(Product.class, productId);
		product.setPrice(price);
		product.setInventory(inventory);
		product.setDescription(description);
		product.setImageUrl(imageUrl);
		product.setTypeProd(typeProd);
		this.em.getTransaction().commit();
		return true;
	}

	/**
	 * Delete Product by productId
	 * 
	 * @param productId
	 */
	public void deleteByProductId(Integer productId) {
		Query query = this.em.createNamedQuery("DeleteByProductId");
		this.em.getTransaction().begin();
		Product product = (Product) this.em.find(Product.class, productId);
		this.em.remove(product);
		this.em.getTransaction().commit();

	}
	/**
	 * Get product by Id
	 * 
	 * @param productId
	 */

	@SuppressWarnings("unchecked")
	public List<Product> getProductById(Integer productId) {
		Query query = this.em.createNamedQuery("FindProductByProductId");
		query.setParameter("productId", productId);
		return query.getResultList();
	}
	
	public void close() {
		cleanup();
	}

}

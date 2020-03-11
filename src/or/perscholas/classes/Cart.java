package or.perscholas.classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Cart {

	private String description;
	private double price;
	private Integer quantity;
	private double total;
	private String sku; // product Id
	
	
	/**
	 * 
	 */
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param description
	 * @param price
	 * @param quantity
	 * @param total
	 * @param sku
	 */
	public Cart(String description, double price, Integer quantity, double total, String sku) {
		this();
		this.setDescription(description);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setTotal(total);
		this.setSku(sku);
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
		result = prime * result + ((em == null) ? 0 : em.hashCode());
		result = prime * result + ((emf == null) ? 0 : emf.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
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
		Cart other = (Cart) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (em == null) {
			if (other.em != null)
				return false;
		} else if (!em.equals(other.em))
			return false;
		if (emf == null) {
			if (other.emf != null)
				return false;
		} else if (!emf.equals(other.emf))
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
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", total=");
		builder.append(total);
		builder.append(", sku=");
		builder.append(sku);
		builder.append(", emf=");
		builder.append(emf);
		builder.append(", em=");
		builder.append(em);
		builder.append("]");
		return builder.toString();
	}



	protected EntityManagerFactory emf;
	protected EntityManager em;
	
	public void addCustomerOrder(Cart cart) {
		emf = Persistence.createEntityManagerFactory("CaseStudyFlora");
		em = emf.createEntityManager();
		
		
		em.close();
		emf.close();
	}
	
	public void addOrderDetail(Cart cart, Integer prodId) {
		emf = Persistence.createEntityManagerFactory("CaseStudyFlora");
		em = emf.createEntityManager();
		
		em.close();
		emf.close();
	}
	
	
}

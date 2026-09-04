package object_methods;

import java.util.Objects;

public class Product {
	private String productId;
	private String description;
	private float price;
	
	public Product() {
		
	}
	public Product(String productId, String description, float price) {
		super();
		this.productId = productId;
		this.description = description;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + 
				", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, price, productId);
	}
	@Override
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(productId, other.productId);
	}
}

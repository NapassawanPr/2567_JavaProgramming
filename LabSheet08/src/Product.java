
public class Product {

	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setId(String pid) {
		productId = pid;
	}
	
	public String getId() {
		return this.productId;
		}

	public void setUnit(int proUnit) {
		this.productUnit = proUnit;
	}

	public int getUnit() {
		return this.productUnit;
	}

	public void setPrice(double proPrice) {
		this.productPrice = proPrice;
	}

	public double getPrice() {
		return this.productPrice;
	}

	public double calculate() {
		return this.productUnit * this.productPrice;
	}
		

}

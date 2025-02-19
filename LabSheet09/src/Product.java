
public class Product {
	protected int unit;

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getUnit() {
		return this.unit;
	}

	public int getTotalPrice() {
		return this.unit * 100;
	}
	

	@Override
	public String toString() {
		return "You buy " + this.unit + " units (" + getTotalPrice() + ").";
	}
	
}

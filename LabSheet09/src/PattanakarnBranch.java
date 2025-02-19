
public class PattanakarnBranch extends Product {
	public int payUnit() {
		return this.unit;
	}

	public int freeUnit() {
		return this.unit;
	}

	@Override
	public int getTotalPrice() {
		return this.unit * 100;
	}

	@Override
	public String toString() {
		return "You buy " + payUnit() + " units, get free " + freeUnit() + " units (" + getTotalPrice() + ").";
	}

}


class Coffee extends Drink {
	private int typeCoffee;
	private char sizeCoffee;

	public Coffee(int type, int typeCoffee, char sizeCoffee) {
		super(type, sizeCoffee);
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = sizeCoffee;
	}

	Coffee(int type, int typeCoffee) {
		super(type);
		this.typeCoffee = typeCoffee;

	}

	public String getTypeName() {
		if (typeCoffee == 1) {
			return "Americano";
		} else if (typeCoffee == 2) {
			return "Espresso";
		} else if (typeCoffee == 3) {
			return "Cappuccino";
		} else {
			return null;
		}
	}

	public int getTypePrice() {
		if (typeCoffee == 1) {
			return 50;
		} else if (typeCoffee == 2) {
			return 55;
		} else if (typeCoffee == 3) {
			return 65;
		} else {
			return 0;
		}
	}

	public String getSizeName() {
		if (sizeCoffee == 's' || sizeCoffee == 'S') {
			return "Short";
		} else if (sizeCoffee == 't' || sizeCoffee == 'T') {
			return "Tall";
		} else if (sizeCoffee == 'g' || sizeCoffee == 'G') {
			return "Grande";
		} else if (sizeCoffee == 'v' || sizeCoffee == 'V') {
			return "Venti";
		} else {
			return null;
		}
	}

	public int getSizePrice() {
		if (sizeCoffee == 's' || sizeCoffee == 'S') {
			return 100;
		} else if (sizeCoffee == 't' || sizeCoffee == 'T') {
			return 150;
		} else if (sizeCoffee == 'g' || sizeCoffee == 'G') {
			return 200;
		} else if (sizeCoffee == 'v' || sizeCoffee == 'V') {
			return 250;
		} else {
			return 0;
		}
	}

	public int getTotalPrice() {
		return super.getTypePrice() + getTypePrice() + getSizePrice();
	}

	@Override
	public String toString() {
		return super.getTypeName() + " " + getTypeName() + " (" + getSizeName() + ") is " + getTotalPrice() + " baht";
	}
}



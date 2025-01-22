
public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println(car);
		System.out.println();
		System.out.println("Updated Car Details: ");
		car.setCompanyName("Toyota");
		car.setModelName("Coralla");
		car.setYear(2015);
		System.out.println(car);
		
		car.setYear(1800);
		car.setCompanyName(null);
		
	}

}

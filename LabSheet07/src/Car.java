
public class Car {

	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car() {
		/*companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;*/
		this("Unknown","Unknown",2000,0.0);
	}
	
	Car(String companyName, String modelName, int year, double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีที่ผลิต 2000 หากใส่ค่าไม่ถูกต้อง
		this.year = year < 1886 ? 2000 : year;
		this.mileage = mileage;
	}
	
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		} else {
			System.out.println("Error: Invalid company or model name!");
			
		}
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		} else {
			
			System.out.println("Error: Invalid company or model name!");
		}
	}
	
	public void setYear(int year) {
		if(year<1886) {
			System.out.println("Error: Invalid year!");
		} else {
			this.year = year;
		}
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getMilege() {
		return this.mileage;
	}
	
	
	public String toString() {
		return "Company Name: " + this.companyName + "\nModel Name: " + this.modelName + "\nYear: " + this.year + "\nMileage: " + mileage;		
	}
	
}

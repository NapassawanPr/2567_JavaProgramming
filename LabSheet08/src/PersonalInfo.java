
public class PersonalInfo {

	private Person name;
	private Date bDay;
	private int personID;

	public PersonalInfo() {
		this.name = new Person();
		this.bDay = new Date();
		this.personID = 0;
	}

	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		this.name = new Person(first, last);
		this.bDay = new Date(month, day, year);
		this.personID = ID;
	}

	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		this.name.setName(first, last);
		this.bDay.setDate(month, day, year);
		this.personID = ID;
	}

	public String toString() {
		return "Name: " + this.name + "\n" + "Date of birth: " + this.bDay + "\n" + "Personal ID: " + this.personID;
	}

}

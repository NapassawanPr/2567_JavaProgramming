
public class Person {
	private String firstName;
	private String lastName;

	public Person() {
		this.firstName = "";
		this.lastName = "";
	}

	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public void setName(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}

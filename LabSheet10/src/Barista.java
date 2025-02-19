
public class Barista {
	private String name;
	private char gender;

	Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	Barista() {

	}
	public String getName() {
		return name;
	}

	public String getGenderName() {
		if(gender=='m' || gender =='M') {
			return "Male";
		}
		else if(gender=='f' || gender == 'F') {
			return "Female";
		}
		else {
			return " ";
		}
	
	}
	

}

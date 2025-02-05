
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	public Date() {
		this.dMonth = 1;
		this.dDay = 1;
		this.dYear = 2000;
	}

	public Date(int month, int day, int year) {
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}

	public void setDate(int month, int day, int year) {
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}

	public int getMonth() {
		return this.dMonth;
	}

	public int getDay() {
		return this.dDay;
	}

	public int getYear() {
		return this.dYear;
	}

	public String toString() {
		return this.dMonth + "-" + this.dDay + "-" + this.dYear;
	}
}

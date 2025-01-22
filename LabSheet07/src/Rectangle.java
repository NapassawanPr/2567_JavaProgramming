
public class Rectangle {

	/*private float length;
	private float width;
	
	// Default Constructor
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}*/
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	Rectangle() {}
	
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return this.length;
	}
	public float getWidth() {
		return this.width;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//Method to calculate area
	public double getArea() {
		return this.length*this.width;
	}
	//Method to calculate perimeter
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	
	//Method to display data
	public String showData() {
		return "Recangle[length = " + this.length + ",width = " + this.width + "]";
		
	}
	
	//Method to display using toString()
	public String toString() {
		return "Recangle[length = " + this.length + ",width = " + this.width + "]";
		
	}
}


public class TestResizeableCircle {

	public static void main(String[] args) {
		ResizeableCircle rc = new ResizeableCircle(10.0);
		System.out.println(rc);
		System.out.printf("Perimeter: %.2f%n" , rc.getPerimeter());
		System.out.printf("Area: %.2f%n" , rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("After resize(50%) : " + rc);
		System.out.printf("Perimeter: %.2f%n" , rc.getPerimeter());
		System.out.printf("Area: %.2f" , rc.getArea());
	
	}
	
	public static void Line() {
		for(int i=1; i< 50 ; i++) 
			System.out.print("*");
		System.out.println();
	}
}

public class Circle extends A implements Shape {
	private double a;

	public void findArea() {
		a = 3.14 * 5 * 5;
	}

	public void printArea() {
		System.out.println("Circle's Area: " + a);
		show();
	}

}

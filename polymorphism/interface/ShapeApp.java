
public class ShapeApp {

	public static void main(String[] args) {
		Shape s;
		s=new Circle();
		s. findArea();
		s. printArea();
		s=new Rectangle();
		s. findArea();
		s. printArea();
		s=new Triangle();
		s. findArea();
		s. printArea();
		s=new Square();
		s.findArea();
		s.printArea();
		
		//or
		
		Shape s1=new Circle();
		s1.findArea();
		s1.printArea();
		Shape s2=new Rectangle();
		s2.findArea();
		s2.printArea();
		Shape s3=new Triangle();
		s3.findArea();
		s3.printArea();
		Shape s4=new Square();
		s4.findArea();
		s4.printArea();
	}

}

class X{
	int a=10;
	X(int x) {
		a=x;
		System.out.println("Hello X");
	}
	X() {
		System.out.println("Hi X");
	}
}
class Y extends X {
	int b=20;
	Y() { super(5);
		System.out.println("Hi Y");
	}
}
public class InheritanceWithConstructorEx3 {
	public static void main(String[] args) {
		Y y=new Y();
		System.out.println(y.a+" "+y.b);
	}
}

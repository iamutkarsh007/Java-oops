class XX{
	private void m1() {
//	private final void m1() { //allowed
		System.out.println("Hello A");
	}
	private final static void m2() {
//	private final static void m2() { //allowed
		System.out.println("OK A");
	}
}
class YY extends XX{ 
	void m1() {
		System.out.println("Hello B");
	}
	static void m2() { 
		System.out.println("OK A");
	}
}
public class PrivateMethodEx {
	public static void main(String[] args) {
		YY y=new YY();
		y.m1();
		y.m2();
	}
}

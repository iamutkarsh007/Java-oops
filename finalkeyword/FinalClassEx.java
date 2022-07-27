final class A{
	void m1() {
		System.out.println("Hello A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}
//class B extends A{ //error
class B {
	void m1() {
		System.out.println("Hello B");
	}
	void m2() {
		System.out.println("Hi B");
	}
}
public class FinalClassEx {
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		B b=new B();
		b.m1();
		b.m2();
	}
}

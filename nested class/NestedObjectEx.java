class A{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
}
class B{
	int y=10;
	void m2() {
		System.out.println("Hello B");
	}
}
class C{
	int z=30;
	A a=new A();
	//a.m1();//error(because ONLY Declaration allowed)
	B b=new B();
	void m3() {
		System.out.println("Hello C");
		System.out.println(z);
		//System.out.println(x);//error
		System.out.println(a.x);
		a.m1();
		System.out.println(b.y);
		b.m2();
	}
}
public class NestedObjectEx {
	public static void main(String[] args) {
		C c=new C();
		System.out.println(c.z);
		c.m3();
		//System.out.println(c.x);//error
		System.out.println(c.a.x);
		c.a.m1();
		System.out.println(c.b.y);
		c.b.m2();
		
	}
}

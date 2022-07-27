class AA{
	final void m1() {
		System.out.println("Hello A");
	}
	final static void m() {
		System.out.println("OK A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}
class BB extends AA{ 
//	void m1() { //error
//		System.out.println("Hello B");
//	}
//	static void m() { //error
//		System.out.println("OK A");
//	}
	void m2() {
		System.out.println("Hi B");
	}
}
public class FinalMethodEx {
	public static void main(String[] args) {
		AA.m();
		BB.m();
		AA a=new BB();
		a.m1();
		a.m2();
	}
}

interface A{
	int k=15;
	void m();
	default public void xyz() {
		System.out.println("XYZ A");
		pqr();
		mno();
	}
	static void abc() {
		System.out.println("ABC A");
		//pqr();//error
		mno();
	}
	private void pqr() {
		System.out.println("PQR");
	}
	private static void mno() {
		System.out.println("MNO");
	}
}
interface D{
	void m();
	default void xyz() {
		System.out.println("XYZ D");
	}
	static void abc() {
		System.out.println("ABC D");
	}
}
class B{
	public void xyz() {
		System.out.println("Hello B");
	}
}
class X extends B  implements A,D{
	public void m() {
		System.out.println("Hello X");
	}
}
class Y implements A{
	public void m() {
		System.out.println("Hello X");
		System.out.println(k);
		//abc();//error
		A.abc();
	}
}
public class DefaultStaticPrivateMethodEx {
	public static void main(String[] args) {
		A.abc();
		//X.abc();//error
		System.out.println(A.k);
		System.out.println(X.k);
		X x=new X();
		x.m();
		x.xyz();
		Y y=new Y();
		y.xyz();
	}

}

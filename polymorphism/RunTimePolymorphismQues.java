class AA{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
	static void m2() {
		System.out.println("Hi A");
	}
}
class BB extends AA{
	int x=20;
	void m1() {
		System.out.println("Hello B");
	}
	static void m2() {
		System.out.println("Hi B");
	}
	void m3() {
		System.out.println("Incapp");
	}
}
public class RunTimePolymorphismQues {
	public static void main(String[] args) {
		AA a=new AA();
		System.out.println(a.x);
		a.m1();
		a.m2();
		AA a2=new BB();
		System.out.println(a2.x);
		a2.m1();
		a2.m2();
		//a2.m3();//error
		BB b=new BB();
		System.out.println(b.x);
		b.m1();
		b.m2();
		b.m3();
	}
}

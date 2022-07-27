class AAA{
	final int x=10;//class level variable(Non-Static/instance variable)
	final static int z=20;//class level variable(Static/class variable)
	void m1() {
		System.out.println("Hello A");
		//x=40;//error
		System.out.println(x);
		//z=40;//error
		System.out.println(z);
		final int y=25;//local variable
		//y=9;//error
		System.out.println(y);
	}
	void m2() {
		//System.out.println(y);//error
		System.out.println(x);
		System.out.println(z);
	}
}
public class FinalVariableEx {
	public static void main(String[] args) {
		//AAA.z=90;//error
		System.out.println(AAA.z);
		AAA a=new AAA();
		//a.x=30;//error
		System.out.println(a.x);
		a.m1();
	}
}

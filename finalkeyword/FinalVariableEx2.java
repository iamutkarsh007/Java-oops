class AAAA{
	//final int x;//error
	int x;
	void m1() {
		int y;//local variable
		System.out.println(x);
		//System.out.println(y);//error
	}
	void m2() {
		//System.out.println(y);//error
	}
}
public class FinalVariableEx2 {
	public static void main(String[] args) {
		AAAA a=new AAAA();
		System.out.println(a.x);
		a.x=90;
		System.out.println(a.x);
		//System.out.println(a.y);//error
		a.m1();
	}
}

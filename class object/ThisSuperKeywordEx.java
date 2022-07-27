class C{
	int x=10;
	void print() {
		System.out.println("Hello C");
	}
}
class D extends C {
	int x=50;
	int y=20;
	void m() {
		int z=40;
		int x=90;
		System.out.println(x);//90
		System.out.println(this.x);//50
		System.out.println(super.x);//10
		System.out.println(y);//20
		System.out.println(this.y);//20
		System.out.println(z);//40
		print();//Hello D
		super.print();//Hello C
	}
	void print() {
		System.out.println("Hello D");
	}
}
public class ThisSuperKeywordEx {
	public static void main(String[] args) {
		D d=new D();
		d.m();
		System.out.println(d.x);//50
		//System.out.println(d.super.x);//error
		System.out.println(d.y);//20
		//System.out.println(d.z);//error
		C c=new C();
		System.out.println(c.x);//10
	}
}

class M {
	int a=10;
	M(int x) { this();
		a=x;
		System.out.println("Hello M");
	}
	M() {
		System.out.println("Hi M");
	}
}
class N extends M {
	int b=20;
	N() { super(5);
		System.out.println("Hi N");
	}
}
public class InheritanceWithConstructorEx4 {
	public static void main(String[] args) {
		N n=new N();
		System.out.println(n.a+" "+n.b);
	}
}

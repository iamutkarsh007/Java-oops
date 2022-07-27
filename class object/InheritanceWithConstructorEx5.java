class MM{
	int a=10;
	MM(int x) { this();
		a=x;
		System.out.println("Hello M");
	}
	MM() {
		System.out.println("Hi M");
	}
}
class NN extends MM {
	int b=20;
	NN() { super(8);
		System.out.println("Hi N");
	}
	NN(int y) { this();
		b=y;
		System.out.println("Hello N");
	}
}
public class InheritanceWithConstructorEx5 {
	public static void main(String[] args) {
		NN n=new NN(5);
		System.out.println(n.a+" "+n.b);
	}
}

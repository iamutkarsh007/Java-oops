class MMM{
	int a=10;
	MMM(int x) { 
		a=x;
		System.out.println("Hello M");
	}
	MMM() {
		System.out.println("Hi M");
	}
}
class NNN extends MMM {
	int b=20;
	NNN() {  
		System.out.println("Hi N");
	}
	NNN(int y) { 
		b=y;
		System.out.println("Hello N");
	}
}
public class InheritanceWithConstructorEx6 {
	public static void main(String[] args) {
		NNN n=new NNN(5);
		System.out.println(n.a+" "+n.b);
	}
}

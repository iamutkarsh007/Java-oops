class AAAAA{
	int x=10;
	AAAAA(int a) {
		x=a;
		System.out.println("Hi A");
	}
}
class BBBBB extends AAAAA {
	int y=20;
//	BBBBB() {   //error
//		System.out.println("Hi B");
//	}
	BBBBB() { super(15);
		System.out.println("Hi B");
	}
}
public class InheritanceWithConstructorEx2 {
	public static void main(String[] args) {
		BBBBB b1=new BBBBB();
		System.out.println(b1.x+" "+b1.y);
	}
}

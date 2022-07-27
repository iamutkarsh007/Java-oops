class Xyz{
	void m1() {
		System.out.println("Hello XYZ");
	}
	void m2() {
		System.out.println("Hi XYZ");
	}
}
interface Abc{
	void m1();
	void m2();
}
public class AnonymousNestedClassEx {
	public static void main(String[] args) {
		//without Anonymous Class  
//		class B extends Xyz{
//			void m1() {
//				System.out.println("Hello");
//			}
//			void m2() {
//				System.out.println();
//			}
//		}
//		Xyz x=new B();
//		x.m1();
//		x.m2();
		
		Xyz x=new Xyz(){
			void m1() {
				System.out.println("Hello");
			}
			void m2() {
				System.out.println("Hi");
			}
		};
		x.m1();
		x.m2();
		
		Abc a=new Abc() {

			@Override
			public void m1() {
				System.out.println("hjrgfhj");
			}

			@Override
			public void m2() {
				System.out.println("hoigoiohoiiohoih");
			}
			
		} ;
		a.m1();
		a.m2();
	}
}

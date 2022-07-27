interface AA{
	void m();
	default void nn() {
		System.out.println("Hi A");
	}
}
interface BB {
	void m();
	default void nn() {
		System.out.println("Hi B");
	}
}
class PP{
	public void nn() {
		System.out.println("Hi B");
	}
}
class DD extends PP implements AA,BB{
	
	@Override
	public void m() {
		System.out.println("Hello D");
	}
}
public class MultipleInterfaceInheritanceEx {
	public static void main(String[] args) {
		AA a=new DD();
		a.m();
		a.nn();
		BB b=new DD();
		b.m();
		b.nn();
	}
}

public class StaticMethodEx2 {
	int x=90;
	static int y=90;
	public static void main(String[] args) {
		System.out.println(y);//allowed
		//System.out.println(x);//error
		StaticMethodEx2 s=new StaticMethodEx2();
		System.out.println(s.x);
	}
}

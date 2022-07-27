class P{
	int x=10;
	void print(int x) {
		System.out.println(x);
		System.out.println("Hello" +x);
	}
}
public class ThisSuperKeywordEx2 {
	public static void main(String[] args) {
		P p=new P();
		p.print(40);
		System.out.println(p.x);
	}
}

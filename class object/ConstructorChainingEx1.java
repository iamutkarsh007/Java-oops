class Bird{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Bird(String n,int a){
		this();
		System.out.println("Hello Bird");
		name=n;
		age=a;
	}
	Bird(){
		System.out.println("Hi Bird");
	}
}
public class ConstructorChainingEx1 {
	public static void main(String[] args) {
		Bird b1=new Bird("Gogo",5);
		b1.show();
	}
}

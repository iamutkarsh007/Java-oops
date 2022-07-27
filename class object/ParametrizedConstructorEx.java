class Human{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Human(String n,int a){
		System.out.println("Hi Human");
		name=n;
		age=a;
	}
}
public class ParametrizedConstructorEx {
	public static void main(String[] args) {
		Human p1=new Human("Gogo",45);
		Human p2=new Human("Yoyo",56);
		Human p3=new Human("Jojo",12);
		//Human p4=new Human();//error
		p1.show();
		p2.show();
		p3.show();
	}
}

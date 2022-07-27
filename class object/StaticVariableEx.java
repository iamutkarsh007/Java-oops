class Employee{
	String name;
	int salary;
	static String cname="ABC";
	void show() {				
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class StaticVariableEx {
	public static void main(String[] args) {
		System.out.println(Employee.cname);
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		//a.cname="XYZ"; //allowed
		Employee.cname="XYZ"; //allowed
		//Employee.name="KK";//error
		
		a.input("Yoyo Gupta", 78000);
		b.input("Teja Khan", 90000 );
		c.input("Kaliya", 6300);
		d.input("Rajnikant", 10000000);

		a.show();
		b.show();
		c.show();
		d.show();
	}
}

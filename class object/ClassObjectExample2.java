class Emp{
	String name;
	int salary;
	String cname;
	void show() {
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectExample2 {
	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.input("Yoyo Gupta",89000, "ABC");
		b.input("Teja Singh",65000, "XYZ");
		c.input("Cheetah Khan",783000, "PQR");
		d.input("Lalu Kumar",21, "JAIL");
		
		//show();//error
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
	}
}

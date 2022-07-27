class Empppp{
	String name;
	int salary;
	String cname;
	void show() {
		System.out.println(name+" "+salary+" "+cname);
	}
	void input() {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter Company Name: ");
		cname=sc.next();
	}
}
public class ClassObjectExample22 {
	public static void main(String[] args) {
		Empppp a=new Empppp();
		Empppp b=new Empppp();
		Empppp c=new Empppp();
		Empppp d=new Empppp();
		
		a.input();
		b.input();
		c.input();
		d.input();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
	}
}

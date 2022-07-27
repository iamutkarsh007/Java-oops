
public class ClassObjectExample1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		//System.out.println(name);//error
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Yoyo Gupta";
		a.salary=78000;
		a.cname="ABC";
		
		b.name="Pyaare Lal";
		b.salary=89000;
		b.cname="XYZ";
		
		c.name="Cheetah Khan";
		c.salary=105000;
		c.cname="PQR";
		
		d.name="Teja Singh";
		d.salary=76000;
		d.cname="MNO";
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Sum: "+total);
	}
}
class Employee{
	String name;
	int salary;
	String cname;
}
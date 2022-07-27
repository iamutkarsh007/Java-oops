class Animal{
	void eat() {
		System.out.println("Animal's Eat");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog's Eat");
	}
}
class Elephant extends Animal{
	void eat() {
		System.out.println("Elephant's Eat");
	}
}
public class RunTimePolymorphismEx {
	public static void main(String[] args) {
		
		Animal a1=new Animal();
		a1.eat();
		Animal a2=new Dog();
		a2.eat();
		Animal a3=new Elephant();
		a3.eat();
	}
}

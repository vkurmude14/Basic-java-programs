package oops.packages.Inheritance;

public class Teacher extends Person {
	public void teach() {
		System.out.println(name+" is teaching");
	}
	public void eat() {
		super.eat();
		System.out.println("teacher "+name+" is eating");
	}

}

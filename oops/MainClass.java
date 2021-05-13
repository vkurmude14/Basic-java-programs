package oops;
class Cat{
	String color,breed;
	boolean hasFur;
	int legs , eyes;
	public void walk() {
		System.out.println("Cat is Walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat is "+breed+" "+color+" colored having "+legs+" legs and "+eyes+" eyes");
	}
}
class Dog{
	String breed,name;
	boolean hasFur;
	int legs , eyes;
	public void walk() {
		System.out.println("Dog is Walking");
	}
	public void jump() {
		System.out.println("My Dog  "+name+" jumped");
	}
	public void description() {
		System.out.println("my Dog name is "+name+" and its breed is  "+breed);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		Cat cat1= new Cat();
		Cat cat2= new Cat();
		Dog Moti=new Dog();
		Dog Bruno=new Dog();
//		cat1.legs=3;
//		cat1.eyes=2;
//		cat1.breed="Gavran";
//		cat2.breed="foreign";
//		cat1.color="Red";
//		cat2.color="Blue";
//		cat2.legs=4;
//		cat2.eyes=3;
//		dog
//		cat1.description();
//		cat2.description();
		Moti.breed="Germen Sheferd";
		Moti.name="Moti";
		Bruno.breed="Rot viller";
		Bruno.name="Bruno";
		Moti.jump();
		Moti.description();
		Bruno.jump();
		Bruno.description();
		
		
		// TODO Auto-generated method stub

	}

}

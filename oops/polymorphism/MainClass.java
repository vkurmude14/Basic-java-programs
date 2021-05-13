package oops.polymorphism;

public class MainClass {
	public static void main(String[] args) {
		
		
		Dog d=new Dog();
		Pet p= d;
		Animal a=p;
		d.walk();
		p.walk();
		//a.walk();
		System.out.println(d.name);
		System.out.println(p.name);
//		greetings();
//		greetings("I am vinit Kurmude");
//		greetings("I am vinit Kurmude 2.0",2);
	}
		public static void greetings() {
			System.out.println("Hi,There");
		}
		public static void greetings(String s) {
			System.out.println(s);
		}
		public static void greetings(String s,int age) {
			for (int i=0;i<age;i++) {
				System.out.println(s);
			}
			
		}
	

}

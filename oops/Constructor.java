package oops;
class Vehicle{
	int wheels;
	int headlights;
	String color;
	Vehicle(int wheels,int noOfH){
		this.wheels=wheels;
		headlights=noOfH;
		
	}
	Vehicle (int wheel,int noOfH,String color){
		this.wheels=wheels;
		headlights=noOfH;
		this.color=color;
		
		
	}
}

public class Constructor {
	Constructor(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car= new Vehicle(929,45);
		Vehicle scooty= new Vehicle(929,45,"Red");
		System.out.println(car.wheels);
		System.out.println(car.headlights);
		System.out.println(scooty.color);
		

	}

}

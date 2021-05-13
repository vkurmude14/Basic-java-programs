package oops.Abstraction;

public class RepairShop {
	public static void repairCar(Car car) {
		System.out.println("car is repaired");
		
	}
	public static void main(String[] args) {
		WagonR wagonR=new WagonR();
		Hyundai hyundai =new Hyundai();
		repairCar(wagonR);
		repairCar(hyundai);

	}

}

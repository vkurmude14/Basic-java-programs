package loops;
import java.util.Scanner;

public class PowerUsingForloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :");
		int a=sc.nextInt();
		System.out.println("Enter power");
		int b=sc.nextInt();
		int result=1;
		for (int i=0;i<b;i++) {
			result=result*a;
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

package takingUserInput;
import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal ammount:");
		int principal=sc.nextInt();
		System.out.println("Enter rate:");
		float rate =sc.nextFloat();
		System.out.println("Enter time:");
		int time=sc.nextInt();
		float simpleInterest=principal*time*rate/100;
		System.out.println("the simple interest is "+simpleInterest);
		
		
		
		// TODO Auto-generated method stub

	}

}

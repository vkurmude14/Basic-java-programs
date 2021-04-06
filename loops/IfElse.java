package loops;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//int limit=18;
		/*
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter number of petals");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("it is even ");
		}
		else if(a%3==0)
		{
			System.out.println("it is divisible by 3");
		}
		else {
			System.out.println("Duck oFF");
		}
		*/
		/*
		int a=15;
		int b=8;
		int maxOfBothNumbers=0;
		maxOfBothNumbers=a>b?a:b;
		System.out.println("maximum of a and b is "+maxOfBothNumbers);
		*/
		
		int a=1,b=15,c=13;
		int result=0;
		/*
		if(a>b) {
			 	if(a>c) {
			 		result=a;
			 	}else {
			 		result=c;
			 	}
			 	
			
		}
		else {
			result=b;
		}
		*/
		result= a > b ? a > c?a:c:b>c?b:c;
		System.out.println("maximum is "+result);
		
		// TODO Auto-generated method stub

	}

}

package loops;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			sum=sum*10+d;
			temp=temp/10;		
		}
		if(sum==n) {
			System.out.println(n+" is pallindrome");
		}
		else {
			System.out.println(n+" isnt pallindrome");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}


package loops;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
//		while(temp>0) {
//		int	d=temp%10;
//		temp=temp/10;
//		sum=sum+d;
//		 
//		
//		}
//		System.out.println(sum);
		int noOfDigits=(int)Math.log10(n)+1;
		System.out.println(noOfDigits);
		// TODO Auto-generated method stub

	}

}

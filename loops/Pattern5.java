package loops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1; k<=(n-i+1);k++) {
				System.out.print("* ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
				
			
			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}

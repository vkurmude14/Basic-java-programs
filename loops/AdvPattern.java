package loops;

import java.util.Scanner;

public class AdvPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}

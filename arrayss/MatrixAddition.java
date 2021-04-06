package arrayss;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("dimensions of matrix 1 :");
		int row1=sc.nextInt();
		
		int cols1=sc.nextInt();
		System.out.println("dimensions of matrix 1 :");
		int row2=sc.nextInt();
		
		int cols2=sc.nextInt();
		int a[][]=new int[row1][cols1];
		int b[][]=new int[row2][cols2];
		int c[][]=new int[cols1][row2];
	if (row1==cols2) {
		System.out.println("enter array a :");
		for (int i=0;i<row1;i++) {
			for (int j=0;j<cols1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter array b :");
		for (int i=0;i<row2;i++) {
			for (int j=0;j<cols2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
	
		
		for (int i=0;i<cols1;i++) {
			for (int j=0;j<row2;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("result array c is :");
		for (int i=0;i<row1;i++) {
			for (int j=0;j<cols2;j++) {
				c[i][j]=0;
				for(int k=0;k<row2;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
			
		}
		for (int i=0;i<row2;i++) {
			for (int j=0;j<cols1;j++) {
				System.out.print(c[i][j]+" ");
				//System.out.println();
			}
			System.out.println();
		}
		
	}
			
		
		
		// TODO Auto-generated method stub

	}

}

package arrayss;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students :");
		int n=sc.nextInt();
		int marks[]=new int[n];
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
					
		}
		int averageMarks=0;
		for(int i=0;i<n;i++) {
			averageMarks+=marks[i];
		}
		averageMarks=averageMarks/n;
		System.out.println("Average Marks are "+averageMarks);
		
		// TODO Auto-generated method stub

	}

}

package string;
import java.util.Arrays; 

import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		boolean isAnnagram=false;
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine(); 
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        //String s2="tiniv";
        char[] chars2=s2.toCharArray();
        Arrays.sort(chars2);
        String sorted2=new String(chars2);
        if (sorted1.equals(sorted2)) {
        	System.out.println("They are anagram.");
        	
        }
        
        		
        
        
		
		
		// TODO Auto-generated method stub

	}

}

package encapsulations;

import java.util.Scanner;

class Reversewords {
    public String reverseWords(String s) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
    	int i=s1.length()-1;
        String ans="";
        while(i>=0){
            while(i>=0 && s1.charAt(i)==" ") i--;
            int j=i;
            while (i>=0 && s1.charAt(i)!=" ")i--;
            if(ans.isEmpty()){
                  ans=ans.concat(s1.substring(i+i,j+1));
            }
                  else{
                      ans= ans.concat(" "+s1.substring(i+i,j+1));
                  }
                  
                  
                  
                
        }
        
    }
}

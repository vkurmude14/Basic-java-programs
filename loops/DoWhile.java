package loops;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		{
			// your code goes here
			Scanner sc=new Scanner(System.in);
			int n;
			 while(true){
			     n=sc.nextInt();
			     if(n!=42){
	             System.out.println(n);
			     }
			     else{
			         System.exit(-1);
			     }
			 }
		// TODO Auto-generated method stub

	}

}
}

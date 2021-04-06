package loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float result=0;
		int sign=-1;
		
		for(float i=1;i<=n;i++) {
//			if (i%2==0) {
//				result=result-1/i;
//			}
//			else {
//				result=result+1/i;
//			}
			sign=sign*(-1);
			result+=sign*1/i;
			
		}
		System.out.print(result);

	}

}

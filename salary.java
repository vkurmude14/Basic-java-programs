import java.util.Scanner;

public class salary {
	public static int CalcSal(int rate ,int holiday){
		int work_days=30-holiday;
		int work_hr=8*work_days;
		int salary= rate*work_hr;
		return salary;
		
		
		
				
	
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate of hour");
		int rate= sc.nextInt();
		System.out.println("Enter number of holidays");
		int holiday= sc.nextInt();
		
		System.out.println(CalcSal(rate,holiday)+"$");
		
		
		
		

	}

}

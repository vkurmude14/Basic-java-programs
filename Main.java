
public class Main {

	public static void main(String[] args) {
//		try {
//		int a=5;
//		int b=0;
//		int c=a/b;
////		int a[]=new int[5];
//		System.out.println(c);
//		boolean isDanger= true;
//		if(isDanger) {
//			throw new ArrayOutOfBoundsException("danger ahe te lavdya");
//		}
	
		fun1();

	}

	static void fun1(){
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		
			try {
				Thread.sleep(1000);
				//fun2()
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println("After delay");
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger= true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger ahe te lavdya");
		}
	}
}

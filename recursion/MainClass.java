package recursion;

public class MainClass {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(path(3,1));
	//	System.out.println(count);
	}
	
//	static int sum(int n) {
//		if(n==1) {
//			return 1;
//		}
//		else {
//			return n+ sum(n-1);
//		}
//	}
	static long pow(int a,int b) {
		System.out.println(b);
		count++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return pow(a*a,b/2);
		}
		return a*pow(a,b-1);
	}
	static int path (int n,int m) {
		if(n==1||m==1)return 1;
		return path(n,m-1)+path (m,n-1);
	}

}

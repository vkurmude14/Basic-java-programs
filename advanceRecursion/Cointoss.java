package advanceRecursion;

public class Cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,700,2};
		System.out.println(coingame(a,0,a.length-1));

	}
	static int coingame(int a[],int l,int r ) {
		if(l+1==r) {
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+ Math.min(coingame(a,l+2,r),coingame(a,l+1,r-1)),a[r]+Math.min(coingame(a,l+1,r-1),coingame(a,l,r-2))) ;
	}

}

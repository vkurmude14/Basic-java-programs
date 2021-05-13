package oops;

public class Introduction {

	public static void main(String[] args) {
		int x=11;
		int y=12;
		int a[]= {1,2,12,11,13};
		int n=a.length;
		boolean exist=false;
		boolean exist1=false;
		boolean exist2=false;
        for (int i=0;i<n;i++){
        	if (x==a[i]) {
        		exist=true;
        	}
        }
        for (int i=0;i<n;i++){
        	if (y==a[i]) {
        		exist1=true;
        	}
        }
        
        if(exist && exist1) {
        	exist2=true;
        }
        System.out.println(exist2);
}
}
package advanceRecursion;

public class Flood {

	public static void main(String[] args) {
		int a[][]= {{1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,0,0},
					{1,0,0,1,1,0,1,1},
					{1,2,2,2,2,0,1,0},
					{1,1,1,2,2,0,1,0},
					{1,1,1,2,2,2,2,0},
					{1,1,1,1,1,2,1,1},
					{1,1,1,1,1,2,2,1}};
		printmatrprev(a);
		floodFill(a,0,0,3,1);
		printmatr(a);

	}
	static void floodFill(int a[][],int r ,int c,int tofill,int prevfill) {
		int row=a.length;
		int col=a[0].length;
		if(r<0|| r>=row||c<0||c>=col) {
			return;
		}
		if (a[r][c]!=prevfill) {
			return;
		}
		a[r][c]=tofill;
		floodFill(a,r-1,c,tofill,prevfill);
		floodFill(a,r,c-1,tofill,prevfill);
		floodFill(a,r+1,c,tofill,prevfill);
		floodFill(a,r,c+1,tofill,prevfill);
		
	}
	static void printmatrprev(int a[][]) {
		System.out.println("pevious matrix:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void printmatr(int a[][]) {
		System.out.println();
		System.out.println("Matrix after filling:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

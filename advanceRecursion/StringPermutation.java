package advanceRecursion;
import java.util.*;

public class StringPermutation {
	static Set<String> set= new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abcc",0,3);
	}
	static void perm(String s,int l,int r) {
		if(l==r) {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=interchange(s,l,i);
			perm(s,l+1,r);
			s=interchange(s,l,i);
		}
	}
	static String interchange(String s,int a,int b) {
		char ar[]=s.toCharArray();
		char temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
		return String.valueOf(ar);
		
	}

}

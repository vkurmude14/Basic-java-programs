package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		ArrayDeque <Integer> ad= new ArrayDeque<>();
		ad.addFirst(1);
		//System.out.println(ad);
		ad.push(2);
		ad.addLast(4);
		ad.push(3);
		ad.addFirst(11);
		System.out.println(ad);
		
		

	}

}

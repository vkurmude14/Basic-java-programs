package queue;


import java.util.*;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q= new LinkedList<>();
		q.offer(12);
		q.offer(123);
		q.offer(13);
		System.out.println(q);
		q.remove(123);
		System.out.println(q);
		q.remove(12);	
		q.offer(78);
		System.out.println(q);
		q.poll();
		q.poll();
	//	q.remove();
		System.out.println(q);
		
		
		
		

	}

}

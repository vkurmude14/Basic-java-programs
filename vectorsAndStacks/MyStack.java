package vectorsAndStacks;

import linkedlist.MyLinkedList;


public class MyStack<E> {
	private MyLinkedList <E> ll= new MyLinkedList<E>();
	void push (E e ) {
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception ("popping from empty is not allowed");
			//return null;
		}
		return ll.removeLast();
		
	}
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception ("popping from empty is not allowed");
		}
		return ll.getLast();
		
	}

}

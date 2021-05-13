package linkedlist;
import linkedlist.MyLinkedList;
public class MainClass {

	public static void main(String[] args) {
		MyLinkedList<Integer> myll=new MyLinkedList();
		myll.add(12);
		for(int i=0;i<10;i++) {
			myll.add(i);
		}
		myll.print();
	}	

}

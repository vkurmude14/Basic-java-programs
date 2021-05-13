package vectorsAndStacks;
import java.util.Stack;
import java.util.Vector;


public class MainClass {

	public static void main(String[] args) {
		Stack <Integer> stack = new Stack();
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		
		//stack.pop();
		//while(!stack.empty()) {
		int popped =stack.pop();
		int peek = stack.peek();
		System.out.print(popped+" ");
		System.out.println(peek);
		//}
	}

}

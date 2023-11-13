package genericStack;

public class TestGenericStack {

	public static void main(String[] args) {
		//SHOULD BE MODULARIZED
		
		//creating and implementing an integer stack
		
		System.out.println("Welcome to our integer stack.");
		
		GenericStack<Integer> intStack = new GenericStack<>(3);
		
		System.out.println("Pushing...");
		
		intStack.push(2);
		
		System.out.println("Pushing...");
		
		intStack.push(14);
		
		System.out.println("Pushing...");
		
		intStack.push(5);
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		int top0 = intStack.peek();
		
		System.out.println("The element at the top is: " + top0);
		
		System.out.println("Now we will pop the top element.");
		
		System.out.println("Popping...");
		
		intStack.pop();
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		int top1 = intStack.peek();
		
		System.out.println("The element at the top is: " + top1);
		
		System.out.println("Now we will pop the top element.");
		
		System.out.println("Popping...");
		
		intStack.pop();
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		int top2 = intStack.peek();	
		
		System.out.println("The element at the top is: " + top2);
		
		System.out.println("");
		
		//creating and implementing a string stack
		
		System.out.println("Welcome to our String stack.");
		
		GenericStack<String> strStack = new GenericStack<>();
		
		System.out.println("Pushing...");
		
		strStack.push("Purple");
		
		System.out.println("Pushing...");
		
		strStack.push("Mauve");
		
		System.out.println("Pushing...");
		
		strStack.push("Emerald");
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		String str0 = strStack.peek();
		
		System.out.println("The element at the top is: " + str0);
		
		System.out.println("Now we will pop the top element.");
		
		System.out.println("Popping...");
		
		strStack.pop();
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		String str1 = strStack.peek();
		
		System.out.println("The element at the top is: " + str1);
		
		System.out.println("Now we will pop the top element.");
		
		System.out.println("Popping...");
		strStack.pop();
		
		System.out.println("Now we will peek at the top of the stack.");
		
		System.out.println("Peeking...");
		
		String str2 = strStack.peek();	
		
		System.out.println("The element at the top is: " + str2);
		
		
	}
}


public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack<String> testStack = new ArrayStack<String>();
		
		for(int i = 0; i < 9; i++)
		{
			testStack.push("item #" + i);
			System.out.println("pushing " + testStack.peek() +" on to Stack");
		}
		for(int i = 0; i < 3; i++)
		{
			System.out.println("popping " + testStack.pop() +" from Stack");
		}
		for(int i = 0; i < 5; i++)
		{
			testStack.push("item #1" + i);
			System.out.println("pushing " + testStack.peek() +" on to Stack");
		}
		System.out.println("\nContents of Stack: ");
		while(!testStack.isEmpty())
		{
			System.out.println(testStack.pop());
		}
	}

}

import java.util.Vector;

public class VectorStack <T> implements StackInterface <T>{
	
	private Vector<T> stack;
	private int lastIndex = -1;
	public VectorStack()
	{
		stack = new Vector<T>(15, 15);
		
	}
	public VectorStack(int size)
	{
		stack = new Vector<T>(size, 15);
		
	}
	public VectorStack(int size, int incr)
	{
		stack = new Vector<T>(size, incr);
		
	}

	public void push(T object) {
		stack.add(object);
		lastIndex++;
		
	}

	
	public T pop() {
		if(!this.isEmpty())
		{
			T obj = stack.elementAt(lastIndex);
			stack.removeElementAt(lastIndex);
			lastIndex--;
			return obj;
		}
		return null;
	}

	
	public T peek() {
		if(!this.isEmpty())
		{
			T obj = stack.elementAt(lastIndex);
			return obj;
		}
		return null;
	}

	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	
	public void clear() {
		stack.removeAllElements();
		
	}

}

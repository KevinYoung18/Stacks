import java.util.ArrayList;

public class ArrayStack<T> implements StackInterface<T>{

	private ArrayList<T> stack = new ArrayList<T>();
	private int lastIndex = -1;
	
	public void push(T object) 
	{
		stack.add(object);
		lastIndex += 1;
	}

	public T pop() 
	{
		T object;
		if(lastIndex >= 0) 
		{
			object = (T) stack.get(lastIndex);
			stack.remove(lastIndex);
			lastIndex -= 1;
		}
		else {
			object = null;
		}
		return object;
	}

	public T peek() 
	{
		return stack.get(lastIndex);
	}

	public void clear() 
	{
		stack.clear();
		lastIndex = -1;
	}

	public boolean isEmpty() {
		if(lastIndex == -1) {
			return true;
		}
		return false;
	}
		
}

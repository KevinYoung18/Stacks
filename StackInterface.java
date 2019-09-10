
public interface StackInterface <T> {
		//place a  object on top of the stack
		//@param object The object to be placed
		public void push(T object);
		
		//remove object from the top of the stack
		//@return the object at the top of the stack
		public T pop();
		
		//look at the object at the top of the stack without removing it
		//@return the object at the top of the stack
		public T peek();
		
		//check if the stack is empty
		//@return true if empty, else false
		public boolean isEmpty();
		
		//remove all the objects from the stack
		public void clear();
}

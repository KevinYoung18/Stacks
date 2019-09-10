

public class LinkedStack <T> implements StackInterface  <T>{
	
	Node<T> firstNode;
	public void push(T object) {
		if(this.isEmpty()) {
			firstNode = new Node<T>(object);
		}
		else
		{
		Node<T> newNode = new Node<T>(object, firstNode);
		firstNode = newNode;
		}
		
	}


	public T pop() {
		if(this.isEmpty()) {
			return null;
		}
		T item = (T) firstNode.getData();
		firstNode = firstNode.getNextNode();
		return item;
	}

	public T peek() {
		return (T) firstNode.getData();
	}

	public void clear() {
		while(!(this.isEmpty()))
		{
			this.pop();
		}
		
	}

	public boolean isEmpty() {
		boolean empty = false;
		try
		{
			firstNode.getNextNode();
		}
		catch(NullPointerException e)
		{
			empty = true;
		}
		return empty;
	}
	
	private class Node <T>
	{
		public Node(T data, Node<T> nextNode)
		{
			this.data = data;
			this.nextNode = nextNode;
		}
		
		public Node(T data)
		{
			this.data = data;
		}
		private T data;
		private Node<T> nextNode;
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node<T> nextNode) {
			this.nextNode = nextNode;
		}

	}
}


package structuralPatterns.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{
	 /**
	  * The list that stores our queue objects.
	  */
	private LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}
	
	@Override
	public void offer(T element) {
		list.addFirst(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}
	
	
	
	
}

package ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable{
	private Queue<Object> queue;
	private String name;
	private int maxSize;
	
	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producer(Queue<Object> queue, String name, int maxSize) {
		super();
		this.queue = queue;
		this.name = name;
		this.maxSize = maxSize;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(queue.size()<maxSize) {
				System.out.println(name+" is adding to the queue ");
				queue.add(new Object());
			}
		}
		
	}

}

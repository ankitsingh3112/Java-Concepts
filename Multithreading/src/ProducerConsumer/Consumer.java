package ProducerConsumer;

import java.util.Queue;

public class Consumer  implements Runnable{
	private Queue<Object> queue;
	private String name;
	private int maxSize;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(Queue<Object> queue, String name, int maxSize) {
		super();
		this.queue = queue;
		this.name = name;
		this.maxSize = maxSize;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(queue.size()>0) {
				System.out.println(name+" is consuming an element from store having "+queue.size()+" elements");
				queue.remove();
				
			}
		}
		
	}
	
	

}

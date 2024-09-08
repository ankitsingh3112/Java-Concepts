package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
	
	public static void main(String[] args) {
		Queue<Object> queue=new ConcurrentLinkedQueue<>();
		int maxsize=5;
		
		Producer p1=new Producer(queue,"P1",maxsize);
		Thread t1 = new Thread(p1);
        t1.start();
		
		Producer p2=new Producer(queue,"P2",maxsize);
		Thread t2 = new Thread(p2);
        t2.start();
		
		Producer p3=new Producer(queue,"P3",maxsize);
		Thread t3 = new Thread(p3);
        t3.start();
		
		Producer p4=new Producer(queue,"P4",maxsize);
		Thread t4 = new Thread(p4);
        t4.start();
		
		Producer p5=new Producer(queue,"P5",maxsize);
		Thread t5 = new Thread(p5);
        t5.start();
		
		Consumer c1 = new Consumer(queue, "C1", maxsize);
        Thread t7 = new Thread(c1);
        t7.start();

        Consumer c2 = new Consumer(queue, "C2", maxsize);
        Thread t8 = new Thread(c2);
        t8.start();

        Consumer c3 = new Consumer(queue, "C3", maxsize);
        Thread t9 = new Thread(c3);
        t9.start();

        Consumer c4 = new Consumer(queue, "C4", maxsize);
        Thread t10 = new Thread(c4);
        t10.start();
		
	}

}

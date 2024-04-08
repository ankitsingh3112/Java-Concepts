package creationThread;

import java.lang.*;
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("***** Thread Creation Using Thread class *********");
		for(int i=0;i<10;i++) {
			MultithreadDemo obj=new MultithreadDemo();
			obj.start();
		}
		
		
		//System.out.println("***** Thread Creation Using Runnable interface  *********");
		for(int i=0;i<10;i++) {
			Thread obj=new Thread(new MultiRunnable());
			obj.start();
		}
		
		

	}

}

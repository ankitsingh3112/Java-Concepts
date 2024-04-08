package creationThread;
import java.lang.Thread;
public class MultithreadDemo extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread: "+Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is caught");
		}
		
	}

}

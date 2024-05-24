package creationThread;
import java.lang.Runnable;
public class MultiRunnable implements Runnable {
	@Override
	public void run() {
	
				try {
					System.out.println("Thread: "+Thread.currentThread().getId()+" is running");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception is caught");
				}
				
		
	}

}

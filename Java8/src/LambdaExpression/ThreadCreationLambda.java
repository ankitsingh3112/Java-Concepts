package LambdaExpression;
import java.lang.Runnable;

public class ThreadCreationLambda {
	public static void main(String[] args) {
		
		Runnable thread=()->{
			for(int i=1;i<10;i++) {
				System.out.println("thread"+i+" is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(thread);
		t.start();
	}

}

package threadTasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPrint1to100ExecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(100);
		
		for(int i=1;i<=100;i++) {
			ExecutorPrinter num=new ExecutorPrinter(i);
			service.execute(num);
		}
		
		service.shutdown();

	}

}

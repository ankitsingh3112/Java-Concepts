package threadTasks;

public class ExecutorPrinter implements Runnable{
	int num;
	
	ExecutorPrinter(int n){
		num=n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(num +" is printed by "+Thread.currentThread().getId());
		
	}

}

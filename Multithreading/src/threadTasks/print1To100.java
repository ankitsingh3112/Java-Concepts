package threadTasks;

public class print1To100 implements Runnable{
	int num;
	
	public print1To100(int x) {
		// TODO Auto-generated constructor stub
		this.num=x;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(num+" printed by "+Thread.currentThread().getId()+" ");
		
	}

}

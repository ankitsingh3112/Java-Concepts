package threadTasks;

public class print1to100Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("First num printed by :"+Thread.currentThread().getId());
		Thread t;
		for(int i=1;i<=100;i++) {
			print1To100 num=new print1To100(i);
			t=new Thread(num);
			t.start();
			t.sleep(100);
			
		}
		
		System.out.println("Last num printed by :"+Thread.currentThread().getId());

	}

}

package AdderSubtractor;

public class Subtracter implements Runnable {
	
	Count count;
	
	public Subtracter(Count count) {
		// TODO Auto-generated constructor stub
		this.count=count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++) {
			count.value-=i;
			
		}
	}

}

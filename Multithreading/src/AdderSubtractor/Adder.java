package AdderSubtractor;

import java.lang.Runnable;

public class Adder implements Runnable {
	 Count count;
	
	
public Adder(Count count) {
	this.count=count;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++) {
			count.value+=i;
		}
		
	}

}

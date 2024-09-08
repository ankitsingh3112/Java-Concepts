package ConstructorProblem;


/*write a function to accept an integer and print the following tree based on the input: 
          1   - 6C6
        2 1 2   -  6C5 6C6 6C5
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6


1                         
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 


1 
2 1 2 
3 2 1 3 2 
4 3 2 1 4 3 2 
5 4 3 2 1 5 4 3 2 
6 5 4 3 2 1 6 5 4 3 2 
*/
public class Problem {
	
	
	public static void solve(int n) {
	  
	  
	  for(int i=1;i<=6;i++) {
		  int len=i;
		  while(len>=1) {
			  System.out.print(len+" ");
			  len--;
		  }
		 
	     len=i;
	     while(len>1) {
			  System.out.print(len+" ");
			  len--;
		  }
		  
		  System.out.println();
		  
	  }
	}
	
	public static void main(String[] args) {
		solve(6);
	}

}

package LambdaExpression;

public class Main {
  
	public static void main(String[] args) {
		
		//Functional Interface implementation using anonymous class
		
		FuncInter obj=new FuncInter(){    // we are not instantiating interface FuncInter, but creating object of anonymous class

			@Override
			public void func() {
				// TODO Auto-generated method stub
				System.out.println("Hello Implementatin of Functional intergface using anonymous class   ");
				
			}
			
		};
		
		obj.func();
		
		// implementing func() abstract method of FuncInter
		FuncInter inter=()->{System.out.println("Hello Implementatin of Functional intergface using lambda  ");
		};
		
	
		inter.func();
		
		
	}
}

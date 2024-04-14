package LambdaExpression;

public class SingleParaFuncInterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleParaFuncInter obj=(name)->{
			System.out.println("Hello "+name);
			System.out.println("You have implemented Functional interface with Single Parameter Using Lambda ");
		};
		
		obj.show("Ankit Singh Tanwar");

	}

}

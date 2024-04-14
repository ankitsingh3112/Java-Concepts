package LambdaExpression;

public class SumFunInterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous class Impl
//		SumFunInter obj=new SumFunInter() {
//			public int sum(int x, int y) {
//				System.out.println("Implementation by anonymous class");
//				return (x+y);
//				}
//		};
//		
//		obj.sum(22, 33);
		
		//Impl by Lambda
		
		SumFunInter obj2=(int n,int m)->{
			System.out.println("Implementation by Lambda ");
			return (n+m);
		};
		
		System.out.println(obj2.sum(21, 32));

	}

}

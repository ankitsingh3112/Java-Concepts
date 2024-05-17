package ConstructorProblem;

public class telescopingConstructor {
	int data;
	String s;
	
	public telescopingConstructor() {
		// TODO Auto-generated constructor stub
		this(0,null);
	}
	
	

	
	public telescopingConstructor(int data) {
		this(data,null);
	}




	public telescopingConstructor(String s) {
		this(0,s);
	}




	public telescopingConstructor(int data, String s) {
		super();
		this.data = data;
		this.s = s;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		telescopingConstructor obj=new telescopingConstructor(45);
		System.out.println("data is:"+obj.data);
		System.out.println("String value is:"+obj.s);

	}

}

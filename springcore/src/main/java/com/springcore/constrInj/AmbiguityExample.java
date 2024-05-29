package com.springcore.constrInj;

public class AmbiguityExample {
	int a;
	int b;
	
	public AmbiguityExample(double a,double b) {
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("This is double, double Connstructor");
	}
	
	public AmbiguityExample(int a,int b) {
		this.a=a;
		this.b=b;
		
		System.out.println("This is int, int Connstructor");
	}
	
	
	public AmbiguityExample(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		
		System.out.println("This is String, String Connstructor");
	}
	
	public String show() {
		return "a is: "+a+" and b is : "+b;
	}
	

}

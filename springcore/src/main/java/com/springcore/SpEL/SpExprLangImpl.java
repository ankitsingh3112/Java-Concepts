package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("spel")
public class SpExprLangImpl {
	
	@Value("#{ new java.lang.String('Ankit Singh')}")    // using SpEL to create Object of String class 
	private String name;
	
	@Value("#{88-55}")
	private int x;
	
	@Value("#{188-155}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(169)}")    // calling static method using SpEL
	private float a;
	
	@Value("#{T(java.lang.Math).PI}")      // calling static variable using SpEL
	private float pi;
	
	@Value("#{9>7}")
	private boolean flag;
	

	public SpExprLangImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpExprLangImpl(String name, int x, int y, float a, float pi, boolean flag) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.a = a;
		this.pi = pi;
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "SpExprLangImpl [name=" + name + ", x=" + x + ", y=" + y + ", a=" + a + ", pi=" + pi + ", flag=" + flag
				+ "]";
	}
	
	

}

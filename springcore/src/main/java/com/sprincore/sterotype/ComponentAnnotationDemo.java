package com.sprincore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentAnnotationDemo {
	@Value("Component Annotation Demo")
	private String name;
	
	@Value("25")
	private int val;
	
	@Value("#{frnds}")
	private List<String> friends;
	
	
	public List getFriends() {
		return friends;
	}


	public void setFriends(List friends) {
		this.friends = friends;
	}


	public ComponentAnnotationDemo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ComponentAnnotationDemo(String name, int val,List<String> friends) {
		super();
		this.name = name;
		this.val = val;
		this.friends=friends;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}


	@Override
	public String toString() {
		return "ComponentAnnotationDemo [name=" + name + ", val=" + val + "\nFriends"+friends+"]";
	}
	
	

}

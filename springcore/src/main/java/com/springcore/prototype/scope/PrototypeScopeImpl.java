package com.springcore.prototype.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScopeImpl {
	@Value("Protoype Bean Scope Impl")
	private String name;
	
	@Value("1010101")
	private int val;
	
	@Value("#{list}")
	private List<String> list;
	
	

	public PrototypeScopeImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public PrototypeScopeImpl(String name, int val, List<String> list) {
		super();
		this.name = name;
		this.val = val;
		this.list = list;
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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "PrototypeScopeImpl [name=" + name + ", val=" + val + ", list=" + list + "]";
	}
	
	

}


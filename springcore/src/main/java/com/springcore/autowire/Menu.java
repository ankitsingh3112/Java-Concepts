package com.springcore.autowire;

import java.util.List;

public class Menu {
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Menu [list=" + list + "]";
	}
	
	

}

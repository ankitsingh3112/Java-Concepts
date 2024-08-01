package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="manager_details")
public class Manager {
	@Column(name="manager_name")
	private String name;
	@Id
	@Column(name="mId")
	private int id;
	
	private String dept;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name,int id, String dept) {
		super();
		this.name = name;
		this.id=id;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
	
	
	
	

}

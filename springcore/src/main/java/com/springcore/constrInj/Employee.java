package com.springcore.constrInj;

public class Employee {
	private String employeeName;
	private int empId;
	private double yearsOfExperience;
	private int ctcOfEmplyee;
	private Company cmp;
	
	public Employee(String employeeName, int empId, double yearsOfExperience, int ctcOfEmplyee, Company cmp) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
		this.yearsOfExperience = yearsOfExperience;
		this.ctcOfEmplyee = ctcOfEmplyee;
		this.cmp = cmp;
	}

	@Override
	public String toString() {
		return "EmployeeDeatils \n[employeeName=" + employeeName + "\n empId=" + empId + "\n yearsOfExperience="
				+ yearsOfExperience + "\n ctcOfEmplyee=" + ctcOfEmplyee + "\n Company Name=" + cmp + "]";
	}
	
	

}

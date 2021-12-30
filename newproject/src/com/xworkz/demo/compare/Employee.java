package com.xworkz.demo.compare;

import java.util.*;
 
public class Employee implements Comparable<Employee>{

	private int employeeId;
	private String employeeName;
	private String employeeState;
	private float employeeExperience;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, String employeeState, float employeeExperience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeState = employeeState;
		this.employeeExperience = employeeExperience;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeState() {
		return employeeState;
	}
	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}
	public float getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(float employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeState="
				+ employeeState + ", employeeExperience=" + employeeExperience + "]\n";
	}
	

	@Override
	public int compareTo(Employee o) {
		
		if(this.employeeId==o.getEmployeeId())
		{
			return 0;
		}
		else if(this.employeeId>o.getEmployeeId())
		{
			return 10;
		}
		else if(this.employeeId<o.getEmployeeId())
		{
			return -10;
		}
		
		int a = this.employeeName.compareTo(o.getEmployeeName());
		if(this.employeeName.equals(o.getEmployeeName()))
		{
			return 0;
		}
		else if(a>0)
		{
			return 10;
		}
		else if(a<0)
		{
			return -10;
		}
		
		int a1 = this.employeeState.compareTo(o.getEmployeeState());
		if(this.employeeState.equals(o.employeeState))
		{
			return 0;
		}
		else if(a1>0)
		{
			return 10;
		}
		else if(a1<0)
		{
			return -10;
		}
		
		if(this.employeeExperience==o.getEmployeeExperience())
		{
			return 0;
		}
		else if(this.employeeExperience>o.getEmployeeExperience())
		{
			return 10;
		}
		else if(this.employeeExperience<o.getEmployeeExperience())
		{
			return -10;
		}
		return 0;
	}

	
}

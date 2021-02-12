package com.coforge.githubJavaEx.service;

import com.coforge.githubJavaEx.dao.EmployeeDaoImpl;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDaoImpl ed=null;
	public EmployeeServiceImp() {
		ed=new EmployeeDaoImpl();
	}
	public void add() {
		ed.add();
	}
	public void displayEmp() {
		ed.displayEmp();
	}
	

}

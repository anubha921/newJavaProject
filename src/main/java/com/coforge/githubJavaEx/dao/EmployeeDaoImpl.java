package com.coforge.githubJavaEx.dao;

import java.util.Scanner;

import com.coforge.githubJavaEx.GithubJavaProject.beanclass.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private Employee e=null;
	Scanner sc=new Scanner(System.in);
	public void add() {
		e=new Employee();
		e.setEmpId(sc.nextInt());
		sc.nextLine();
		e.setEmpName(sc.next());
		e.setEmpPhone(sc.nextLong());
		e.setEmpEmail(sc.next());
	}
	public void displayEmp() {
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpPhone());
		System.out.println(e.getEmpEmail());
	}
	
}

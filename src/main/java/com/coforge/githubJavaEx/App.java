package com.coforge.githubJavaEx;

import java.util.Scanner;

import com.coforge.githubJavaEx.service.EmployeeServiceImp;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeServiceImp e=new EmployeeServiceImp();
        Scanner sc=new Scanner(System.in);
         e.add();
         e.displayEmp();
        
    }
}

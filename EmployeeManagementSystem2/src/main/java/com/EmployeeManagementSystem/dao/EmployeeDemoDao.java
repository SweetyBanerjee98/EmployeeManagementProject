/*
Program (1) :- WAP to  create Employee management using collections 
Perform operations:
1.Add an employee
2. Delete an employee
3. Find an employee"
4. Display

@Author:- Sweety Banerjee
#Date:- 20th Oct , 2022 
*/

package com.EmployeeManagementSystem.dao; //declaring the package

import com.EmployeeManagementSystem.model.EmployeeDemo; // importing EmployeeDemo

public interface EmployeeDemoDao { // declaring public interface EmployeeDemoDao

	void addEmployeeDemo(); // declaring interface for void method method addEmployeeDemo to add an employee

	boolean deleteEmployeeDemo(int id); // declaring interface for boolean method boolean deleteEmployeeDemo to delete
										// an employee by employee id

// declaring interface for boolean method updateEmployeeDemo to update an employee by employee id
	boolean updateEmployeeDemo(int id);

// declaring interface for EmployeeDemo method updateEmployeeDemo to search for an employee by employee id
	EmployeeDemo findEmployeeDemo(int id);

	void displayAll(); // declaring interface for displayAll method to display all the employees

} // End Of the EmployeeDemoDao class

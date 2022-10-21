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

package com.EmployeeManagementSystem.daoimple; //Declaring the package

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagementSystem.dao.EmployeeDemoDao;
import com.EmployeeManagementSystem.model.EmployeeDemo;

public class EmployeeDemoDaoImple implements EmployeeDemoDao {

	List<EmployeeDemo> emList = new ArrayList<EmployeeDemo>(); // creating Scanner Object
	Scanner sc = new Scanner(System.in); // creating Employee object

	@Override
	public void addEmployeeDemo() { // overriding AddEmployeeDemo method

		// creating Employee object
		EmployeeDemo emp = new EmployeeDemo();

		// Taking User input the details of Employee
		System.out.println("Enter the Employee Id :");
		emp.seteId(sc.nextInt());
		System.out.println("Enter the Employee Name :");
		emp.seteName(sc.next());
		System.out.println("Enter the Employee Salary :");
		emp.seteSalary(sc.nextDouble());

		// adding the Employee into the collection
		emList.add(emp);
		System.out.println(emList);

	} // end of the method

	@Override
	// overriding deleteEmployeeDemo method
	public boolean deleteEmployeeDemo(int id) {
		// TODO Auto-generated method stub

		boolean status = false; // initial status false
		EmployeeDemo empdel = null; // initial deleted employee null

		// finding the Employee
		for (EmployeeDemo e : emList) { // creating EmployeeDemo object e for every member of emList
			if (e.geteId() == id) // checking if id matches with given id
				empdel = e; // assigning matching EmployeeDemo object to variable empdel
		}

		// check whether the record is present or not
		if (empdel == null)
			status = false; // if null status false
		else {
			// else call the remove method of emList to remove the employee
			emList.remove(empdel);
			status = true; // status true
		}

		return status; // return status
	}

	@Override
	public boolean updateEmployeeDemo(int id) { // overriding updateEmployeeDemo method
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDemo findEmployeeDemo(int id) { // overriding findEmployeeDemo method

		EmployeeDemo empfind = null;
		// finding the student
		for (EmployeeDemo e : emList) { // creating EmployeeDemo object e for every member of emList
			if (e.geteId() == id) // checking if id matches with given id
				empfind = e; // assigning matching EmployeeDemo object to variable empfind
		}

		return empfind;
	}

	@Override
	public void displayAll() { // overriding displayAll method
		// TODO Auto-generated method stub

		for (EmployeeDemo e : emList) { // looping through every member of emList
			System.out.println(e); // printing employee details
		}
	}
} // end of the class

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

package com.EmployeeManagementSystem.model; //declaring the package name

public class EmployeeDemo { // Creating EmployeeDemo class

	// Creating Several attributes of the EmployeeDemo class (instance variable)
	private int eId;
	private String eName;
	private double eSalary;

	// initializing the default constructor
	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
	} // End of default constructor

	// declaring parameterized constructor
	public EmployeeDemo(int eId, String eName, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	} // end of the parameterized constructor

// creating getter & setter Getter and setters for getting and setting properties of the EmployeeDemo class
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}

} // End of the EmployeeDemo class

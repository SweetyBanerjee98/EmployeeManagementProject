package com.EmployeeManagementSystem; //creating the package

import java.util.Scanner; //importing the scanner class

import com.EmployeeManagementSystem.dao.EmployeeDemoDao; // importing EmployeeDemodao
import com.EmployeeManagementSystem.daoimple.EmployeeDemoDaoImple; // importing EmployeeDemodaoimple
import com.EmployeeManagementSystem.model.EmployeeDemo; // importing EmployeeDemo

public class App { // declaring app class

	public static void menu() { // declaring the method

		// printing the statements
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Display all the Employee details");
		System.out.println("6.Exit");
	} // End of the method

	public static void main(String[] args) { // declaring the main method

		// creating Scanner class Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of Employeedemodao
		EmployeeDemoDao office = new EmployeeDemoDaoImple();

		// declaring varible choice
		try {
			int ch = 0; // initializing the value with 0
			do {
				menu();
				ch = sc1.nextInt();
				// The ch value is evaluated once and compared with the values of each case
				switch (ch) {
				case 1:
					office.addEmployeeDemo();
					System.out.println("..........Employee inserted..........");
					break;
				case 2:
					System.out.println("Enter Id that want to delete:");
					int id = sc1.nextInt();
					boolean flag = office.deleteEmployeeDemo(id);
					if (flag)
						System.out.println(".......Employee deleted.......");
					else
						System.out.println("........Employee not found......");
					break;

				case 4:
					EmployeeDemo em = null;
					System.out.println("Enter Id that want to search:");
					id = sc1.nextInt();
					em = office.findEmployeeDemo(id);
					if (em == null)
						System.out.println("........Employee not found.......");
					else
						System.out.println("Employee Id :" + em.geteId() + " Employee Name:" + em.geteName()
								+ " Employee Salary:" + em.geteSalary());
					break;

				case 5:
					office.displayAll();
					break;

				case 6:
					System.exit(0);
					break;

				default:
					System.out.println("..........Invalid input.......");

				}

			} while (ch != 6);

			// end of do while

			sc1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
} // End of the app class
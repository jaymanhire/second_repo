package client;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;

		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		// employees = accountants;

		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2;

		ArrayList<? extends Employee> employees3 = new ArrayList<>(); // Employee(upperbound) and its children
		ArrayList<Employee> accountants3 = new ArrayList<>();
		employees3 = accountants3;

		ArrayList<? super Employee> employees4 = new ArrayList<>(); // Employee is the Lower bound
		ArrayList<Object> accountants4 = new ArrayList<>();
		employees4 = accountants4;
		
		//makeEmployeeWork(employees);
		makeEmployeeWork(accountants);

	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (HRManager emp : (ArrayList<HRManager>)employees) {
			emp.work();
		}

	}

}

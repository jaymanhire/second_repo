package customclass.sort;

public class Employee implements Comparable<Employee> {

	private String name = null;
	private int salary;
	private String department;

	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.salary) {
			return -1;

		} else if (this.salary > o.salary) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Employee name: " + name + "\n";
		str += "Salary = " + salary + "\n";
		str += "Department: " + department + "\n";
		return str;

	}

}

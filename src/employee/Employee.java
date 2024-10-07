package employee;

public abstract class Employee {
	private final String id;
	private final String name;
	private final String department;
	private final String role;
	private final int workingHoursPerWeek;
	private final double salary;
	
	public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.role = role;
		this.workingHoursPerWeek = workingHoursPerWeek;
		this.salary = salary;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getRole() {
		return role;
	}

	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	public double getSalary() {
		return salary;
	}

	public abstract void clockIn();
	public abstract void clockOut();
	public abstract void trackWorkHours();
}

package employee;

public class FullTimeEmployeeBuilder implements EmployeeBuilder{
	private String id, name, department, role;
	private int workingHoursPerWeek;
	private double salary;
	
	@Override
	public FullTimeEmployeeBuilder setID(String id) {
		this.id = id;
		return this;
	}

	@Override
	public FullTimeEmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public FullTimeEmployeeBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}

	@Override
	public FullTimeEmployeeBuilder setRole(String role) {
		this.role = role;
		return this;
	}

	@Override
	public FullTimeEmployeeBuilder setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
		return this;
	}

	@Override
	public FullTimeEmployeeBuilder setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	
	public Employee build() {
		return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
	}

}

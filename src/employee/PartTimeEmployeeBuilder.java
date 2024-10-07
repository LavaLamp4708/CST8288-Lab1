package employee;

public class PartTimeEmployeeBuilder implements EmployeeBuilder{
	private String id, name, department, role;
	private int workingHoursPerWeek;
	private double salary;
	
	@Override
	public PartTimeEmployeeBuilder setID(String id) {
		this.id = id;
		return this;
	}

	@Override
	public PartTimeEmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public PartTimeEmployeeBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}

	@Override
	public PartTimeEmployeeBuilder setRole(String role) {
		this.role = role;
		return this;
	}

	@Override
	public PartTimeEmployeeBuilder setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
		return this;
	}

	@Override
	public PartTimeEmployeeBuilder setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	
	@Override
	public Employee build() {
		return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
	}

}

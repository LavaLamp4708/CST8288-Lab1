package employee;

public class EmployeeDirector{
	
	private EmployeeBuilder builder;
	
	public EmployeeDirector(EmployeeBuilder builder) {
		this.builder = builder;
	}
	
	public Employee constructEmployee(
			String id,
			String name,
			String department,
			String role,
			int workingHoursPerWeek,
			double salary)
	{
		return builder
			.setID(id)
			.setName(name)
			.setDepartment(department)
			.setRole(role)
			.setWorkingHoursPerWeek(workingHoursPerWeek)
			.setSalary(salary)
			.build();
	}
}

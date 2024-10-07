package employee;

public interface EmployeeBuilder {
	EmployeeBuilder setID(String id);
	EmployeeBuilder setName(String name);
	EmployeeBuilder setDepartment(String department);
	EmployeeBuilder setRole(String role);
	EmployeeBuilder setWorkingHoursPerWeek(int workingHoursPerWeek);
	EmployeeBuilder setSalary(double salary);
	Employee build();
}

package employee;

public class EmployeeFactory {
	public static Employee createEmployee(String type,
											String id,
											String name,
											String department,
											String role,
											int hours,
											double salary) {
		switch(type.toLowerCase()) {
			case "fulltime":
				return new FullTimeEmployee(id, name, department, role, hours, salary);
			case "parttime":
				return new PartTimeEmployee(id, name, department, role, hours, salary);
			default:
				throw new IllegalArgumentException("Unknown employee type");
		}
	}
}

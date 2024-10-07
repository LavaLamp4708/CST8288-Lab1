package employee;

public class EMS {
	public static void main(String[] args) {
		EmployeeManager manager = EmployeeManager.getInstance();
		
		// Using Factory to create employees
		Employee fullTimeEmployee = EmployeeFactory.createEmployee(
				"fulltime",
				"001",
				"Alice",
				"HR",
				"Manager",
				40, 80000);
		Employee partTimeEmployee = EmployeeFactory.createEmployee(
				"parttime",
				"002",
				"Bob",
				"IT",
				"Developer",
				20, 40000);
		
		// Adding employees to EmployeeManager
		manager.addEmployee(fullTimeEmployee);
		manager.addEmployee(partTimeEmployee);
		
		// Using Builder to construct employees
		EmployeeBuilder builder = new FullTimeEmployeeBuilder();
		EmployeeDirector director = new EmployeeDirector(builder);
		Employee employee3 = director.constructEmployee(
				"003",
				"Charlie",
				"Marketing",
				"Executive",
				40, 60000);
		
		manager.addEmployee(employee3);
		
		// Retrieve and manage employees
		Employee retrieved = manager.getEmployee("002");
		if(retrieved != null) {
			retrieved.clockIn();
			retrieved.clockOut();
			retrieved.trackWorkHours();
		}
	}
}

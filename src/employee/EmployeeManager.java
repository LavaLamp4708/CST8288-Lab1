package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager{
	private static EmployeeManager emInstance;
	private List<Employee> employees = new ArrayList<>();
	
	private EmployeeManager() {}
	
	public static synchronized EmployeeManager getInstance() {
		if(emInstance == null) {
			emInstance = new EmployeeManager();
		}
		return emInstance;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Employee getEmployee(String id) {
		return employees.stream().filter(e -> e.getID().equals(id)).findFirst().orElse(null);
	}
}

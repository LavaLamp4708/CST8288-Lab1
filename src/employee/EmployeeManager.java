package employee;

public class EmployeeManager{
	private static EmployeeManager emInstance;
	
	private EmployeeManager() {
		
	}
	
	public EmployeeManager getEmployeeManagerInstance() {
		if(emInstance == null) {
			emInstance = new EmployeeManager();
		}
		return emInstance;
	}
}

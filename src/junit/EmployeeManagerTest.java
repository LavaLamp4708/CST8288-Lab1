package junit;

import static org.junit.Assert.*;
import employee.*;

import org.junit.Test;

public class EmployeeManagerTest {

	@Test
	public void testSingletonBehavior() {
		EmployeeManager manager1 = EmployeeManager.getInstance();
		EmployeeManager manager2 = EmployeeManager.getInstance();
		assertSame(manager1, manager2);
	}
	
	@Test
	public void testEmployeeManagement() {
		EmployeeManager manager = EmployeeManager.getInstance();
		
		// mock employee
		Employee employee = new FullTimeEmployee("001", "Alice", "HR", "Manager", 40, 80000);
		
		// add employee
		manager.addEmployee(employee);
		assertNotNull(manager.getEmployee("001"));
		
		// remove employee
		manager.removeEmployee(employee);
		assertNull(manager.getEmployee("001"));
	}

}

package junit;

import static org.junit.Assert.*;
import employee.*;

import org.junit.Test;

public class EmployeeDirectorTest {

	@Test
	public void test() {
		// create builder
		EmployeeBuilder builder = new FullTimeEmployeeBuilder();
		
		// employee director
		EmployeeDirector director = new EmployeeDirector(builder);
		Employee employee = director.constructEmployee("001", "Alice", "HR", "Manager", 40, 80000);
		
		// check that all are correct
		assertEquals("001", employee.getID());
		assertEquals("Alice", employee.getName());
		assertEquals("HR", employee.getDepartment());
		assertEquals("Manager", employee.getRole());
		assertEquals(40, employee.getWorkingHoursPerWeek());
		assertEquals(80000, employee.getSalary(), 0.001);
	}

}

package junit;

import static org.junit.Assert.*;
import employee.*;

import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("fulltime", "001", "Alice", "HR", "Manager", 40, 80000);

        assertTrue(employee instanceof FullTimeEmployee);
        assertEquals("001", employee.getID());
        assertEquals("Alice", employee.getName());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(80000, employee.getSalary(), 0.001);
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("parttime", "002", "Bob", "IT", "Developer", 20, 40000);

        assertTrue(employee instanceof PartTimeEmployee);
        assertEquals("002", employee.getID());
        assertEquals("Bob", employee.getName());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(40000, employee.getSalary(), 0.001);
    }

    @Test
    public void testInvalidEmployeeType() {
        assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.createEmployee("contractor", "003", "Charlie", "Finance", "Analyst", 30, 50000);
        });
    }
}
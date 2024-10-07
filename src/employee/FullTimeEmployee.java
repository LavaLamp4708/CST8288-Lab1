package employee;

public class FullTimeEmployee extends Employee{
	
	public FullTimeEmployee(String id,
							String name,
							String role,
							String department,
							int workingHoursPerWeek,
							double salary) {
		super(id, name, role, department, workingHoursPerWeek, salary);
	}
	
	@Override
	public void clockIn() {
		System.out.println("Clocked in at 8:00 AM");
	}
	
	@Override
	public void clockOut() {
		System.out.println("Clocked out at 4:00 PM");
	}
	
	@Override
	public void trackWorkHours() {
		System.out.println("Full time employee works for 8 hours per day");
	}
}

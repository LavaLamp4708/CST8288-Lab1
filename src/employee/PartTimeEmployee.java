package employee;

public class PartTimeEmployee extends Employee{
	
	public PartTimeEmployee(String id,
							String name,
							String role,
							String department,
							int workingHoursPerWeek,
							double salary) {
		super(id, name, department, role, workingHoursPerWeek, salary);
	}
	
	@Override
	public void clockIn() {
		System.out.println("Clocked in at 7:00 AM");
	}
	
	@Override
	public void clockOut() {
		System.out.println("Clocked out at 12:00 PM");
	}
	
	@Override
	public void trackWorkHours() {
		System.out.println("Part time employee works for 5 hours per day");
	}
}

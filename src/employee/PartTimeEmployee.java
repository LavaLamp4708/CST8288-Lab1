package employee;

public class PartTimeEmployee extends Employee{
	
	public PartTimeEmployee() {
		// default constructor
	}
	
	@Override
	public void clockIn() {
		System.out.println("Clock in at 7:00 AM");
	}
	
	@Override
	public void clockOut() {
		//implement
	}
	
	@Override
	public void trackWorkHours() {
		System.out.println("Part time employee works for 5 hours per day");
	}
}

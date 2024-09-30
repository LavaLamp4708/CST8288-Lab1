package employee;

public abstract class Employee {
	private String id;
	private String name;
	private String department;
	private String role;
	private String workingHoursPerWeek;
	private double salary;
	
	public abstract void clockIn();
	public abstract void clockOut();
	public abstract void trackWorkHours();
}

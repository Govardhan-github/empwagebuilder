package empwagebuilder;

public class Empchecking {
	/*
	 * Program To Calculate Employee Wage
	 */
	
	//constants
	public static final int IS_PART_TIME = 0 ;
	public static final int IS_FULL_TIME = 1;

	/*
	 * Declaring Method To Calculate EmpWage
	 */
	public static int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) 
	
	{
	int emphrs=0;
	int totalemphrs=0;
	int totalworkingdays=0;
	System.out.println("welcome to the Empwagebuild programme");
	//While Condition To Calculate Total EmpWage
	while ( totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays) {
		totalworkingdays++;
	int empcheck = (int) Math.floor(Math.random() * 10) % 2;
	switch (empcheck) {
	 	case IS_FULL_TIME:
			emphrs=8;
			break;
	 	case IS_PART_TIME:
	 		emphrs=4;
			break;
		default:
			emphrs=0;
	}
	totalemphrs=emphrs;
	System.out.println("Days:" + totalworkingdays + "emphr: " +emphrs);
	}
	int totalempwage = totalemphrs * empRatePerHr;
	System.out.println("Total Emp Wage For Company: " +company+" is : " +totalempwage);
	return totalempwage;
	}
	/*
	 * Declaring Main Method 
	 * Calling ComputeEmpWage Method Here
	 */
	public static void main(String[] args) {
		computeEmpWage("Dmart",20,20,50);
		computeEmpWage("Relaince",30,40,70);
	}
}
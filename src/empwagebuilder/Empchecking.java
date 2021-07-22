package empwagebuilder;

public class Empchecking {
	/*
	 * Program To Calculate Employee Wage
	 */
	
	//
	public static final int IS_PART_TIME = 0 ;
	public static final int IS_FULL_TIME = 1;

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private static int totalempwage;
	
	public Empchecking(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
				
	}
	/*
	 * Declaring Method To Calculate EmpWage
	 */
	public void computeEmpWage() 
	
	{
	int emphrs=0;
	int totalemphrs=0;
	int totalworkingdays=0;
	System.out.println("welcome to the Empwagebuild programme");
	//While Condition To Calculate Total EmpWage
	while ( totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays) 
		{
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
	totalemphrs  =emphrs;
	System.out.println("Days:" + totalworkingdays + "emphr: " +emphrs);
		}
	totalempwage = totalemphrs * empRatePerHr;
		}
	
	@Override
	public String toString() {
		return "Total Emp Wage For Company: " +company+" is : " + totalempwage ;
	}
	
	
	/*
	 * Declaring Main Method 
	 * Calling ComputeEmpWage Method Here
	 */
	public static void main(String[] args) {
		Empchecking dMart = new Empchecking("DMart" , 20, 2,10);
		Empchecking reliance = new Empchecking("Reliance" , 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
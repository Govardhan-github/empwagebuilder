package empwagebuilder;

public class Empchecking {
	//constants
	public static final int IS_PART_TIME = 1 ;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_NO_HRS = 100;
	
	public static void main(String[] args) 
	{
	int emphrs=0;
	int totalemphrs=0;
	int totalworkingdays=0;
	System.out.println("welcome to the Empwagebuild programme");
	//Computation
	while ( totalemphrs <= MAX_NO_HRS && totalworkingdays < NO_OF_WORKING_DAYS) {
		totalworkingdays++;
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
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
	int totalempwage = totalemphrs * EMP_RATE_PER_HR;
	System.out.println("total emp wage:" +totalempwage);
	
	//empwage = emphrs * EMP_RATE_PER_HR;
	//totalEmpwage += empwage;
	
	//System.out.println("Emp wage:" +empwage);
	}
//System.out.println("Total Emp Wage: " +totalEmpwage);

	}


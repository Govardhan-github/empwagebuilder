package empwagebuilder;

public class Empchecking {
	//constants
	public static final int IS_PART_TIME = 1 ;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	
	public static void main(String[] args) 
	{
	int emphrs=0;
	int empwage=0;
	System.out.println("welcome to the Empwagebuild programme");
	//Computation
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
	empwage = emphrs * EMP_RATE_PER_HR;
	System.out.println("Emp wage:" +empwage);
	}
	

}

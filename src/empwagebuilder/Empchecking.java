package empwagebuilder;

public class Empchecking {

	public static void main(String[] args) 
	{
	//constants
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HR=20;
	int emphrs=0;
	int empwage=0;
	System.out.println("welcome to the Empwagebuild programme");
	//Computation
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if ( empcheck == IS_FULL_TIME )
		emphrs=8;
	else
		emphrs=0;
		empwage = emphrs * EMP_RATE_PER_HR;
		System.out.println("Emp wage:" +empwage);
	}
	

}

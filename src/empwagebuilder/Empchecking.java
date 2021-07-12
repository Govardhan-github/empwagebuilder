package empwagebuilder;

public class Empchecking {

	public static void main(String[] args) 
	{
	//constants
	int IS_FULL_TIME = 1;
	System.out.println("welcome to the Empwagebuild programme");
	//Computation
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if ( empcheck == IS_FULL_TIME )
		System.out.println("Emp is present");
	else 
		System.out.println("Emp is absent");
	}
	

}

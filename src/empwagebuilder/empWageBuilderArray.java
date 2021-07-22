package empwagebuilder;

public class empWageBuilderArray {

		/*
		 * Program To Calculate Employee Wage
		 */
		
		//
		public static final int IS_PART_TIME = 0 ;
		public static final int IS_FULL_TIME = 1;
		/*
		 * Declaring Constructor As Empchecking
		 */
		private int numOfCompany = 0;
		private CompanyEmpWage[] companyEmpWageArray;
		
		public empWageBuilderArray() {
			companyEmpWageArray = new CompanyEmpWage[5];
		}
		
		private void addCompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays, int maxHoursPerMonth)
		{
			companyEmpWageArray[numOfCompany] =new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHoursPerMonth); 
		numOfCompany++;
		}
		private void computeEmpWage() {
			for (int i = 0; i < numOfCompany; i++) {
				companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
				System.out.println(companyEmpWageArray[i]);
			}
		}
		/*
		 * Declaring Method To Calculate EmpWage
		 */
		private int computeEmpWage(CompanyEmpWage companyEmpWage) 	
		{
		int emphrs=0,totalemphrs=0,totalworkingdays=0;
		System.out.println("welcome to the Empwagebuild programme");
		//While Condition To Calculate Total EmpWage
		while ( totalemphrs <= companyEmpWage.maxHoursPerMonth && totalworkingdays < companyEmpWage.numOfWorkingDays) 
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
		
		return totalemphrs * companyEmpWage.empRatePerHr;
		}
		
		/*
		 * Declaring Main Method 
		 * Calling ComputeEmpWage Method Here
		 */
		public static void main(String[] args) {
			
			empWageBuilderArray  empWageBuilderArray=  new empWageBuilderArray();
			empWageBuilderArray.addCompanyEmpWage("DMart" , 20, 2,10);
			empWageBuilderArray.addCompanyEmpWage("Reliance" , 20, 2,10);
			empWageBuilderArray.computeEmpWage();
}

}
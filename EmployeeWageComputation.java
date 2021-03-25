public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		//CONSTANTS
		final int IS_PRESENT = 1;
		final int IS_FULL_TIME = 1;
		int WAGE_PER_HR = 20;
		int FULL_TIME_WORKING_HRS = 8;
		int PART_TIME_WORKING_HRS = 4;
		int WORKING_DAYS_IN_MONTH = 20;

		//VARIABLES
		int dayOfMonth = 0;
		int empDailyWage = 0;
		int empMonthlyWage = 0;
		while(dayOfMonth < WORKING_DAYS_IN_MONTH)
		{
			int checkPresence = (int) (Math.random()*10%2);
			int checkWorkingTime = (int) (Math.random()*10%2);
			switch(checkPresence)
			{
				case IS_PRESENT:
					switch(checkWorkingTime)
					{
						case IS_FULL_TIME:
							empDailyWage = FULL_TIME_WORKING_HRS * WAGE_PER_HR;
							break;
						default:
							empDailyWage = PART_TIME_WORKING_HRS * WAGE_PER_HR;
					}
					empMonthlyWage += empDailyWage;
					break;
				default:
			}
			dayOfMonth++;
		}
		System.out.println("Employee monthly wage is: "+empMonthlyWage);


	}
}

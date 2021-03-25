public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		//CONSTANTS
		final int IS_PRESENT = 1;
		final int IS_FULL_TIME = 1;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_WORKING_HRS = 8;
		final int PART_TIME_WORKING_HRS = 4;
		int WORKING_DAYS_IN_MONTH = 20;
		int MAX_WORKING_HRS = 100;

		//VARIABLES
		int dayOfMonth = 0;
		int empDailyWage = 0;
		int empMonthlyWage = 0;
		int totalWorkingHrs = 0;

		//CONDITION AND CALCULATION
		while((dayOfMonth < WORKING_DAYS_IN_MONTH) && (totalWorkingHrs < MAX_WORKING_HRS))
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
							totalWorkingHrs += FULL_TIME_WORKING_HRS;
							break;
						default:
							empDailyWage = PART_TIME_WORKING_HRS * WAGE_PER_HR;
							totalWorkingHrs += PART_TIME_WORKING_HRS;
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

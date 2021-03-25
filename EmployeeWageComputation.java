public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		final int IS_PRESENT = 1;
		int WAGE_PER_HR = 20;
		int FULL_TIME_WORKING_HRS = 8;
		int PART_TIME_WORKING_HRS = 4;
		final int IS_FULL_TIME = 1;
		int empWage = 0;
		int checkPresence = (int) (Math.random()*10%2);
		int checkWorkingTime = (int) (Math.random()*10%2);
		switch(checkPresence)
		{
			case IS_PRESENT:
				System.out.println("Employee is present");
				switch(checkWorkingTime)
				{
					case IS_FULL_TIME:
						System.out.println("Employee is full timer");
						empWage = FULL_TIME_WORKING_HRS * WAGE_PER_HR;
						break;
					default:
						System.out.println("Employee is part timer");
						empWage = PART_TIME_WORKING_HRS * WAGE_PER_HR;
						break;
				}
				break;
			default:
				System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}

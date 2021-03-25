public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		int IS_PRESENT = 1;
		int WAGE_PER_HR = 20;
		int FULL_TIME_WORKING_HRS = 8;
		int PART_TIME_WORKING_HRS = 4;
		int IS_FULL_TIME = 1;
		int empWage = 0;
		int checkPresence = (int) (Math.random()*10%2);
		int checkWorkingTime = (int) (Math.random()*10%2);
		if(IS_PRESENT == checkPresence)
		{
			System.out.println("Employee is present");
			if(IS_FULL_TIME == checkWorkingTime)
			{
				System.out.println("Employee is full timer");
				empWage = FULL_TIME_WORKING_HRS * WAGE_PER_HR;
			}
			else
			{
				System.out.println("Employee is part timer");
				empWage = PART_TIME_WORKING_HRS * WAGE_PER_HR;
			}
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}

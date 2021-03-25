public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		int IS_PRESENT = 1;
		int WAGE_PER_HR = 20;
		int FULL_WORKING_DAY_HRS = 8;
		int empWage = 0;
		int checkPresence = (int) Math.floor(Math.random()*10%2);
		if(IS_PRESENT == checkPresence)
		{
			System.out.println("Employee is present");
			empWage = WAGE_PER_HR * FULL_WORKING_DAY_HRS;
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("Employee Wage is: "+empWage);
	}
}

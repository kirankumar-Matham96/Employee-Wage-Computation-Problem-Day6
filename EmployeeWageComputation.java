public class EmployeeWageComputation
{
	public static void main(String[] args)
	{
		int IS_PRESENT = 1;
		int checkPresence = (int) Math.floor(Math.random()*10%2);
		if(IS_PRESENT == checkPresence)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}

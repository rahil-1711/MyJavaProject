package control_statement;

public class If_else_statement {

	public static void main(String[] args) {

			// IT IS USED WHEN THERE ARE TWO CONDITION
		
		
		// If your marks are greater than or equal to 40 you are pass
		// else you are fail
		
			// syntax----->
			// if(condition)
			//{
			//			 First statement to be executed
			//}
			// else
			//{
			//			another statement
			//}
		
		int marks=45;				// if you put value less than 40 it will print fail statement
									// because it is false statement
		
		if(marks>=40)				// compiler will process both condition and will print which is true
		{
			System.out.println(" You are pass ");
		}
		else {
			System.out.println(" Your are fail ");
		}
		
		
		
		
		// If signal is red then stop
		// else go
		
		String signal="red";		// if you put 'green' value here then it will print false statement
		
		if(signal=="red") 
		{
			System.out.println(" stop ");
		}
		else
		{
			System.out.println(" go ");
		}
		
		
		
		// If you are male then turn right
		// else turn left
		
		char gender='F';		// if you put 'M' then it will print true statement i.e 'turn right'
		
		if(gender=='M')
		{
			System.out.println(" turn right ");
		}
		
		else
		{
			System.out.println(" turn left ");
		}
		
		
		
		
		
		
		int rate=5;
		if(rate>2)
		{
			System.out.println("rate is good");
		}
		else {
			System.out.println("it is not good");
		}
		
		
		
		
	}

}

package control_statement;

public class Else_If_statement {

	public static void main(String[] args) {
			
			// THIS IS USED WHEN THERE ARE MULTIPLE CONDITIONS
		
		
		// example no.1
			// give condition for different class of marks
		
			// if marks are greater than or equal to 60 then first class
			// if marks are greater then or equal to 50 then second class
			// if marks are greater than or equal to 40 then just pass class
			// else fail
		
		int marks=75;						// putting diff. values will give you output acc. to statement
		
		if(marks>=60)
		{
			System.out.println(" you are in 1st class");
		}
		else if(marks>=50)
		{
			System.out.println(" you are in 2nd class");
		}
		else if(marks>=40)
		{
			System.out.println(" you are in just pass class");
		}
		else
		{
			System.out.println(" you are fail");
		}
		
		
		
		// example no.2 
			// give condition for different signals
		
			// if signal is red then stop
			// if signal is green then go
			// if signal is yellow then stop,watch and go
		
		String signal="green";		// put diff. value and output will change acc. to condition given
		
		if(signal=="red")
		{
			System.out.println(" then stop ");
		}
		else if(signal=="yellow")
		{
			System.out.println(" then stop,watch and go");
		}
		else
		{
			System.out.println(" go");
		}
			
		
		
		
		// example no.3
			// give condition to gender of people
		
			// if gender is masculine then turn right
			// if gender is feminine then turn left
			// if gender is neater then turn back
		
		
		char gender='N';		//  put diff. value and output will change acc. to condition given
		
		if(gender=='M')
		{
			System.out.println(" turn right ");
		}
		else if(gender=='F')
		{
			System.out.println(" turn left" );
		}
		else
		{
			System.out.println(" turn back");
		}
		
		
		
		String colour="yellow";
		if(colour=="black")
		{
			System.out.println("you are wrong");
		}
		else if (colour=="blue")
		{
			System.out.println("you are right");
		}
		else
		{
			System.out.println("you are speechless");
		}
		
		
		
		
		
		
		
		
		
	}

}

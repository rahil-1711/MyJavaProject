package control_statement;

public class New {
						// mock interviewed question
		// print smallest no. between these no. 20,10,30
	
	
	public static void main(String[] args)
	{
		
		int a=10;
		int b=20;
		int c=30;
		
		
		if(a<b & a<c)			// putting right condition for compiler to execute
		{
		System.out.println("smallest no. is "+a);	
		}
		else if (b<c)			// putting second right condition fro compiler to execute
		{
		System.out.println("smallest no. is "+b);
		}
		else						
		{
			System.out.println("smallest no. is "+c);
		}
		
		
		
		
		int x=55;
		int y=45;
		int z=10;
		
		if (z<x & z<y) {
			System.out.println("smallest no. is"+z);
		}
		else if(x<y)
		{
			System.out.println("smallest no. is "+x);
		}
		else
		{
			System.out.println("smallest no. is "+y);
		}
		
		
		
		
		
		// this is the other way of doing 'else if' control statement 
		
		if (x<z)		// putting  first false condition for rejection from compiler
		{
			System.out.println(" smallest no. is "+x);
		}
		else if (y<z)	// putting second false condition for rejection from compiler
		{
			System.out.println(" smallest no.is "+y);
		}
		else			// automatically compiler will execute else statement were put true value
		{
			System.out.println("smallest no. is "+z);
		}
		
		
	}
	
	
	
}

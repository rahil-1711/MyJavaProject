package calling_non_static_methods;

public class Calculator {
	
	int a= 25;   // variable  1 (declaration+ initialization 1)
	int b= 60;	 // variable  2 (declaration+ initialization 2)


	public static void main(String[] args) {
		
		Calculator calculator= new Calculator();  // object creation 1
		
		calculator.addition(); // calling non static regular method addition
		
		
		Calculator sub1= new Calculator();
		
		sub1.substraction();
		
		sub1.multiplication();
		
		sub1.division();
		
		sub1.division();
	}

	
	public void addition()
	{
		int sum= a+b;// variable 3
		System.out.println(" addition of above numbers is "+sum);
	}
	
	
	public void substraction()
	{
		int sub= a-b;
		System.out.println(" substraction of above numbers is "+sub);
	}
	
	public void multiplication()
	{
		int mul=a*b;
		System.out.println(" multiplication of above numbers is "+ mul);
	}
	
	
	public void division()
	{
		int div=a/b;
		System.out.println("division of above number is"+div); // it will show only '0' because we use ' division operator' 
																	// which shows only 'quotient'
		int div1=a%b;
		System.out.println(" division of above number is"+div); // it will show only 'remainder' of called division method
	
		int multiplication=a*b;
		System.out.println("multipication of above no. is "+multiplication);
	
	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}

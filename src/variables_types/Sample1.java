package variables_types;

public class Sample1 {

				// STATIC AND NON-STATIC GLOBAL VARIABLES
	
		int a=25;			//non-static global variable
	static int b=45;		// static global variable
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void Open() 
	{
		int x=20+a;		//we can use non-static global variable in non-static method
		int sum=45+b;		// we can also use static global variable in non-static method
		
		System.out.println("my expected sum is "+x);
		System.out.println("sum is "+sum);		//usage of static global variable 
	}
	
	
	public static void Open1()
	{
		int m=34+b;		// we can use only static global variable in static method 
		//int n=35+a;		// it is showing error we can't use non-static global variable in static method
	
		System.out.println("we can only use static variable in static method like"+m);
	
	
	}
	
	
}

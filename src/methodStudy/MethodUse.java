package methodStudy;

public class MethodUse {

	public static void main(String[] args)
	
			// calling regular static method from same class
	
				// just call method name in main method scope-----> eg. methodName();
	
	
	{
		display();  // calling the the regular method
		runtime();

	}

	public static void display()	// regular method1
	{
		System.out.println(" hi this is display static regular method");
	}
	
	
	public static void runtime()	// regular method2
	{
	System.out.println(" hi this is this calling a method from same class ");
	}
}

package calling_non_static_methods;

public class ParameterizedMethods {

	public static void main(String[] args) {

		ParameterizedMethods info = new ParameterizedMethods();  // creating object
		info.addition();  // calling non static method without parameters
		info.addition(29,56); // calling non static method with parameters
		info.addition(78,45);
		
		subtraction(); //calling static method without parameters
		subtraction(23, 12); //calling static method with parameters
		subtraction(45, 34);
		
		info.marksheet();		// methods without parameters
		info.marksheet("Amit", 34,23.5f,78.8f,true);	// methods with parameters
		info.marksheet("Rohit",23,23.6f, 98.6f,true);
		
	}

	
	public void addition ()			//method without parameters
	{
		int a=45;
		int b=22;
		int sum=a+b;
		System.out.println(" addition is "+sum);
	}
	
	public void addition(int a, int b)		//method with parameters, declaring parameters
	{
		int sum=a+b;
		System.out.println(" addition of above no. is "+sum);
	}
	
	public static void subtraction ()		//method without parameters
	{
		int x=35;
		int y=20;
		int sub=x-y;
		System.out.println(" subtraction is "+sub);
			
	}
	
	public static void subtraction(int x, int y)	//method with parameters, declaring parameters
	{
		int sub= x-y;
		
		System.out.println(" subtraction of above no. is "+sub);	
	}
	
	
	public void marksheet()
	{
		String name="Smith";
		int rollno=12;
		float age=23.8f;
		float marks=89.90f;
		boolean result=true;
		
		System.out.println("=============================");
		System.out.println(" Name of student is "+name);
		System.out.println(" Roll no. of student is "+rollno);
		System.out.println(" Age of student is "+age);
		System.out.println(" Marks of student is "+marks);
		System.out.println(" Final result of student is "+result);
		System.out.println("================================");
		
		
	}
	
	
	public void marksheet(String name, int rollno, float age, float marks, boolean result)
	{
		System.out.println("=============================");
		System.out.println(" Name of student is "+name);
		System.out.println(" Roll no. of student is "+rollno);
		System.out.println(" Age of student is "+age);
		System.out.println(" Marks of student is "+marks);
		System.out.println(" Final result of student is "+result);
		System.out.println("================================");
	}
	
	
	
	
	
	
	
	
	
}

package constructor_chaining;

public class ConstructorA {
	
			// Constructor chaining using 'this' keyword in same class
	
	
	
	public  ConstructorA()	// constructor without parameter
	
	{		this("rahil");	// calling other constructor using 'this' keyword
	
		System.out.println("this is constructor without parameter");
	}
	
	public ConstructorA(int a)		// constructor with single parameter int dataType
	{ 
	
		System.out.println("this is constructor with single parameter "+a);
	}
	
	public ConstructorA(String name)	// constructor with single parameter string dataType
	{
		System.out.println("this is constructor with String datatype "+name);
		
	}

	
	// we can call any constructor in other constructor by using 'this' keyword and by creating 
	// particular object and then calling it
	
	
	
	
	public static void main(String[] args) {
		
		ConstructorA con1=new ConstructorA();
		ConstructorA con2=new ConstructorA(67);
		
		
		
	}
}

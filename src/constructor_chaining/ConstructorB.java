package constructor_chaining;

public class ConstructorB extends ConstructorA{		// doing inheritance
	
	
	public ConstructorB()		// constructor without parameter
	{		 super(56);			// calling constructor from superclass using 'super' keyword
		System.out.println("this is constructor without parameter");
	}
	
	public ConstructorB(int a)	//  constructor with parameter
	{ 
		System.out.println(" this is constructor with int datatype");
	}
	
	
	
	public static void main(String[]args) {
	
		
		ConstructorB conB =new ConstructorB();		// creating object of constructorB without parameter
		ConstructorB conB1=  new ConstructorB(78);	// creating object of constructorB with parameter
		
	}
	
	

}

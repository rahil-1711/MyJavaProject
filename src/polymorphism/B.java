package polymorphism;

public class B extends A{

	// Run Time polymorphism----->	method declaration is going to bind its method definition/body at 
						//			run time/execution time based on object creation known as run time polymorphism
						//   		It is also known as late binding and dynamic binding polymorphism
	
	
	
	
	
	
	public static void main(String[] args) {
			
		A a= new A();			// creating object of superclass A
		B b= new B();			// crating object of subclass B
		
		
		a.play(); 				// calling method from superclass
		
		b.play(); 				// calling method in subclass but with same name as method in superclass
								// but with different object of itself is known as overriding
								// Also it has different body
		
	}
	
	public void play()
	{
		System.out.println(" this is play method from subclass");
	}

}

package casting_Study;

public class NonPrimitive_Casting {

	
	// class casting----->	converting one type of class into another type of class is known as
						//   non primitive casting 
						// 1. It is only done with same method in both sub and super class
	
	
	public static void main(String[] args)
	{
		A a=new A();
		a.bike();
		a.car();
		System.out.println("=========");
		
		
		B b=new B();
		b.bike();
		b.car();
		b.laptop();
		System.out.println("=========");
	
			// UpCasting ---> only done with same properties of sub and super class
		
		
	  A a1=new B();	// creating object of subclass and giving superclass preference
							//this is non primitive class Up casting
		
		a1.bike(); 		// method got executed is of class B because we are memory of ClassB
						// while creating non primitive class casting
		a1.car();
		
		B b1= (B) new A();
		//b1.bike();
		
	}
	
	
}

package calling_non_static_methods;

public class City1 {

	public static void main(String[] args) {
		
		// calling non-static method from same class
		
			// for calling non-static method, you have to create 'object'
			// syntax for object---> 	className objectName= new className();
		
		City1 nashik= new City1();  // created a object
		
			// calling non-static method
			// syntax ---> objectName.methosName();
		
		nashik.dwarka();
		nashik.shalimar();
		
		
		
		
		// calling non-static method from another class 
		
			// for calling non-static method from another class you have to create new object for that method
			// syntax will be the same as above  className objectName= new className();
		
		City2 pune= new City2();		// created a new object
		
			// calling non-static method from another class
			// syntax ----> objectName.methodName();
		
		pune.swargate();
		pune.katraj();
		
		
		
	}

	
	
	
	public void dwarka()
	{
		System.out.println(" this is place in nashik ");
	}
	
	
	public void shalimar()
	{
		System.out.println(" this another place in nashik ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

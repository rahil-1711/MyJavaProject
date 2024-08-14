package variables_types;

public class Sample2 {

			// CALLING STATIC AND NON-STATIC GLOBAL VARIBLES FROM SAME AND OTHER CLASS
	
		int x=45;		// non-static global variable
	static int y=50;	// static global variable
	
	
	public static void main(String[] args) {
			
		// Calling global variable from same class
		
		// 1. calling static global variable from same class
			// it is as same as calling static method from same class
			// syntax---> +'VaribleName'
		
		System.out.println(" this is static global variable from same class "+y);
		
		
		// 2. calling Non-static variable from same class
			// it is same as calling non-static method from same class
			// first you have to create object
			// syntax for calling---->   +'objectName.VaribleName'
		Sample2 stat=new Sample2();
		
		System.out.println(" this is non-static global variable from same class "+stat.x);
		
		
		
		// Calling global variable from another class
		
		// 1. calling static global variable from another class
			//syntax---->   +'ClassName.Variablename'
			
		System.out.println(" this is static global variable from class Sample1 "+Sample1.b);
		
		
		//2. calling non-static global variable from another class
			// first you have to create object of that class
			// syntax for calling ---->  +'ObjectName.VariableName'
		Sample1 stat2=new Sample1();
		
		System.out.println(" this is non-static global variable from class Sample1 "+stat2.a);
	}

}

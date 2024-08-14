package interface_Study;

public class ImpLi implements Basic_Interface {

	// Implementation class----> a class which provides definition for all incomplete methods
							//  which are present in interface with the help of 'implements' keyword.
	
	
	
	
	public static void main(String[] args) {
		System.out.println(a); // calling global variable from interface
	//	a=a+20;		// this is not allowed because variables in interface are by default are 
					// static and final
		ImpLi imp =new ImpLi();		// creating a object to call no
		imp.run();    
		imp.run2();
		imp.run3();	// own method

	}

	@Override
	public final void run()	// overriding and completing method from interface by providing definition
	{
		System.out.println(" this is incomplete method 'run'from Interface ");
		
	}

	@Override
	public void run2() 		// overriding and completing method from interface by providing definition
	{
		System.out.println(" this is incomplete method 'run2' from Interface");
	}
	
	public void run3() // own method in implementation class
	{
		System.out.println(" this is method run3 from implementation class");
	}
	

}

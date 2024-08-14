package interface_Study;

public interface Basic_Interface {
	
	//Interface----> It is one of the oops principle in java. It is pure 100% abstract in nature
		//			 Interface is use to declare incomplete methods only in it.
	
	
	
	
//	public static void main(String[]args)	// we can use main method in interface
//	{
//		go();
//	}
	

	
	int a=10;    	// by default ,variable in interface are static and final
					// i.e. static final int a=10;
	
	void run();		// by default methods are abstract and public in interface
	
	void run2();	// incomplete method by default it is abstract and public in interface
	
//	void run4()	// by providing body it directly shows that 'abstract method does not have body'
//	{
		
//	}
	
	public static void go()		// static method can be used by calling it in  main method
	{
		System.out.println(" this is static method in interface");
	}
}

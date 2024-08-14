package interface_Study;

public interface B  {

	void jump();	// incomplete method in interface
	
	//void run();		// this is same method in class A therefore we need to make it 
					// default or static to use it
	
	
	default void run()		// making it defaullt 
	{
		System.out.println(" this is default method from class B");
	}
	
	
	
}

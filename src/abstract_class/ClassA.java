package abstract_class;

public  abstract class ClassA {

				// Abstract class = this is class having at least one incomplete method / method without body
								// 1. we have use declare abstract name in method for incomplete method
								// 2. we can't create any object/constructor in class
								// 3. for using method of this class we need to create a concrete class
								//    and create extension with that class
	
	
	public static void main(String[] args) {
			
		//ClassA classA = new ClassA();		 we can't use main method in abstract class because there is
											// no use of it because we can't create any object in abstract class
											// so we can't call any method using object
		run2();				// we can call static method using main method in abstract class because it don't need object for calling
	}
	

	public void run()		// we can't call this method because it not possible to create object in abstract class
	{
		System.out.println("this is run method");
	}
	
	
	public static void run2()
	{
		System.out.println("this is run2 method");
	}
	
	public abstract void run3();
	
	
	
	
	
}

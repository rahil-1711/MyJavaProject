package abstract_class;

public class ClassB extends ClassA{
					
						// concrete class	= we need to do inheritance to call method from abstract class
						// 						in concrete class
	

	@Override
	public void run3() {						// this is incomplete method from superclassA which is 
		// TODO Auto-generated method stub		//  completed by giving command when showing error while 
												// 	doing extension with superclass
		
	}
	
	public void run4()					// this is method of classB
	{
		System.out.println("this is method from subclassB");
	}
	
	public static void main(String[] args)
	{
		
		ClassB classB= new ClassB();		// creating constructor for calling method from classA and ClassB
		
		classB.run();		// calling method from abstract classA
		classB.run3();		// calling method from abstract classA which incomplete in classA
		classB.run4();		// calling method from concrete classB
		ClassA.run2();		// calling static method from abstract classA
	}

}

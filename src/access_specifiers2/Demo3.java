package access_specifiers2;

import access_specifiers1.Demo1;

public class Demo3 extends Demo1{			// doing inheritance for calling protected method from parent class

	public static void main(String[] args) {
		
		Demo1 demo1=new Demo1();
		
		// demo1.test1();    // can't be called because test1 is private method
		
		// demo1.test2();	// can't be called because test2 is default method
		
		// demo1.test3(); 	// can't be called because calling test3 will need new object
		
		demo1.test4(); 		// it is called because test4 is public method and can be called throughout
							//  project
		
		
		Demo3 demo3=new Demo3();	// creating object for calling test3 method
		
		demo3.test3(); // calling protected method using inheritance bet. Demo1 and Demo3 class
							// because protected method needs inheritance for calling outside the package
			
	}

}

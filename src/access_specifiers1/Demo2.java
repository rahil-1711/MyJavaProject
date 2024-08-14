package access_specifiers1;

public class Demo2  {

	public static void main(String[] args) {
		
		Demo1 create=new Demo1();
		
			
		//create.test1();   // calling test1 method is not allowed because it is private method 
		//System.out.println(create.a));	--> it is not allowed because 'a' is  private variable
		
		
		
		create.test2();			// calling default method from class demo1
		System.out.println(create.b);	// calling default variable from class demo1
		
		create.test3();			// calling protected method from class demo1
		System.out.println(create.c);	// calling protected variable from class demo1
		
		create.test4();			// calling public method from class demo1
		System.out.println(create.d);	// calling public variable from class demo1
		
	}

}

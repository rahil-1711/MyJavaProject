package access_specifiers1;

public class Demo1 {

	private int a=10;		// private global variable
	int b=20;				// default global variable
	protected int c=30;		// protected global variable
	public int d=40;		// public global variable
	
	
	
	
	public static void main(String[]args)
	{
		Demo1 demo1=new Demo1();	// creating object of class demo1
		
		demo1.test1();		// calling private method within class
		System.out.println(demo1.a);	// calling global private variable within class
		
		demo1.test2(); 	// calling default method within class
		System.out.println(demo1.b); 	// calling default variable within class
		
		demo1.test3();		// calling protected method within class
		System.out.println(demo1.c);	// calling protected global variable within class
		
		demo1.test4();		// calling public method within class
		System.out.println(demo1.d);	// calling public global variable within class
		
		
	}
	
	
	private void test1()						// private method
	{
		System.out.println(" this is private method of class demo1"+a);
	}
	void test2()
	{
		System.out.println(" this is default method of class demo1"+b);
	}
	protected void test3()
	{
		System.out.println(" this is protected method of class demo1");
	}
	public void test4()
	{
		System.out.println(" this is public method of class demo1");
	}
	
	
}

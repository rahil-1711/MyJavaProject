package polymorphism;

public class Sample {
		
			// Compile Time polymorphism---> Method declaration is going to binded with its method body
								//			at time of compilation based on parameter/arguments passed is
								//          is known as compile time polymorphism
								// 			also known as early binding and static binding
	
		
	public static void main(String[] args) {
		
		Sample u=new Sample();
								// method overloading---> there are multiple method in single class with 
													//	 same method mane but with different parameters known as method overloading
		u.run();
											
		u.run(45, 34);
		
	}
	
	public void run()
	{
		int a=49;
		int b=50;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

	public void run(int a, int b)
	{
		int sum=a+b;
		System.out.println(" sum is "+sum);
		
	}
	
	
}

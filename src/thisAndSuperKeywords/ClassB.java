package thisAndSuperKeywords;

public class ClassB extends ClassA {

	int x=2; 		// global variable from classB
	
	public static void main(String[] args) {
		
		ClassB B= new ClassB();
		
		B.sample();
		

	}
	
	
	public void sample()
	{
		int x=30;					// local variable of sample method of subclass classB
		int sum1=40+x;				// using local variable in method
		System.out.println(sum1);
		
		int sum2=50+this.x;			// using global variable using 'this' keyword
		System.out.println(sum2);
		
		int sum3=70+super.x;			// using global variable from super classA by using 'super; keyword
		System.out.println(sum3);			// in inheritance we have to use super keyword for using 
											// global variable and also we can't inherit local variables
											// from super class
	}

}

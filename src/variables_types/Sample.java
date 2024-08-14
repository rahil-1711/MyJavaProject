package variables_types;

public class Sample {

	// GLOBAL VARIABLES AND LOCAL VARIABLES
	
	
	
	
		int a=49;			// global variables
		int b=67;
		
		
		public static void main(String[] args) {
			
		}
		
		public void type()
		{
			int x=34;		// local variables
			int y=55;
		}
		
		public void type1()
		{
			int sum=45+a;			// this is not showing error because we can use global variable throughout class
			int sub=67-b;
		//	int sub=58-x;			// this is showing error because we can't use local variables in other
									// method and 'x' is local variable
		}
	
	
	
	
	
	
}

package casting_Study;

public class Primitive_casting {
	
	
			// Primitive casting
	

	public static void main(String[] args)
	{
		
		// 1.implicit casting/ widening casting
		
		int a=10;
		System.out.println("my number is "+a);
		
		double b=a;	// converting small datatype into large datatype implicit casting
		System.out.println("my new number is "+b);	
		
		
		// 2.explicit casting/ narrowing casting
		
		float x=39.8f;		// large datatype 
		System.out.println("My weight is"+x);
		
		int y =(int)x;// converting large datatype into small datatype
		System.out.println("My new weight is "+y);
	}
	
}

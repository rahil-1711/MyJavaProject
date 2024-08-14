package loops;

public class Basics {

	public static void main(String[] args) {
		
		int a=30;
		int b=35;
		System.out.println(a);
		
		a=a+8;									// after assigning new value
		System.out.println(a);
		
		// increment by 1------> 'a++'
		
		System.out.println(a++); 		// it will show same value as above because it is post increment
		System.out.println(a); 		// it will show incremental value after again execution of variable
		
		
		
		
		// INCREMENT 
		
		//  Post increment---->		'a++'
		System.out.println(a++);
		System.out.println(a);   		// it will show the result
		
		//  Pre increment----->		'++a'
		System.out.println(++a);  			// it will show the result because it is pre increment
		
		
		// DECREMENT
		
		// Post decrement----> 		'a--'
		System.out.println(a--);
		System.out.println(a);  		// it will show the result because it is post decrement
		
		// Pre decrement------'--a'
		System.out.println(--a); 		// it will show result because it is pre decrement
		
		
		
		// For increment/decrement of no. more than 1
		
		System.out.println(a+4);  		// it will show result directly because it is more than 1
		System.out.println(4-a);
		System.out.println(4+a++); 		// later increment will not execute
		
		
		
		
		
		
	}

}

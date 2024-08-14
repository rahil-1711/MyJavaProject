package loops;

public class While_loop {

public static void main(String[] args) {
	
		// Creating while loop
		// syntax----->
						// 1. do initialization above and outside while loop
						// 2. put condition in while statement
						// 3. put type of  updation in statement
	
					// eg. 		initialization;
					//		while(condition)
					// 			{        statement to execute" "
					// 							updation;				           	}
	
		// 		Incremental while loops
		
		// eg. printing 10 for 15 times
		// initialization---->1
		// condition-----> 15
		// updation----> incremental by 1
	
		int x=1;
		while(x<=15)
		{
			System.out.println("10");
			x++;
		}
	
		// eg. printing table of 9
		// initialization---->9
		// condition----->90
		// updation----> incremental by 9
		
		int a=9;
		while(a<=90)
		{
			System.out.println(a);
			a=a+9;
		}
		System.out.println("===================");
		
		
		
		// Decremental while loops
		
		// eg.printing table of 9 in reverse way
		// initialization---->90
		// condition------>9
		// updation----> decremental by 9
		
		
		int r=90;
		while(r>=9)
		{
			System.out.println(r);
			r=r-9;
		}
			
		
		
}
}

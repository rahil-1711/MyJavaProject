package loops;

public class For_Loops {

	public static void main(String[] args) {

		// LOOPS
			// We use loops to execute statement no. of times by calling/using it only once
			// eg . if you have to execute statement 'rahil'150 times , then we can use loops
			//			for executing statement for multiple times
		
		// Steps to form loops
			// 1. initialization ---> (understand point of start and declare it in int datatype)
			// 2. condition --------> (understand end point)
			// 3. updation ---------> ( whether it is incremental or decremental)
		
		// syntax
			// for(initialization;condition;updation)
			// {
			//		operation---> task
			//		System.out.println();			
			// }
		
		//eg.
		
		
						// Incremental loops
		
		
		for(int b=2;b<=10;b++) {
			System.out.println("4");
		}
		for(int a=1;a<=15;++a) {
			System.out.println("rahil");
		}
		System.out.println("===============");
			// eg. want to print table of 7 ---> 7,14,21,28,.....,70
					
			// initialization--->7
			// condition----->70
			// updation----> incremental s+7
		
		for(int s=7;s<=70;s=s+7)		// incremental loop other with updation more than 1
		{
			System.out.println(s);
		}
		
		System.out.println("=============");
		
		
		
		
			// Decremental loops
		
		
		for(int a=10;a>=1;a--)
		{		
			System.out.println("3");
		}
		
		System.out.println("===========");
		
		 //eg. printing table of 7 in reverse way
				// intialization---->70
				// condition----> 7
				// updation----> decremental x=x-7
		
		for(int x=70;x>=7;x=x-7)
		{
			System.out.println(x);
		}
		
		
		
	
	
		for(int m=2;m<=100;m=m+2)
		{
			System.out.println(m);
		}
		
		for(int j=1;j<=100;j=j+2)
		{
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

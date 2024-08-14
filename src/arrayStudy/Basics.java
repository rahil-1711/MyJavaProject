package arrayStudy;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {

		// storing rollno. for 6 students
		
		//1.declaration
	
		int rollno[]=new int[6];
		
		//2.initialization
		
		rollno[0]=20;			// always start from '0'
		rollno[1]=21;
		rollno[2]=22;
		rollno[3]=23;
		rollno[4]=24;
		rollno[5]=25;			// initialize to about only max. length
		
		
		//3.usage
		
		System.out.println(rollno[5]);
		System.out.println(rollno[0]);
		System.out.println(rollno[4]);
		//System.out.println(rollno[6]); 
		
		System.out.println("=========");
		
		
		String name[]=new String[3];
		
		name[0]="rahil";
		name[1]="rahul";
		name[2]="amit";
		
		System.out.println(name[0]);
		System.out.println(name[2]);
	//	System.out.println(name[3]);		// it will show exception error due to it is not declared
		System.out.println("=========");
		
		
		// using arrays for printing
		
		
		int numbers[] =new int[5];	// array declaration
		
		numbers[0]=21;		// array initialization
		numbers[1]=22;
		numbers[2]=20;
		numbers[3]=23;
		numbers[4]=24;
		
				// static way of traversing through array
		

		for(int j=0;j<=4;j++)		//forward manner
		{
			System.out.println(numbers[j]);
		}
		
		for(int k=4;k>=0;k--)		//reverse manner
		{
			System.out.println(numbers[k]);
		}
		
				//dynamic way of traversing through array
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			System.out.println(numbers[i]);	  	// it will print as we mentioned in initialization
		}
		
		System.out.println("==========");
		
		Arrays.sort(numbers);		// to sort array use sort method
		
		//using arrays for iteration in ascending order
		
		for(int i=0;i<=numbers.length-1;i++)	// using loop for iteration in ascending order
		{ System.out.println(numbers[i]);
		}
		
		System.out.println("=======");
		
		
		// using arrays for descending order of numbers
		
		for(int i=numbers.length-1;i>=0;i--)	// using loop for iteration in descending order
		{
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
	}

}

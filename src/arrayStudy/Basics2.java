package arrayStudy;

import java.util.Arrays;

public class Basics2 {

	public static void main(String[] args) {

					// using arrays for printing
		
		
				int numbers[] =new int[5];	// array declaration
				
				numbers[0]=21;		// array initialization
				numbers[1]=22;
				numbers[2]=20;
				numbers[3]=23;
				numbers[4]=24;
				
						// static way of traversing through array
				
				for(int j=0;j<=4;j++)
				{
					System.out.println(numbers[j]);
				}
				 
				for(int k=4;k>=0;k--)
				{
					System.out.println(numbers[k]);
				}
				
						//dynamic way of traversing through array
				
				for(int i=0;i<=numbers.length-1;i++)
				{
					System.out.println(numbers[i]);	  	// it will print as we mentioned in initialization
				}
				
				
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



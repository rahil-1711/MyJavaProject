package loops;

public class Do_While_loops {

	public static void main(String[] args) {

		
		// I want to print table of 5
		
		// initialization----->5				syntax----> 
		// condition-------> x<=50							initialization;
		// updation------> x=x+5						do{
												//			"statement";
												//			updation;	
												//			} while (condition);
		
		
		int x=5;
		do
		{
			System.out.println(x);
			x=x+5;
		}while(x<=50);
		
		System.out.println("==========");
		
		
		
		// printing even numbers between  1 to 100
			// intialization----->2
			// condition-------> s<100
			// updation------> s=s+2
		
		
		int s=2;
		do
		{
			System.out.println(s);
			s=s+2;
		} while(s<100);
		System.out.println("=========");
		
		
		// I want to print table of 7 in reverse manner
			// initialization-----> 70
			// condition-------> y>=7
			// updation--------> y=y-7
		
		
		int y=70;
		do 
		{
			System.out.println(y);
			y=y-7;
			
		}while(y>=7);
		System.out.println("===========");
		
		// printing even numbers in reverse manner from 50 to 2
			// initialization-----> 50
			// condition--------> m>2
			// updation--------> m=m-2
		
		int m=50;
		do
		{
			System.out.println(m);
			m=m-2;
		} while(m>2);
		
		
		
		
		
	// print table of 5 
	
		int r=5;
		do {
			System.out.println(r);		// do while loop
			r=r+5;
		}while(r<=50);
		
		
		for(int q=4;q<=40;q=q+4)
		{
			System.out.println(q);	// for loop
		}
		
		
		int e=5;
		while(e<=50)
		{
			System.out.println(e);		// while loop
			e=e+5;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

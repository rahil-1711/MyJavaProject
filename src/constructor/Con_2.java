package constructor;

public class Con_2 {
					
						// initializing variables with constructor
	int a=13;
	int b=14;
	int c= 23;
	
	public Con_2()
	{
		 a=30;		// variable initialization with zero parameter constructor
		 b=35;
	}

	public Con_2(int x,int y)		//initializing variables with two parameters constructor
	{
		a=x;
		b=y;
	
	}
	
	public Con_2(int p, int q, int r) // initializing variables with three parameters constructor
	{
		a=p;
		b=q;
		c=r;
	}
	

	public static void main(String[] args) {

		Con_2 add= new Con_2(); // initialized object with zero parameter constructor
		add.addition();
		
		Con_2 add1=new Con_2(28, 34);// initialized object with 2 parameter constructor
		add1.addition();
		
		Con_2 add2=new Con_2(45, 56);
		add2.addition();
		
		Con_2 add3=new Con_2(45, 34, 67);
		add3.addition();
		
	}

	
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println(" sum is "+sum);
	}
}

package constructor;

public class Con_1 {
						
							// initializing object with constructor
	
	
	// Con_1   -----> default constructor
	//{
	//      Con_1---> is always there by compiler to use until user defines the constructor  	
	//					* it is given by compiler at time of compilation
	//    }
	
	
	
	// how object is initialized
	
	// Con_1 c;  ---> declaration of object
	// c= new Con_1();	-----> initialization of object
	
	
	
	
	
	public Con_1()  //  user defined constructor without parameters/ zero parameter constructor
	{
		System.out.println(" this is constructor without parameter");
	}
	
	public Con_1(int a,String b)			//user defined constructor with parameter / single parameter constructor
	{
	
		System.out.println(" this is constructor with parameter "+a+b);
	}
	
	public Con_1(String a)
	{
		System.out.println(" this is constructor with parameter "+a);
	}
	public static void main(String[] args) {

		
		Con_1 con=new Con_1();		// creating object 1
		Con_1 con1=new Con_1(28," rahil");
		Con_1 con2= new Con_1("rahul");
		
	
	
	}

}

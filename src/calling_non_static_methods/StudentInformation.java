package calling_non_static_methods;

public class StudentInformation {

	public static void main(String[] args) {

		StudentInformation info = new StudentInformation();
		info.displayInformation();
		
		info.displayInformation("sudhir", 45, 18.7f, 'a',87.7f , true);  // methods with parameters
		info.displayInformation("rahul", 34, 19.8f, 'b', 78.89f, true);
	}

	
	public void displayInformation()						// methods without parameters
	{
		// name, roll.no., age, division, %marks, result
		
		String name= "ritesh";
		int rollno= 46;
		float age= 20.5f;
		char div= 'A';
		float marks= 83.44f;
		boolean result= true; // true---->pass, false----->fail
		
		System.out.println("=============================================");
		System.out.println(" Student name =  "+ name);
		System.out.println(" Student Roll no. ="+ rollno);
		System.out.println(" Student Age = "+ age);
		System.out.println(" Student Division = "+ div);
		System.out.println(" Student Marks = "+ marks+"%");
		System.out.println(" Student Result = "+ result);
		System.out.println("==============================================");
				
	}
	
	
	public void displayInformation(String name,int rollno,float age,char div,float marks,boolean result)// methods with parameters
	{
		System.out.println("=================================================");
		System.out.println(" Student name =  "+ name);
		System.out.println(" Student Roll no. ="+ rollno);
		System.out.println(" Student Age = "+ age);
		System.out.println(" Student Division = "+ div);
		System.out.println(" Student Marks = "+ marks+"%");
		System.out.println(" Student Result = "+ result);
		System.out.println("==============================================");
				
	}
}

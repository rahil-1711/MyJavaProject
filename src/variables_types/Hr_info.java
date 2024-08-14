package variables_types;

public class Hr_info {

	public static void main(String[] args) {
		
		// Assigning values to variables from another class by creating Object
	
		
		Employee suresh=new Employee();
		 suresh.empName="Suresh";
		 suresh.empId=56;
		 suresh.empGender='M';
		 suresh.salary=56789.90f;
		 
		 suresh.test1();
		 
		 Employee mangesh=new Employee();
		  mangesh.empName="Mangesh";
		  mangesh.empId=45;
		  mangesh.empGender='M';
		  mangesh.salary=56000f;
		   
		  mangesh.test1(); 
		  
		  
		  Employee rahul=new Employee();
		  
		  rahul.empName="rahul";
		  rahul.empId=689;
		  rahul.empGender='M';
		  rahul.salary=450000f;
		  
		  rahul.test1();
	}
}
		 
	


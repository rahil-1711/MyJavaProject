package calling_non_static_methods;

public class Practise {
	
	String name;
	int rollno;
	
	
	
	public static void main(String[] args) {
		
		Practise A=new Practise();
		A.studentInfo("rahil", 10);
		A.studentInfo();
		
		
	}
	
	public void studentInfo(String stName,int stRollno)
	{
		name=stName;
		rollno=stRollno;
		
	}
	
	public void studentInfo()
	{
		System.out.println(" student name is "+name);
		System.out.println(" student roll no is "+rollno);
	}
	
	
	

}





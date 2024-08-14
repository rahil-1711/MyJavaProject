package thisAndSuperKeywords;

public class ClassA {

	int a=100;	  // global variable
	int x=30;  // global variable 
	static int c=55; // static global variable
	
	
	
	public static void main(String[] args) {
		
		ClassA A=new ClassA();
		A.add();
	}
	
	
	public void add()
	{
		int a=10;
		
		int sum=100+a;			// using local variable 
		System.out.println(sum);
		
		int sum1=100+this.a;	// using global variable due to 'this' keyword
		System.out.println(sum1);
		
		int sub=100-a;			// using local variable because 'this' is not mentioned before it
		System.out.println(sub);
		
		int c=20;
	//	int sub1=100-this.c;	// it is showing suggestion because 'c' is static global variable 
								// so  it is preferable to call it as  'className.variableName'
		int sub1=100-ClassA.c;
		System.out.println(sub1);
	}
	
	

}

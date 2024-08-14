package stringStudy;

public class Basics {

	public static void main(String[] args) {
						//jvm
						// heap area
						// String pool area------> 1.constant pool area ,2.non constant pool area
				
				
		
		
		
		
		
		String name="rahil";		// as we are declaring same data without using 
		String n1="rahil";				// 'new' keyword then for all object same memory is assigned
		String n2="rahil";			// this will be created in constant pool area
		String n3="rahil";
		
		
		String m1= new String("rahil");	// as we are using 'new' keyword then every time new memory is
										// assigned to object by compiler
		String m2=new String("rahil");	// this will be created in non-constant pool area
		
		
		
		
		String z1="rahul";
		String z2="rahul";
		
		String name1= new String("rahul");
		String nam2= new String("rahul");
		
	}

}

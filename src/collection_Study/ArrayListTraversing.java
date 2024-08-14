package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversing {

	public static void main(String[] args) {
			
		
		// using different methods for traversing through arrayList
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(39);
		ar.add("rohit");
		ar.add(50);
		ar.add(60);
		ar.add(50);
		ar.add(null);
		ar.add(null);
		ar.add(50.58f);
		ar.add("rohit");
	
		System.out.println(ar);
	
		System.out.println("========using for loop=======");
		
		// using  for loop for arrayList iteration
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
	
		System.out.println("========each for loop=======");
		
		
		// using each for loop for arrayList iteration
		
		for(Object a:ar)
		{
			System.out.println(a);
		}

		System.out.println("=======iterator=======");
		
		// using iterator for traversing through arrayList
		
		Iterator<Object> it= ar.iterator();			// creating object for iterator
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	
	}

}

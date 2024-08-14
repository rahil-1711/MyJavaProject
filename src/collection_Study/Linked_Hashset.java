package collection_Study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs= new LinkedHashSet<Object>();
		
		lhs.add(80);
		lhs.add("rahil");
		lhs.add("rohit");
		lhs.add(70);
		lhs.add(80);			// no duplicates are allowed
		lhs.add(null);			// only takes one null value
		lhs.add(null);
		lhs.add('A');
		
		System.out.println(lhs);
		
		// perform different methods in linkedHashset
		// methods
		// methods
		// methods
		// methods
		
		// does not supports---------> for loop, listIterator, enumeration
		// supports only------------> each for loop, iterator
		
		System.out.println("traversing through linkedHashset");
		System.out.println("========= each for loop ==========");
		
		for( Object l:lhs)
		{
			System.out.println(l);
		}
		
		System.out.println("====== iterator =======");
		  Iterator <Object> lin=lhs.iterator();		// forming object for iterator
		  while(lin.hasNext())
		  {
			  System.out.println(lin.next());
		  }
	}

}

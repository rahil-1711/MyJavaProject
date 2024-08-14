package collection_Study;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet();
		
		hs.add(70);
		hs.add(null);
		hs.add(null);		// only one null value is allowed in hashset
		hs.add(50);
		hs.add(50);			// no duplicates are allowed
		hs.add(60);
		hs.add(80);
		hs.add(120);
		System.out.println(hs);
		
		// need to perform different methods in hashSet
		// methods
		//methods
		//methods
		//methods
		
		
		
		
		
		//does not supports -------->  for loop, listIterator, enumeration,
		// supports only ----------->  each for loop, Iterator
		
		System.out.println(" traversing through hashset ");
		
		System.out.println("====== for each loop ======");
		
		for( Integer hst:hs)
		{
			System.out.println(hst);
		}
		
		System.out.println("====== iterator =====");
		
		Iterator<Integer> has=hs.iterator();	// forming variable for iterator
		
		while(has.hasNext())
		{
			System.out.println(has.next());
		}
		
		
		
		
		

	}
}


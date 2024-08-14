package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {

		Vector<Object> ve= new Vector<Object>();
		ve.add("vijay");
		ve.add(null);
		ve.add(50);
		ve.add('A');
		ve.add(null);
		ve.add(false);
		System.out.println(ve);		// printed vector
		System.out.println("====== for loop ======");
		
		for(int i=0; i<=ve.size()-1;i++)	// with for loop 
		{
			System.out.println(ve.get(i));
		}
		
		System.out.println("======= each for loop =======");
		for(Object v:ve) // with each for loop
		{
			System.out.println(v);
		}
		
		System.out.println("====== iterator for traversing=======");
			Iterator<Object> it= ve.iterator(); 
		
		while(it.hasNext())		//  with iterator
		{
			System.out.println(it.next());
		}
		
		System.out.println("====== List iterator forward direction ========");
			ListIterator<Object> l= ve.listIterator();
		
		while(l.hasNext())	// with listIterator in forward direction
		{
			System.out.println(l.next());
		}
		
		System.out.println("===== List iterator backward direction=======");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		System.out.println("=======enumerator======");		//only supports in legacy class i.e. vector

		Enumeration<Object> en= ve.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
		
	}

}

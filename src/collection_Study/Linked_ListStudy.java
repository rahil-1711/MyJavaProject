package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_ListStudy {

	public static void main(String[] args) {

		LinkedList<Object> lin= new LinkedList<Object>();
		lin.add(80);
		lin.add("raj");
		lin.add("rahul");
		lin.add(null);
		lin.add(true);
		lin.add('A');
		System.out.println(lin);
		System.out.println(lin.get(3));
		System.out.println(lin.element());  //gives first element in list
		System.out.println(lin);
		
		System.out.println(lin.peek());		//gives first element in list without removing it
		System.out.println(lin);
		System.out.println(lin.poll());		// gives first element in list and removes it from list
		System.out.println(lin);
		
		System.out.println(lin.pop());		// gives first element in list and removes it from list
		System.out.println(lin);
		
		lin.push("Asia");		// adds given element at initial position of list
		System.out.println(lin);	
		System.out.println(lin.size()); 
		Object tin=lin.clone();
		System.out.println(lin.clone());
		System.out.println(tin);
		System.out.println(lin.contains("rahul"));
		System.out.println(lin.get(2));
		System.out.println(lin.indexOf(true));
		//lin.clear();
		
		System.out.println(lin.isEmpty());
		System.out.println(lin.lastIndexOf("Asia"));
		System.out.println(lin.remove(2));
		System.out.println(lin);
		lin.set(3,"world");				// adds element in list as per given index reference
		System.out.println(lin);
		
		System.out.println("======traversing LinkedList========");
		
		System.out.println("=======using for loop=======");
		for(int i=0;i<=lin.size()-1;i++)
		{
			System.out.println(lin.get(i));
		}
		System.out.println("=======using each for loop=====");
		for(Object lis:lin)
		{
			System.out.println(lis);
		}
		System.out.println("======using iterator=====");
		Iterator<Object> it= lin.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====list iterator=====");
		ListIterator<Object> b= lin.listIterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		System.out.println("======list iterator reverse======");
		while(b.hasPrevious())
		{
			System.out.println(b.previous());
		}
		
	}

}

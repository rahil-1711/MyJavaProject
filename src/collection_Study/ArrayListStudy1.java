package collection_Study;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.add(10);				// takes duplicate values also
		al.add(10);
		System.out.println(al);
		al.add(null);		// it takes null value also
		al.add(null);
		System.out.println(al);
	}
	
	
	

}

package stringStudy;

public class String_methods {
	
	public static void main(String [] args)
	{
		String s="nashik";
				//012345
		
		// max. index-->5
		// min.index--->0
		// length--> 6 = max.length+1
	
		System.out.println(s);
		
		
		// 1.length();
		System.out.println(s.length());	   // to count length of data
		
		 int lengthofString= s.length();		// reference variable
		
		System.out.println(lengthofString); // to count length using reference variable
		System.out.println("=========");
		
		
		
		//2.toUpperCase();
		
		System.out.println(s.toUpperCase()); 	// to make data in upperCase
		
		String b="Velocity";		// creating new object 
		System.out.println(b.toUpperCase());
		String c=b.toUpperCase();				//making reference variable
		System.out.println(c);	// to convert upperCase use of reference variabe
		
		System.out.println("========");
		
		
		//3.toLowerCase();
		
		String d="ALPHA";		// by changing case in data we can get same output 
		System.out.println(d.toLowerCase());	// to make data in lower case
		String e=d.toLowerCase();		// creating reference variable
		System.out.println(e);	// using reference variable for lowerCase
		System.out.println("=======");
		
		
		
		//4.equals();
		
		String m1="loyal";
		String m2="loyal";
		String m3="loyal";
		String m4=new String("loyal");
		String m5=new String("Loyal");
		String m6=new String("LOYAL");
		
			// diff. between '==' and 'equals'
		
		System.out.println(m1==m2);	// '==' sign checks only memory location if it is same then will show true value
		System.out.println(m2==m3);
		System.out.println(m3==m1);	// all above true bec. of same memory location in constant pool
		System.out.println(m1==m4);	// this will show false boolean value bec. diff. memory location due to 'new' keyword
		System.out.println("=========");
		System.out.println(m1.equals(m2));	//'equals' checks only content of variable if it is same then shows true boolean value
		System.out.println(m2.equals(m3));
		System.out.println(m3.equals(m4));	// all above will show true boolean value bec. content of variable is same
		System.out.println(m4.equals(m5));	
		
		System.out.println(m5.equals(m6));	// it shows false result bec. content of variable are different
		
		System.out.println("=========");
		
		//5.equalsIgnoreCase();
		
		System.out.println(m4.equalsIgnoreCase(m5));
		System.out.println(m5.equalsIgnoreCase(m6));
		
		System.out.println("========");
		
		
		//6.contains();
		
		String f="Architecture";
		
		System.out.println(f.contains("t"));
		System.out.println(f.contains("Archi"));
		System.out.println(f.contains("archi")); 	// write a correct data otherwise it will show false value
		System.out.println(f.contains("srd"));		// if we put wrong data it shows false value
		System.out.println("========c");
		
		//7.isEmpty();
		
		String g="reliable";	//with char.
		String g2="";			//blank
		String g3=null;			//null
		String g4="      ";		// with blank spaces
		
		System.out.println(g.isEmpty());
		System.out.println(g2.isEmpty());
		System.out.println(g4.isEmpty());
	//	System.out.println(g3.isEmpty());// it shows nullpointer.exception due to null value
										// also futher execution is restricted
		System.out.println("======e");
		
		
		//8.isBlank();
		
		String h="";
		String h1="    ";
		String h2="and";
		
		
		System.out.println(h.isBlank());
		System.out.println(h1.isBlank());
		System.out.println(h2.isBlank());
		System.out.println("========");
		
		
		//9.charAt();
		
		String i="testing";
		
		System.out.println(i.charAt(0));
		System.out.println(i.charAt(3));
		System.out.println(i.charAt(5));
		char value=  i.charAt(4);			//reference variable
		System.out.println(value);
		
	//	System.out.println(i.charAt(8));// shows exception 'stringIndexOutofBound' due to high value
	//	System.out.println(i.charAt(-1));// shows exception 'stringIndexOutofBound' due to lower value
		System.out.println("=======r");
		
		
		// 10.endsWith();
		
		String j="Mumbai";
		
		System.out.println(j.endsWith("i"));
		System.out.println(j.endsWith("bai"));	// only checks ending character
		System.out.println(j.endsWith("Mum"));
		System.out.println(j.endsWith("ba"));
		System.out.println(j.endsWith("Mumbai"));	// also checks with whole value and gives true results
		System.out.println("=======");
		
		
		
		// 11.startsWith();
		
		String k="Nashik";
		
		System.out.println(k.startsWith("N"));
		System.out.println(k.startsWith("Nas"));
		System.out.println(k.startsWith("Nashik"));
		System.out.println(k.startsWith("ashik"));
		System.out.println(k.startsWith("hik"));
		System.out.println("========sw");
		
		
		//12.subString();
		
		String l="Citadel";
		
		System.out.println(l.substring(2));	// gives result till end from given index
		System.out.println(l.substring(0));
		
		System.out.println(l.substring(3, 5));	// for in between characters
		System.out.println(l.substring(2,5));
		System.out.println("=======");
		
		
		//13.concat();
		
		String n1="velocity";
		String n2=" classes";
		String n3=" Pune";
		
		System.out.println(n1.concat(n2));	// combining strings
		System.out.println(n1.concat(n3));
		System.out.println(n3.concat(n1));

		String n4= n1.concat(n2);	// creating reference variable
		System.out.println(n4);
		System.out.println(n4.concat(n3));	// using reference variable for more combination
		System.out.println("===========m");
		
		//14.indexOf();
		
		String p="developer";
		
		System.out.println(p.indexOf("l"));
		System.out.println(p.indexOf("e"));
		System.out.println(p.indexOf("p"));
		
		System.out.println(p.lastIndexOf("e"));	// for checking last index of repeting char.
		
		System.out.println(p.indexOf("e",4));	// for checking midway index of repeting char.
		System.out.println(p.indexOf("l",3));
		
		System.out.println(p.indexOf("t"));	// putting wrong input it shows result of '-1'
		
		System.out.println(p.indexOf("devel"));	// for group of char it takes first index no.
		System.out.println(p.indexOf("loper"));
		System.out.println("=======");
		
		
		//15.replace();
		
		String q="universe";
		
		System.out.println(q.replace("i","e"));
		System.out.println(q.replace("u","r"));
		
		System.out.println(q.replace("uni","multi"));	// replacing group of character
		System.out.println(q.replace("uni","ad"));
		System.out.println("======split");
		
		//split
		
		String r="Velocity Corporate Training Centre";
		System.out.println(r);
		String[] y = r.split("");		// creating reference variable
		for(int z=0;z<=y.length-1;z++)
		{
			System.out.println(y[z]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	


}

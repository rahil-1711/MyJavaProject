package inheritance;


public class Multi_Level_Inheritance {

	public static void main(String[] args) {
			
			//MULTI LEVEL INHERITANCE :
		
		// GRANDFATHER---->FATHER------>SON
		
		
		Grandfather grandfather=new Grandfather();     // object of class grandfather
		
		grandfather.property(); 		// non static method from  parent class grandfather
		Grandfather.watch(); 			// static method from  parent class grandfather
		
		
		Father father=new Father();			// object of class father
		
		father.voice();				// non static method from class father
		father.height();
		Father.home(); 			// static method from class father
		
		father.property();	// calling  non static method from class grandfather using 'father' object
		Father.watch();		// calling static method from class grandfather using 'Father' className
		 
		
		// using multi-level inheritance in class
		
		
		
		Son son=new Son();
		
		son.colour();		// non static method from sub class son
		son.studious();
		
		son.height();		// non static method from parent class father
		son.voice();
		Son.home();		// static method from parent class father
		
		son.property();		// non static method from parent class grandfather
		Son.watch();		// static method from parent class grandfather
		
		
		
		
		
		
		
		
		
		
	}

}

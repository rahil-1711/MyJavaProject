package inheritance;

public class Single_Level_Inheritance {

	public static void main(String[] args) {

				// SINGLE LEVEL INHERITANCE
		
		// FATHER---------->SON
		
		
		
		Father father=new Father();
		Son son= new Son();
		
		father.height();
		father.voice();
		
		son.colour();
		son.studious();
		son.height();				// this is how we can use inheritance by object of other class
		son.voice();				// which is subclass of superclass
		
		
	}

}

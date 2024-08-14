package inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {

		DivisionA divA=new DivisionA();
		DivisionB divB=new DivisionB();
		
		
		divA.principle();	// calling non static method from class School using divA object
		divA.Classteacher();	// calling non static method from class divisionA using object 
		DivisionA.sports();	// calling static method from class School using inheritance
		DivisionA.studentA();	// 
		
		divB.principle();	//calling non static method from class School using divB object
		divB.girls();	//calling non static method from class divisionB using object 
		DivisionB.sports();	//calling static method from class School using inheritance
		DivisionB.boys(); //calling static method from class DivisionB
		
		
	}

}

package control_statement;

public class If_Statement {

	public static void main(String[] args) {
		
		//IT IS USE WHEN THERE IS ONLY ONE CONDITION
		
		
		// If marks are greater than 40 you are pass
		
			//1. First determine variable and dataType
			// syntax-----> 
				// if(condition){   statement to be executed }
		
		int a=43;    // first example		
	
		if(a>40) {
			System.out.println(" You are pass");   /* if condition is true then it will
			 										    execute otherwise there is no output shown */
													
		}
		
	
		// If signal is red then stop
		
			//String signal="green";			// if you put 'green' then it is not going to execute 
		
		String signal="red";
		
		if(signal=="red") {
			System.out.println(" stop");
		}
		
		
		// If you are male(M) then turn right
		
		char gender='M';
		
		if(gender=='M') {
			System.out.println(" turn right");
		}
		
		
		
		
		
		
		
		
	}

}

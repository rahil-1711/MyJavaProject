package control_statement;

public class Nested_If_Else_statement {

	public static void main(String[] args) {
		
		// Enter email id 
		// if email is correct then enter password
		// if password is correct then login
		// else password is incorrect
		// else email id is incorrect
		
		String emailId= "rahilp@gmail.com";		// putting wrong values in variable will give you 
		String password="rahil234";					// diff. result in output
		
		if (emailId=="rahilp@gmail.com")
		{
			System.out.println(" Email Id is correct , enter password");
			
			
			if(password=="rahil234")
			{
				System.out.println(" Password is correct, enter login");
			}
			else
			{
				System.out.println(" password is incorrect");
			}
		}
		else
		{
			System.out.println(" Email Id is incorrect");
		}
		
		
		
		// enter number
		// if number is 10 then correct
		// if sum is 30 then correct
		// else sum is incorrect
		// else no is incorrect
		
		int a=10;
		int b=a+20;
		
		if(a==10)
		{
			System.out.println(" then number is correct");
			
			if(b==30) 
			{
			System.out.println(" then sum is correct");
			}
			else
			{
				System.out.println(" sum is incorrect");
			}
		}
		else
		{
			System.out.println(" number is incorrect");
		}
		
		
		// enter password
		// if password is right then enter captcha
		// if captcha is right then enter to login
		// else captcha is wrong 
		// else password is wrong
		
		String password1="rahil23";
		String captch="umnBr5";
		
		if (password1=="rahil23")
		{
			System.out.println("then enter the captcha");
			
			if(captch=="umnBr5")
			{
				System.out.println("then enter to login");
			}
			else
			{
				System.out.println("captch is wrong");
			}
		}
		else
		{
			System.out.println("password is wrong");
		}
		
		
		
		String email="rahil@1278";
		String passw="67890";
		
		
		if (email=="rahil@1278")
		{
			System.out.println("email is correct enter password");
			
			if (passw=="67890")
			{
				System.out.println(" enter login");
			}
			else
			{
				System.out.println("password is incorrect");
			}
		
			
		}else
		{
			System.out.println("email id is incorrect");
		}
		
		
	}

}

package control_statement;

public class Switch_Case_statement {

	public static void main(String[] args) {
		
		
		
		// considering days---- day 1,2,3,4,5,....
		
		int day=3;				// declaring variable for switch statement
		
		switch(day)				// switch expressions
		{
		// case statements
		
		case 1:System.out.println("Today is sunday");		
		break;
		
		case 2:System.out.println("Today is monday");
		break;
		
		case 3:System.out.println("Today is tuesday");
		break;
		
		case 4:System.out.println("Today is wednesday");
		break;
		
		case 5:System.out.println("Today is thursday");
		break;
		
		case 6:System.out.println("Today is friday");
		break;
		
		case 7:System.out.println("Today is saturday");
		break;
		
		default:							// default case statement
			System.out.println(" Please enter value between 1 to 7");
			break;
		}
		
		
		
		// considering gender M/F
		
		char gender='M';			// declaring variable for switch expression
		
		switch(gender) 				// switch expression
		{
			// case statement
		
		case 'M':System.out.println("You are male");
		break;
		
		case 'F':System.out.println("You are female");
		break;
		
		default:													// default statement
			System.out.println(" please enter values between M/F");
		
		}
		
		
		// considering months-----> jan,feb,mar,apr,may,.....,dec.
		
		String month="jul";				// declaring variable for switch statement
		
		switch(month) 				// switch expression
		{
			// case statement
		
		case "jan": System.out.println(" this month is January");
		break;
		case "feb": System.out.println(" this month is February");
		break;
		case "mar": System.out.println(" this month is March");
		break;
		case "apr":System.out.println(" this month is April");
		break;
		case "may":System.out.println(" this month is May");
		break;
		case "jun":System.out.println(" this month is June");
		break;
		case "jul":System.out.println(" this month is July");
		break;
		case "aug":System.out.println(" this month is August");
		break;
		case "sep":System.out.println(" this month is September");
		break;
		case "oct":System.out.println(" this month is October");
		break;
		case "nov":System.out.println(" this month is November");
		break;
		case "dec":System.out.println(" this month is December");
		break;
		default:System.out.println(" please enter value between january-december");
		}
		
		
		//considering currencies----> rupee,dollar,euro,renbimbi,dinar.
		
		String currency="renbimbi";
		
		switch(currency) {
		
		case "rupee":System.out.println(" this is currency of India");
		break;
		case "dollar":System.out.println(" this is currency of US");
		break;
		case "euro": System.out.println(" this is currency of France");
		break;
		case "renbimbi":System.out.println(" this is currency of China");
		break;
		case "dinar": System.out.println(" this is currency of Kuwait");
		break;
		default:System.out.println(" Please enter valid currency ");
		
		
		}
		
		
		// days of months----> 28,30,31			(eg. of combining cases with same values
		
		String month1="march";
		
		switch(month1)
		{
		case "feb": System.out.println(" It has 28 days");
		break;
		case "january":
		case "march":					
		case "may":							// combined cases with same values
		case "july":
		case "august":
		case "october":
		case "december":	System.out.println(" it has 31 days");
		break;
		
		case "april":
		case "june":
		case "september":
		case "november":	System.out.println(" it has 30 days");
		break;
		default: System.out.println(" please enter valid month");
			
		
		}
		
		
		int rollno=5;
		
		switch(rollno)
		{
		case 1: System.out.println("rahil");
		break;
		case 2: System.out.println("vishal");
		break;
		case 3: System.out.println("rohit");
		break;
		default: System.out.println("you are not from our class");
		}
		
		
		

	}

}

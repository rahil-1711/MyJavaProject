package arrayStudy;

public class Basics4 {

	public static void main(String[] args) {
			
			// using arrays for column and row printing
		
		int ar[][]= new int[2][2];			// creating object
		
		ar [0][0]=29;
		ar [0][1]=50;
		ar [1][0]=57;
		ar [1][1]=60;
		
		System.out.println(ar[0][0]);
		System.out.println(ar[1][1]);
		
		System.out.println("=======");
		
		// outer loop ------> represents rows
		// inner loop --------> represents columns
		
		for(int i=0;i<=1;i++)		// outer for loop for rows
		{
			for(int j=0;j<=1;j++)	// inner for loop for columns
			{
				//System.out.println(ar[i][j]);	// this will print in straight line
			
			System.out.print(ar[i][j]+" ");		// this will print in rows and columns
		
			} System.out.println();
		}
		System.out.println("========");
		
		String al[][]= new String[2][2];
		
		al [0][0]="rohit";
		al [0][1]="raj";
		al [1][0]="tushar";
		al [1][1]="amit";
		
		for(int p=0;p<=1;p++)
		{
			for(int q=0;q<=1;q++)
			{
				System.out.print(al[p][q]+" ");
			}
			System.out.println();
		}
		System.out.println("=======");
		
		String ap[][]= new String[2][2];
		
		ap[0][0]="rahil";
		ap[0][1]="rahul";
		ap[1][0]="rohit";
		ap[1][1]="rajesh";
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(ap[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		int ax[][]=new int[2][2];
		
		ax[0][0]=29;
		ax[0][1]=20;
		ax[1][0]=30;
		ax[1][1]=40;
		
		for(int a=0;a<=1;a++)
		{
			for(int b=0;b<=1;b++)
			{
			 System.out.print(ax[a][b]+" ");
			}
		System.out.println();	
		}
		
		
		
	}

}

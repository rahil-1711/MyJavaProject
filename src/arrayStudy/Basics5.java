package arrayStudy;

public class Basics5 {

	public static void main(String[] args) {
		
		// printing rows and columns using declaration of curly brackets
		
		int ar[][]= {{1,2},{3,4}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
					System.out.print(ar[i][j]+" ");
			}System.out.println();
		}
	}

}

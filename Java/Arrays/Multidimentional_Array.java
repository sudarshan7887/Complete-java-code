
public class Multidimentional_Array 
{

	public static void main(String[] args) 
	{
		int a[] = new int[4]; // one dimentional array
		int b[][] = new int[4][4]; // two dimentional array
		int c[][][] = new int[4][4][4]; // three dimentional array

		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				for (int k = 0; k < 4; k++) 
				{
					c[i][j][k] = i + j + k;
				}
			}
		}
			
			/*
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				for (int k = 0; k < 4; k++) 
				{
					System.out.print(" " + k);
				}
				System.out.println("");
			}
			System.out.println("");
		}
		  */
		
		//enhanced for loop
		
		for (int i[][] : c ) 
		{
			for (int j[] : i ) 
			{
				for (int k : j ) 
				{
					System.out.print(" " + k);
				}
				System.out.println("");
			}
			System.out.println("");
		}
		

	}

}

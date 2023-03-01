
public class enhancedForLoop 
{

	public static void main(String[] args) 
	{
		
		//enhanced for loop for 1d
		
//		int a[] = {2,4,6,8,1};
//
//		for (int k : a)            //enhanced for loop for 1d
//		{
//			System.out.println(k);
//		}
		
		
		//enhanced for loop for 2d
		
		int a[] = {2,4,6,8,1};
		
		int b[] = {3,6,9,2,5};
		int c[] = {4,8,2,6,9};
		 
		int d[][] =
			       {                   
			    		   {2,4,1},
			    		   {3,6,9,5},
			    		   {4,8,2,6,9}
			       };
		for (int i = 0;i<d.length;i++)            //rows 
		{
			for(int j = 0;j<d[i].length;j++)         //columns
			 {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		
		for(int k[] : d) 
		{
			for (int l : k)
			{
			System.out.println(" "+l);	
			
		}
		System.out.println();
	}

	}
}

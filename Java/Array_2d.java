
public class Array_2d 
{
	public static void main(String[] args) 
	{
		int a[] = {2,4,6,8,1};
		int b[] = {3,6,9,2,5};
		int c[] = {4,8,2,6,9};
		 
		int d[][] =
			       {
			    		   {2,4,6,8,1},
			    		   {3,6,9,2,5},
			    		   {4,8,2,6,9}
			       };
		for (int i = 0;i<3;i++)            //rows 
		{
			for(int j = 0;j<5;j++)         //columns
			 {
				System.out.print(" "+d[i] [j]);
			}
			System.out.println();
		}
	}

}

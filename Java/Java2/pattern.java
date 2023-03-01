
public class pattern 
{

	public static void main(String[] args) 
	{
		int i ;
		int j ;
		
		// * pattern
		
		/*
		  
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
			  System.out.print("*");
		    }
		   System.out.println("");
		}
		
		*/
		
		/*
		1 1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5 pattern
		*/
		
		  
		for(i=1;i<=5;i++)         //rows
		{
			for(j=1;j<=i;j++)    //columns    
			{
			  System.out.print(i + " ");
		    }
		   System.out.println("");
		}
		
		
		
		/*
		1
		01
		101
		0101
		10101 pattern
		*/
		
		
		/*
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j) % 2==0)
			       System.out.print("1 ");
			   else
		           System.out.print("0 ");
			}
			System.out.println("");
		}
		
		*/
		
		
		/*
		 1 2 3 4
		 2 3 4 5
		 3 4 5 6 
		 4 5 6 7 pattern
		  */
		
//		for(i=1;i<=4;i++)         //rows
//		{
//			for(j=1;j<=4;j++)    //columns    
//			{
//			  System.out.print(i + j-1 + " ");
//		    }
//		   System.out.println("");
//		}
	}

}

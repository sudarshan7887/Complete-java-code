
public class ExceptionHandelling 
{

	public static void main(String[] args) 
	{
		


		try
		{
			int a[] = new int[6];
			a[6] = 8;
		    int i =7;
		    int j = 0;
		    int k = i/j;
		    System.out.println("output is:"+k);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)   //it is one way or another is you use multiple catch block
		{
			System.out.println("Error");
		}
		
		
	  finally
	  {
		  System.out.println("Bye");
	  }
	}
}

	
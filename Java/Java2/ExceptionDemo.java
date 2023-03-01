
/*
 * java language uses exceptions to handle errors and other exceptional events
   it is used to handle the runtime errors such as ClassNotFound.
   Three types of Exceptions:
   Checked Exception 
   Unchecked Exception
   Error
   
   Error :-can'[t be Handled
   Exception :- can be Handled
   */
public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int i,j;
		int k=0;
		i = 4;
		j = 0;
		try
		{
			k = i/j;  //unchecked Exception
		}
		catch(Exception e)
		{
			System.out.println(e +" No cannot Divide by zero");
		}
		System.out.println(k);
	}

}

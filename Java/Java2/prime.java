
public class prime 
{

	public static void main(String[] args) 
	{
		int n=29;
		boolean isPrime = true;
		
		//for (int i=2;i<n;i++)
		//for (int i=2;i<n/2;i++)
		
		for(int i=2;i<Math.sqrt(n);i++)
			
			   			//same output of these 3 for loop
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
				
			}
		}
		if(isPrime)
		{
			System.out.println(n + " is a prime number");
			
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}

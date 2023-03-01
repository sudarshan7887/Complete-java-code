
public class perfect_number 
{

	public static void main(String[] args) 
	{
		/*
		perfect number
		i.e
		6=1+2+3=6
		28=1+2+4+7+14=28
		*/
		
		int n = 28;
		boolean b = isPerfect(n);
		if(b)
			System.out.println("Its a perfect number");
		else
			System.out.println("Its not");
		
	}
		public static boolean isPerfect(int n)
		{
			int sum = 0;
			for (int i=1;i<n;i++)
			{
				if(n%i==0)
					sum = sum+i;
				
			}
			if(n==sum)
				return true;
			
			return false;
			
		}
		
}

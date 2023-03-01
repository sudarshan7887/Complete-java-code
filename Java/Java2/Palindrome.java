
public class Palindrome 
{
 //palindrome means input and output are same
//	i.e 121 = 121 its a palindrome number
	
	public static void main(String[] args) 
	{
		
		int n = 121;
		int s = 0;
		int r;
		int t = n;
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			s = s*10+r;
			
		}
		if(t==s)
		{
			System.out.println("Its a palindrome number");
		}
		else
		{
			System.out.println("Its not a palindrome number");
		}
	}

}

import java.util.Scanner;
public class fibonacci_series 
{

	/*
	 e.g :1 1 2 3 5 8 13 21 ....n;
	 1+1=2+1=3+2=5+3=8+5=13+8=21...n;
	 */
	public static void main(String[] args) 
	{
		
		int k=0,a=1,b=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int n = sc.nextInt();
		
		
		System.out.print("1 1 ");
		while(k<=n)
		{
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
	}

}

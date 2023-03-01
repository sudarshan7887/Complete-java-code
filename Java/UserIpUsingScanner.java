import java.util.Scanner;
public class UserIpUsingScanner 
{

	public static void main(String[] args) 
	{
		int n,l,m;
		System.out.println("enter your 1st number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter your 2nd number:");
		l = sc.nextInt();
		m = l+n;
		System.out.println("the addition is:");
		System.out.println(m);
		
	}

}

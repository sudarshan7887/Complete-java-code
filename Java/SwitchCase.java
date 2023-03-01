import java.util.Scanner;
public class SwitchCase 
{
	public static void main(String args[])
	{
		int n;
		//in this way String,char use in switch case
		System.out.print("Enter your number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("you enter one");
			break;
		case 2:
			System.out.println("you enter two");
			break;
		case 3:
			System.out.println("you enter three");
			break;
		case 4:
			System.out.println("you enter four");
			break;
		case 5:
			System.out.println("you enter five");
			break;
		default:
			System.out.println("numer is not match");
			break;
		}
		
	}

}

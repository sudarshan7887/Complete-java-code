import java.util.Scanner;

public class UserInput_Scanner 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any String");
		String str;
		str = sc.nextLine(); // for String

		System.out.println("The String is : " + str);

		int i;
		System.out.println("Enter any value");

//		i = Integer.parseInt(sc.nextLine());
		// OR
		i = sc.nextInt(); // for int

		System.out.println("the inteeger valur is : " + i);
	}

}

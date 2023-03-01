
public class labeled_break_statement 
{

	public static void main(String[] args) 
	{
		sudarshan:
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if(i==3)
						break sudarshan;   //labeled break statement
					System.out.print("*");
				}
				System.out.println("");
			}

	}

}


public class breakAndContinue 
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				continue;            //jumping statement
			}
			else if(i>8) {
				break;              //breaking statement
			}
			System.out.println("value is :"+i);
		}
	}
}

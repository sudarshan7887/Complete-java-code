import java.io.BufferedReader;
import java.io.InputStreamReader;

//Bufferreader
//Scanner
public class CheckedException
{
	public static void main(String[] args) throws Exception
	{
		int n = 0;
		System.out.println("Enter a number");
		BufferedReader br =null;
		try
		{
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());   //45
		System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();
		}
		System.out.println(n);
   }


}

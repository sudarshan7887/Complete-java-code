import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput_Bufferedreader
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter any Value");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = (br.readLine());  //for String
		System.out.println(n);
		
		int m = Integer.parseInt(br.readLine());    //convert String into integer	
		System.out.println(m);
	}

}

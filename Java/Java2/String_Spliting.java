//   CSV -> Comma Seperate Values

public class String_Spliting
{

	public static void main(String[] args)
	{
		String str = "Ram,Shayam,Radha,Geeta,Sita";
		
	String names[] = str.split(",");
		System.out.println(names[2]); //print only 2nd index value
		
		for(String val : names)
			System.out.println(val);    //print all the values in one by one
		
	}

}

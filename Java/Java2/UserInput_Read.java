/*
 	System.in.read() in java is  used to read the input from the user.
 	System.in.read() gets the next byte of input from the standard input stream
 * */
public class UserInput_Read
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("enter any value");
		int i = System.in.read();
		System.out.println(i);
		//System.out.println((char)i);
		
	}

}

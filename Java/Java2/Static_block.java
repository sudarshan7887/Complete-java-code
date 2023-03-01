
public class Static_block 
{
	//static block exicute first then exicute main method
	
	static String s = "";
	static
	{
		s = "Hello world !" ;
	}
 public static void main(String args[])
 {
	 System.out.println("The value of s: " +s);
 }
 
}

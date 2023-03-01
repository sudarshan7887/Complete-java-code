
class F
{
	 final int DAY = 01;       //final is used to constant
	public F()
	{
		// DAY =10;        //if you not used final tkeyword then commentted part work
	}
}



public class Final_keyword 
{
public static void main(String args[])
{
 F obj = new F();
 
 System.out.println(obj.DAY);
}
}
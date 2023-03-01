	class Printer
	{
		public void show (Integer i)
		{
			System.out.println(i);
		}
		public void show (Double i)
		{
			System.out.println(i);
		}
		
	}


public class Abstract_keyword
{
	public static void main (String args[])
	{
		Printer obj = new Printer();
		obj.show(5.5);
	}
}
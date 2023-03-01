class Hii extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hii");
			try {
				Thread.sleep(500);             //print after 500 ms
				}
			catch (Exception e) 
			{}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Sudarshan");
			try {
				Thread.sleep(500);
				}
			catch (Exception e) 
			{}
		}
	}
}
public class MultiThreading 
{

	public static void main(String[] args) 
	{
		Hii obj1 = new Hii();
		Hello obj2 = new Hello();
		
		obj1.start();
		try {Thread.sleep(10);}catch (Exception e) {}
		obj2.start();
      
	}

}

class hii implements Runnable      //Runable interface
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
class hello implements Runnable
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
public class MultiThreadingRunnable 
{

	public static void main(String[] args) 
	{
		
		hii obj1 = new hii();
		hello obj2 = new hello();
		
		Thread t1 = new Thread(obj1);           //obj1,obj2 is runnable interface
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);}catch (Exception e) 
		{}
		t2.start();
	}

}

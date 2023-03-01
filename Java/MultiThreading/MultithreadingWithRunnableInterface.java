class hii implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Hii");
			try	{ Thread.sleep(500);}catch(Exception e)	{}
		}
	}
}

class hello implements Runnable
{
	public void run()
 	{
 		for(int i=1;i<=5;i++)
 		{
 			System.out.println("Hello");
 			try	{ Thread.sleep(500);}catch(Exception e)	{}
 		}
 	}
}
public class MultithreadingWithRunnableInterface 
{

	public static void main(String[] args)
	{
		Runnable obj1 = new hii();
		Runnable obj2 = new hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		 try	{ Thread.sleep(10);}catch(Exception e)	{}
		t2.start();
		
	}

}

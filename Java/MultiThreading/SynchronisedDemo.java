class Counter
{
	int count;
	public synchronized void incriment()
	{
		 count++;
	}
}
public class SynchronisedDemo 
{

	public static void  main(String[] args) throws Exception
	{
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable()
				{
			public void run()
			{
				for(int i = 0;i<1000;i++)
				{
					c.incriment();
				}
			}
			
				});
		
		Thread t2 = new Thread(new Runnable()
		{
	public void run()
	{
		for(int i = 0;i<1000;i++)
		{
			c.incriment();
		}
	}
	
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count:" +c.count);
				

	}

}

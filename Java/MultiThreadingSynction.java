class Counter
{
	int count;
	public synchronized void incriment()
	{
		count++;
	}
}
public class MultiThreadingSynction 
{

	public static void main(String[] args)throws Exception
	{
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable()
		    {
				public void run()
				{
					for (int i=1;i<=1000;i++)
					{
						c.incriment();
					}
				}
			});
		
		Thread t2 = new Thread(new Runnable()
	    {
			public void run()
			{
				for (int i=1;i<=1000;i++)
				{
					c.incriment();
				}
			}
		});

t1.start();

t1.join();

t2.start();

t2.join();
//thread t1 print 1000 value and t2 print 1000 therefore output is 2000

System.out.println("the count is:"+c.count);
	}

}

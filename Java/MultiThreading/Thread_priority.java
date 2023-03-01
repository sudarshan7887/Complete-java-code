
public class Thread_priority 
{

	public static void main(String[] args) throws Exception
	{
		Thread t1 =new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hii" +Thread.currentThread().getPriority());
					try	{ Thread.sleep(500);}catch(Exception e)	{}
			}
		});
		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
	 		{
	 			System.out.println("Hello");
	 			try	{ Thread.sleep(500);}catch(Exception e)	{}
	 		}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);  //min priority 1
		t2.setPriority(Thread.MAX_PRIORITY);  //max priority 10
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.start();
		 try	{ Thread.sleep(10);}catch(Exception e)	{}
		t2.start();
		
		 System.out.println(t1.isAlive()); 
		  //check code is running state or not if yes then true else false
		
		t1.join();
		t2.join();
		
		System.out.println("Bye!");
	}

}

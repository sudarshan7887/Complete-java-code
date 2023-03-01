
public class MUlThreading_ThreadPriority 
{
	public static void main(String[] args) throws Exception
	{
		Thread t1 = new Thread(()->                     
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hii");
				try { Thread.sleep(500);}catch (Exception e){}
			}
		}
		);           
		Thread t2 = new Thread(()->
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
	});
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);                //set priority
		
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.setName("Hii Thread");                //set thread name
		t2.setName("Hello Thread");
		
		System.out.println(t1.getName());              //get thread name
		System.out.println(t2.getName());
		
		t1.start();
		try {Thread.sleep(10);}catch (Exception e) 
		{}
		t2.start();
		
		System.out.println(t1.isAlive());          
		
		t1.join();                                 
		t2.join();
		System.out.println("Bye");
	}
}

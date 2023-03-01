
public class MulthreadingJoinAndAlive
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
	
	t1.start();
	try {Thread.sleep(10);}catch (Exception e) 
	{}
	t2.start();
	System.out.println(t1.isAlive());          //it is used to thread running state or not
	t1.join();    //used t1 join and t2 join
	t2.join();
	System.out.println("Bye");
	}

}

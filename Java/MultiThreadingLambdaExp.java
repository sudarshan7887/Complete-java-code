
public class MultiThreadingLambdaExp 
{

		public static void main(String[] args) 
		{
			
			Runnable obj1 = ()->                     //lambda expression
				{
					for(int i=1;i<=5;i++)
					{
						System.out.println("hii");
						try { Thread.sleep(500);}catch (Exception e){}
					}
				}
				;
					
			Runnable obj2 = ()->
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
			
			;
			Thread t1 = new Thread(obj1);           
			Thread t2 = new Thread(obj2);
			
			t1.start();
			try {Thread.sleep(10);}catch (Exception e) 
			{}
			t2.start();
		}
				
}


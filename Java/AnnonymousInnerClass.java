
class AB
{
	void show()
	{
		System.out.println("in A show");
	}
}

	public class AnnonymousInnerClass 
			{
				public static void main(String args[])
				{
					AB obj = new AB ()
						{
						
							public void show()
							{
								// class doesn't having any name is called annonymous class
							System.out.println("this class doesn't having any name");
							}
						};
					obj.show();
				}
			}

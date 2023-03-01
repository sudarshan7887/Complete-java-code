interface abc
{
	void show();    
	
}
public class AnnonymousClassInterface 
{

	public static void main(String[] args) 
	{
		abc obj = new abc()
				{
			public void show()                            //This is annonymous class in interfaces
			{
				System.out.println("This is interface");
			}
				};
				obj.show();

	}

}

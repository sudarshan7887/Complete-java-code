
public class enhanced_for_loop 
{
		//enhanced for loop only works on arrays and collections
	public static void main(String[] args)
	{
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
			
		}
		for(int i:a)
			System.out.println(i);

	}

}

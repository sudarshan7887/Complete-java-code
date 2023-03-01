import java.util.ArrayList;

public class CurrentTimeMills 
{

	public static void main(String[] args) 
	{
/*
		long start =System.currentTimeMillis();
		ArrayList a = new ArrayList();
		for(int i=0;i<=10000;i++)
		{
			a.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
*/
		long value = System.currentTimeMillis(); 
				//millis from jan 1st 1970
		System.out.println(value);
	}

}

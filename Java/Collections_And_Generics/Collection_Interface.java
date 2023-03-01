//Collections are used to store ,retrive,manipulate and communicate aggregate data
//Typpically they represent data items that form a natural group

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Interface 
{

	public static void main(String[] args) throws Exception
	{
//		int values[] = new int[4];
//		Object values1[] = new Object[4];
//		values1[0] = "Sudarshan";
//		values1[1] = 88;
		
		
	
		Collection values = new ArrayList();
		values.add(3);
		values.add("Sudarshan");
		values.add(22.56f);
	/*  	
		Iterator i = values.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	*/	
//		Above commented part in one line 
//		i.e. Enhanced for loop
		
		for(Object i : values)
		{
			System.out.println(i);
		}
		
		
	}

}

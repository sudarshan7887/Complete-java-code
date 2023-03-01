import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collection_Gen_Iterator
{

	public static void main(String[] args) 
	{
		
		Collection values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(47);
		
		//System.out.println(values);  //print values in one line
		
		Iterator it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());     //print values in seperate line
		}
		
		
		
	}

}

import java.util.ArrayList;
import java.util.List;

public class Coltn_Generics_with_List 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);     
		values.add(5);
		values.add(6);
		values.add(2,2);    
		
		
		for(Object o:values)    
		{
			System.out.println(o);
		}
	}

}

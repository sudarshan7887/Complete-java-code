import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class coltn_Gen_Comparator_Interface 
{

	public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<Integer>();   //list is mutable
		values.add(404);     
		values.add(908);
		values.add(639);
		values.add(265);
		
		
		Collections.sort(values,(i,j)->i%10>j%10?1:-1);  
		
		
		
		for(Integer o:values)    
		{
			System.out.println(o);
		}
	
	}

}

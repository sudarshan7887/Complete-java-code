import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coltn_Gen_ColtnClass
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();   //list is mutable
		values.add(4);     
		values.add(9);
		values.add(6);
		values.add(2);
		
		Collections.sort(values);    //sort values in asending order
		
		Collections.reverse(values);   //sort values in desending order
		
		Collections.shuffle(values);    //print random values
		
		for(Integer i:values)    
		{
			System.out.println(i);
		}

	}

}

import java.util.HashSet;
import java.util.Set;

public class coln_Gen_SetInterface 
{

	public static void main(String[] args) 
	{
		Set<Integer> values = new HashSet<>();
		values.add(5);
		values.add(7);
		values.add(4);
		values.add(7);     //it do not print 7 two times because set is unic
		
		for(int i :values)
		{
			System.out.println(i);
		}
	}

}

import java.util.Set;
import java.util.TreeSet;

public class Set_interface 
{

	public static void main(String[] args) 
	{
//		Set<Integer> values = new HashSet<>();
		Set<Integer> values = new TreeSet<>();
	/*
		values.add(2);
		values.add(3);
		values.add(5);
		values.add(3);
	*/
		//Set do not add duplicate element
		//HashSet will not give sequence of element
		//TreeSet will give a sequence of element
		System.out.println(values.add(21));
		System.out.println(values.add(9));
		System.out.println(values.add(25));
		System.out.println(values.add(9));
		for(int i : values)
		{
			System.out.println(i);
		}
		
	}

}

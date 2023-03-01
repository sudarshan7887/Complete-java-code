import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class printDulicateElement 
{

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Sudarshan");
		names.add("Abhishek");
		names.add("Vinayak");
		names.add("Sudarshan");
		names.add("Vinayak");
		
		Set<String> s = new HashSet<>();
		
		for(String name : names)
		{
			if(s.add(name)==false)
			System.out.println(name);
		}
		
	}

}

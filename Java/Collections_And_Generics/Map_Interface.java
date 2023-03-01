import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<>();
		map.put("name", "Sudarshan");
		map.put("village", "Nandur Pathar");
		map.put("actor", "john");
		
		Set<String> keys = map.keySet();
		for(String key :keys)
		{
			System.out.println(key + " " +map.get(key));
		}
		
	}

}

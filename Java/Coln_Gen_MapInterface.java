import java.util.HashMap;
import java.util.Map;



public class Coln_Gen_MapInterface 
{

	public static void main(String[] args) 
	{
		Map<String,String> Map = new HashMap<>();
		
	Map.put("Sname", "Sudarshan");
	Map.put("actor", "Akshay");
	Map.put("Sub", "Java");
	
		/*
			System.out.println(Map.get("Sname"));
			System.out.println(Map.get("actor"));
			System.out.println(Map.get("Sub"));
			
			*/
		         //or
	System.out.println(Map);
	
	}

}

import java.util.ArrayList;
import java.util.List;

public class Coltn_Gen_ListInterface 
{

	public static void main(String[] args) 
	{
		List values = new ArrayList();
		values.add(4);     //Integer v = new Integer(4)
		values.add(5);
		values.add(6);
		values.add(2,2);    //add '2' value in 2nd index
		values.add("5");
		
		for(Object o:values)    //enhanced for loop for print different wrapper class value
		{
			System.out.println(o);
		}
		
       
	}

}

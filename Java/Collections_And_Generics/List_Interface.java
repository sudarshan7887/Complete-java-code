/*
	 A list is an ordered Collection,
	 Sometimes called sequence.
	 List may contain duplicate elements.
	 The Arraylist is used for better performing better implementation
	 The add and addAll operation always append the ew element to the end of the list
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Interface 
{
			public static void main(String[] args) throws Exception
			{
				List<Integer> values = new ArrayList<Integer>();
				values.add(3);
				values.add(99);
				values.add(88);
				values.add(4);
				values.add(22);
				
					Collections.sort(values);  //Sort the above values
					
					values.forEach(System.out::println);  //Stream Api----lanbda Expression
					
					for(Object i : values)
					{
						System.out.println(i);
					}
				
				
			}

}

/* 
 vector is a type of list which implement list same as array list
 it is dynamic array in which you cabn increased size of array.
 vector increase size by zero
 
 Difference between ArrayList and vector
 vector ->
 		1)when exceed array limit it will increased capacity by 100%
 		  it waste lots of memory.
 		2) vector is thread safe
 		3) it is slow
 ArrayList ->
 		1) When exceed array limit it will increased capacity by 50%.
 		2) ArrayList is not thread safe.
 		3) it is fast.
 
*/
import java.util.Vector;
import java.util.ArrayList;
public class Vector_Vs_ArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> v = new ArrayList<>(); 
		
/* vector
		Vector<Integer> v = new Vector<>(); 

		  
		v.add(2);
		v.add(12);
		v.add(1);
		v.add(45);
		v.add(8);
		v.add(34);
		v.add(23);
		v.add(5);
		v.add(4);
		v.add(65);
		v.add(30);
		v.add(9);
		
		v.remove(1);   //remove first index element
		v.add(35);
//		System.out.println(v);
		System.out.println(v.capacity());//print capacity
*/
		System.out.println();
			for(int i :v) //enhanced for loop
			{
				System.out.println(i);
			}
			
			
	}

}

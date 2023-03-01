/* 
  Wrapper classes are used to convert any data type into an object
 The primitive data types are not objects,they do not belong to any class,they are defined in the language itself
 sometimes,it is required to convert data types into objects in java language
 Wrapping :-Converting a variable into object called wrapping and taking out the value from the object called unwrapping
 
  primitive data types            Wrapper Classes
  int								Intger
  float 							float
  double							Double
  char								Chracter
  */
import java.util.ArrayList;
public class Wrapper_classes 
{

	public static void main(String[] args) 
	{
		int i=5;
		Integer ii = new Integer(i);    //Boxing
				//This concept putting your primitive value inside an object called boxing
		
		Integer jj = i;                 //AutoBoxing
		
		int j = jj.intValue();         //unboxing
		int k = jj;                    //AutoUnboxing
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(7);
		System.out.println(values);
		
	}

}

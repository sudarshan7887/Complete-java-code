import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Consumer<Integer> c = new Consumer<Integer>()
				{
					public void accept(Integer i)
					{
						System.out.println(i);
					}
				};
		values.forEach(c);
	}

}


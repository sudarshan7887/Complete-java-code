import java.util.Arrays;
import java.util.List;

public class For_each_method 
{

	public static void main(String[] args)
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		values.forEach(i -> System.out.println(i));
	}

}

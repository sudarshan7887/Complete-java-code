import java.util.Random;
public class enhanced_for_loop_for_2d 
{

	public static void main(String[] args) 
	{
		/*
		int[] nums = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++)
		{
			nums[i]=r.nextInt(50);
		}
		for(int n : nums)
		{
			System.out.println(n);
		}
		*/
		
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		
		int p[][] = {
						{5,6,7,8},
						{6,7,8,9},
						{9,8,7,6}
		             };
		for(int i[] : p)
		{
			for(int j:i)
			{
				System.out.print(j + " ");
				
			}
			    System.out.println("");
		}

	}

}

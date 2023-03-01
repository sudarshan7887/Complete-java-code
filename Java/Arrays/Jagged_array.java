
public class Jagged_array {

	public static void main(String[] args) {
		int x[] = { 5, 6, 7, 8 };
		int y[] = { 6, 7 };
		int z[] = { 9, 8, 7 };

		int p[][] = { 
						{ 5, 6, 7, 8 }, 
						{ 6, 7 }, 
						{ 9, 8, 7 } 
				    };
		// An Array that size are not fixed called jagged array

		int k[][] = new int[3][];

		k[0] = new int[4];
		k[1] = new int[2];
		k[2] = new int[3];

		for (int i[] : p) 
		{
			for (int j : i) 
			{
				System.out.print(j + " ");

			}
			System.out.println("");
		}

	}

}


public class AlphaDiamond {

	public static void main(String[] args) {
		int j;
		for(int i = 1; i <= 3; i++)
		{
			for(j = 1; j <= 4-i; j++)
					System.out.print(" ");
			for(j = 1; j <= 2*i-1; j++)
				if(j <= i)
					System.out.print((char)(char)(j+96)+"");
				else
					System.out.print((char)(char)(2*i-j+96)+"");
			System.out.println();
		}
		for(int i = 2; i >= 1; i--)
		{
			for(j = 1; j <= 4-i; j++)
				System.out.print(" ");
			for(j = 1; j <= 2*i-1; j++)
				if(j <= i)
					System.out.print((char)(char)(j+96)+"");
				else
					System.out.print((char)(char)(2*i-j+96)+"");
		System.out.println();
		}


	}

}

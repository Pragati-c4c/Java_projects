
public class Homepattern {
	public static void main(String[] args) {

	 int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==0||i==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2)
				{
					System.out.print('*');
				}
				else// if(j-i<=(n-1)/2)
				{
					System.out.print(' ');
				}
			}
			System.out.println(' ');
}
	}
}

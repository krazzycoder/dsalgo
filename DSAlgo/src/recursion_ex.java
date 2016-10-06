
public class recursion_ex 
{
	public static void main(String args[])
	{
	   int m=sum(23);
	   System.out.println("The sum of the entered number is "+m);
	}
	
	static int sum(int n)
	{
		if (n==1)
		{
			System.out.println();
			return 1;
			
			}
		
		System.out.print(" "+n);
		return n+sum(n-1);
	}
}

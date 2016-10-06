import java.util.Scanner;


public class binarY_poosi 
{
	static int arr[];
	public static void main(String args[])
	{
		System.out.println("Enter the number of bits in combination");
		int n=new Scanner(System.in).nextInt();
		arr=new int[n];
		binary(n);
	}
	
	static void binary(int n)
	{
		if(n<1)
			{
			for(int i=0;i<arr.length;i++)
			   System.out.print(arr[i]+"");
			System.out.println();
			}
		else
		{
			arr[n-1]=0;
			binary(n-1);
			arr[n-1]=1;
			binary(n-1);
		}
	}
}

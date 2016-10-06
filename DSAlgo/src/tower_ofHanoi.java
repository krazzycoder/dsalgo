import java.util.Scanner;



public class tower_ofHanoi 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of disks");
		
		int noofdisks=scanner.nextInt();

		System.out.println("\n Method of moving "+noofdisks+" from source peg to destination peg using TOH \n");
		_toh(noofdisks,'S','I','D');
		
	}
	
	static void _toh(int disks,char from,char inter,char to)
	{
		if(disks==1)
		{
			System.out.println("Disk 1 from "+from+" to "+to);
			return;
		}
		
		_toh(disks-1,from,to,inter);
		System.out.println("Disk "+disks+" from "+from+" to "+to);
		_toh(disks-1,inter,from,to);
	}
}

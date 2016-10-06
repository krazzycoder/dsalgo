import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class multiplication_basic 
{
	static int num1,num2;
	static int mult_finalvalue;
  public static void main(String args[])
  {
	int digit1=0,digit2=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the More than One Digit Number");
	 System.out.println("Enter the First number");
	 num1=sc.nextInt();
	 System.out.println("Enter the Second number");
	 num2=sc.nextInt();
	 
	
	 long instant1=System.nanoTime();
	 int multipli_val=num1*num2;
	 long instant2=System.nanoTime();
	 System.out.println("The Time taken in naked Multiplication is "+(instant2-instant1));
	 System.out.println("The multiplication of the entered number is "+(multipli_val));
	 
	 long start_execution=System.nanoTime();
	 
	 ArrayList<Integer> arr1=new ArrayList<Integer>();
	 
	 int temp1=num1;
	 while(temp1>0){
		 arr1.add(temp1%10);
		 digit1++;
		 temp1/=10;
	 }
	 
	 ArrayList<Integer> arr2=new ArrayList<Integer>();
	 int temp2=num2;
	 while(temp2>0){
		 arr2.add(temp2%10);
		 digit2++;
		 temp2/=10;
	 }
	 
	
	 System.out.println("******************");
	for(int i=0;i<arr1.size();i++)
		System.out.print(" "+arr1.get(i));
	System.out.println();
	for(int i=0;i<arr2.size();i++)
		System.out.print(" "+arr2.get(i));
	System.out.println("**************");
	 
	 
	int carry=0,mul_step=0;
	if(digit1>=digit2)
	{
		System.out.println("Entering the if Case !");
	//	int numarr[]=new int[digit2];
		for(int i=0;i<arr2.size();i++)
		{
			for(int j=0;j<arr1.size();j++)
			{
				
				int l=__prod(arr1.get(j),arr2.get(i));
				if((j==arr1.size()-1))
			    	mul_step+=(l+carry)*Math.pow(10,j);
				else
					mul_step+=(l%10+carry)*Math.pow(10,j);
				carry=findCarry(l);
				//if(i==0)
				//	System.out.println("num1="+arr1.get(j)+" num2="+arr2.get(i)+" num="+l+" carry="+carry);
				
			}
			
			mult_finalvalue+=mul_step*Math.pow(10,i);
			//System.out.println(""+(mul_step*Math.pow(10,i)));
			mul_step=0;
			carry=0;
		}
		
	}
	else
	{
		System.out.println("Entering the else Case !");
		carry=0;
		mul_step=0;
		//int numarr[]=new int[digit2];
		for(int i=0;i<arr1.size();i++)
		{
			for(int j=0;j<arr2.size();j++)
			{
				int l=__prod(arr1.get(i),arr2.get(j));
				if((j==arr2.size()-1))
			    	mul_step+=(l+carry)*Math.pow(10,j);
				else
					mul_step+=(l%10+carry)*Math.pow(10,j);
				carry=findCarry(l);
			}
			
			mult_finalvalue+=mul_step*Math.pow(10,i);
			//System.out.println(""+(mul_step*Math.pow(10,i)));
			mul_step=0;
			carry=0;
		}
	}
	
    long end_execution=System.nanoTime();
    System.out.println("The Time of the Execution is "+(end_execution-start_execution));
    long factor=(end_execution-start_execution)/(instant2-instant1);
    System.out.println("The Value of the Complexity Factor is "+factor);
    System.out.println("The Value of the multiplication is "+mult_finalvalue);
    
	 
	
  }
  
  static int findCarry(int num)
  {
	  int counter=0;
	  int dig_num[]=new int[2];
	  
	  while(num>0)
	  {
		  dig_num[counter]=num%10;
		  counter++;
		  num=num/10;
	  }
	  
	  return dig_num[1];
  }
  
  static int __prod(int num1,int num2)
  {
	  int less=0,sum=0,more=0;
	 if(num1<=num2)
	 {
		 less=num1;
		 more=num2;
	 }
	 else
	 {
		 less=num2;
		 more=num1;
	 }
	 
	  for(int i=1;i<=less;i++)
		  sum+=more;
	  return sum;
  }
}

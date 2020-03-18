//1//

import java.util.Scanner;

public class P1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(j<x-i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
//2//

import java.util.Scanner;

//public class Prime1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int y=Prime.sum(x);
		System.out.println(y);
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;   
		}
		else
		{
		 int r=n%10;
		 int q=n/10;
		 return r + sum(q);
		}
	}
}

//3//

import java.util.Scanner;

public class Prime2{
    public static void main(String[] args)
	{    Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char []a1=s1.toCharArray();
		char []a2=s2.toCharArray();
		boolean flag=true;
		  for(int i=0;i<a1.length;i++) 
		  { 
			  if(a1[i]==a2[i])
			  {
				  continue; 
			  } 
			  else
			  {
				  int x=a1[i]-a2[i];
				  System.out.println("Not equal "+" "+x);
				  flag=false;
				  break;
			  }		    
		 }
		  if(flag)
		  System.out.println("Equal");	
	}
}


//4//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime11{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next().toLowerCase();
		String s2=sc.next().toLowerCase();
		char []a1=s1.toCharArray();
		char []a2=s2.toCharArray();
		Arrays.parallelSort(a1);
		Arrays.parallelSort(a2);
		String s3=new String(a1);
		String s4=new String(a2);
		if(s3.equals(s4))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	
	}
}









//5//



//6//
class Prime4
public static void main(String[] args)
{   
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  the No.");
	int x=sc.nextInt();
	
	int c=0;
	int y=Prime.binary(x,c);
	System.out.println(y);
}
public static int binary(int n,int z)
{
	if(n==0)
	{
		return z;
	}
	int r=n%2;
	int q=n/2;
	if(r==1)
	{
		z++;
	}
	return binary(q,z);
}


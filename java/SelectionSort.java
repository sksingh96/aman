public class SelectionSort {
	public static void swap(int ar[],int j,int i)
	{
		int temp=ar[i];
		ar[i]=ar[j+1];
		ar[j+1]=temp;
	}	
	public static void main(String []a)
	{
		int []ss= {12,25,10,4,2,8};
		int n=ss.length;
		for(int x:ss)		
			System.out.print(x+" ");
		System.out.println();
		System.out.println("+++++++++++++++");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				if(ss[i]>ss[j+1])
				{
					swap(ss,j,i);				
				}
			}
			for(int x:ss)		
				System.out.print(x+" ");		
			System.out.println();
			System.out.println("----------------");
			
		}	
		
	}
}

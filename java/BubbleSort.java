
public class BubbleSort {
	public static void swap(int arr[],int j)
	{
		int temp;
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		
		
	}
	public static void main(String []a)
	{
		
		int []ar= {12,25,10,4,2,8};
		
	    int n=ar.length;
	    for(int i:ar)
			System.out.print(i+" ");
	    System.out.println();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					swap(ar,j);
				}
				for(int x:ar)
					System.out.print(x+" ");
				System.out.println();			
			}
			System.out.println("-----------------");	
		}
		
	}

}
